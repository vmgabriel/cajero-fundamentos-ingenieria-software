package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Conexion;
import model.Cuenta;

/**
 *
 * @author gabriel
 */
public class EveFrmSaldoDisponible {
    private Conexion conexion;
    private Cuenta cuenta;

    public EveFrmSaldoDisponible(Conexion conexion, Cuenta cuenta) {
        this.conexion = conexion;
        this.cuenta = cuenta;
    }
    
    public String obtenerSaldo(){
        String id = this.cuenta.getId()+"";
        String query = "SELECT montototal FROM Cuenta WHERE id = "+id+";";
        this.conexion.realizarConexion();
        ResultSet a = this.conexion.consultaQueryValue(query);
        try {
            a.next();
            return a.getString(1);
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
            return "0";
        }
    }
}
