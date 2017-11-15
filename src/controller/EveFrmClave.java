package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import model.Conexion;
import model.Historial;
import model.Cuenta;
import model.Tarjeta;

/**
 *
 * @author gabriel
 */
public class EveFrmClave {
    private Conexion conector;
    private Historial historia;
    private Cuenta cuenta;
    private Tarjeta tarjeta;

    public EveFrmClave(Conexion conector, Historial historia, Cuenta cuenta, Tarjeta tarjeta) {
        this.conector = conector;
        this.historia = historia;
        this.cuenta = cuenta;
        this.tarjeta = tarjeta;
    }
    
    public boolean revisarClave(String valor){
        int val = Integer.parseInt(valor);
        if (val>9999 && val<100000){
            return true;
        }
        return false;
    }
    
    public boolean consultarClave(String clave){
        String tarjetaRSA = this.tarjeta.getClaveRSA();
        String tarjetaCodigo = this.tarjeta.getClaveCuenta();
        String query = "SELECT * FROM Cuenta,Tarjeta WHERE clave = "+clave+" AND"+
                " clavecuenta = '"+tarjetaCodigo+"' AND claversa = '"+tarjetaRSA+"';";
        this.conector.realizarConexion();
        ResultSet a = this.conector.consultaQueryValue(query);
        try {
            a.next();
            if (a.getRow() == 1){
                this.conector.cierraConexion();
                return true;
            }
            else{
            this.conector.cierraConexion();
            return false;
            }
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
            return false;
        }
    }
    
    public boolean generarErrorHistoria(){
        String tarjetaRSA = this.tarjeta.getClaveRSA();
        String tarjetaCodigo = this.tarjeta.getClaveCuenta();
        Calendar c = new GregorianCalendar();
        String fechaHoy = Integer.toString(c.get(Calendar.YEAR))+"-"+
                Integer.toString(c.get(Calendar.MONTH))+"-"+
                Integer.toString(c.get(Calendar.DATE));
        String query = "INSERT INTO Historial(tipo,fecha,montoatransar,"
                + "direccionsalida,id_cuenta) "
                + "VALUES('error', '"+fechaHoy+"', 0, 'Calle 3 n 3-33',("
                + "SELECT id FROM Tarjeta WHERE clavecuenta = '"+tarjetaCodigo
                + "' AND claversa = '"+tarjetaRSA+"'));";
        this.conector.realizarConexion();
        boolean a = this.conector.insertQueryValue(query);
        this.conector.cierraConexion();
        query = "UPDATE Tarjeta SET intentos = intentos-1 WHERE clavecuenta = '"
                + tarjetaCodigo+"' AND claversa = '"+tarjetaRSA+"';";
        this.conector.realizarConexion();
        a = a && this.conector.insertQueryValue(query);
        this.conector.cierraConexion();
        return a;
    }
    
    public void construirCuenta(){
        String tarjetaRSA = this.tarjeta.getClaveRSA();
        String tarjetaCodigo = this.tarjeta.getClaveCuenta();
        String query = "SELECT * FROM Cuenta WHERE id = (SELECT id FROM Tarjeta "
                + "WHERE clavecuenta = '"+tarjetaCodigo+"' AND claversa = '"
                + tarjetaRSA+"');";
        this.conector.realizarConexion();
        ResultSet a = this.conector.consultaQueryValue(query);
        try {
            a.next();
            this.cuenta.setId(a.getInt(1));
            this.cuenta.setTipo(a.getString(2));
            this.cuenta.setCodigo(a.getInt(3));
            this.cuenta.setFechaInscripcion(a.getDate(4));
            this.cuenta.setMonto(a.getInt(5));
            this.cuenta.setClave(a.getInt(6));
            this.cuenta.setCedula(a.getInt(7));
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
        this.conector.cierraConexion();
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
}
