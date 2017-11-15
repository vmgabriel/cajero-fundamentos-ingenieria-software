/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Calendar;
import java.util.GregorianCalendar;
import model.Conexion;
import model.Cuenta;
import model.Historial;
import model.Tarjeta;

/**
 *
 * @author gabriel
 */
public class EveFrmConsignacion {
    private Conexion conector;
    private Cuenta cuenta;
    
    public EveFrmConsignacion(Conexion conector, Cuenta cuenta) {
        this.conector = conector;
        this.cuenta = cuenta;
    }
    
    public boolean enviarConsignacion(String saldo)
    {
        int idCuenta = this.cuenta.getId();
        Calendar c = new GregorianCalendar();
        String fechaHoy = Integer.toString(c.get(Calendar.YEAR))+"-"+
                Integer.toString(c.get(Calendar.MONTH))+"-"+
                Integer.toString(c.get(Calendar.DATE));
        String query = "INSERT INTO Historial(tipo,fecha,montoatransar,"
                + "direccionsalida,id_cuenta) VALUES ('Consignacion',"
                + " '"+fechaHoy+"', "+Integer.parseInt(saldo)+","
                + " 'calle 33A n 22-12sur', "+idCuenta+")";
        this.conector.realizarConexion();
        boolean a = this.conector.insertQueryValue(query);
        this.conector.cierraConexion();
        query = "UPDATE Cuenta SET montototal = montototal+" +
                Integer.parseInt(saldo)+" WHERE id = "+idCuenta+";";
        this.conector.realizarConexion();
        a = a && this.conector.insertQueryValue(query);
        this.conector.cierraConexion();
        return a;
    }
}
