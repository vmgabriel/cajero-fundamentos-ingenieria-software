/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import model.Conexion;
import model.Cuenta;

/**
 *
 * @author gabriel
 */
public class EveTransaccion 
{
    private Conexion conector;
    private Cuenta cuenta;
    
    public EveTransaccion(Conexion conector, Cuenta cuenta)
    {
        this.conector = conector;
        this.cuenta = cuenta;
    }
    
    public boolean controlarValor(int valor)
    {
        int monto=0;
        String id = this.cuenta.getId()+"";
        String query = "SELECT montototal FROM Cuenta WHERE id = "+id+";";
        this.conector.realizarConexion();
        ResultSet a = this.conector.consultaQueryValue(query);
        try {
            a.next();
            monto=a.getInt(1);
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
            monto=0;
        }
        this.conector.cierraConexion();
        return monto>=valor;
    }
    
    public boolean enviarTransaccion(int valor)
    {
        int idCuenta = this.cuenta.getId();
        Calendar c = new GregorianCalendar();
        String fechaHoy = Integer.toString(c.get(Calendar.YEAR))+"-"+
                Integer.toString(c.get(Calendar.MONTH))+"-"+
                Integer.toString(c.get(Calendar.DATE));
        String query = "INSERT INTO Historial(tipo,fecha,montoatransar,"
                + "direccionsalida,id_cuenta) VALUES ('Transaccion',"
                + " '"+fechaHoy+"', -"+valor+","
                + " 'calle 33A n 22-12sur', "+idCuenta+")";
        this.conector.realizarConexion();
        boolean a = this.conector.insertQueryValue(query);
        this.conector.cierraConexion();
        query = "UPDATE Cuenta SET montototal = montototal-" +
                valor+" WHERE id = "+idCuenta+";";
        this.conector.realizarConexion();
        a = a && this.conector.insertQueryValue(query);
        this.conector.cierraConexion();
        return a;
    }
}
