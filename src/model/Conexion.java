package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author gabriel
 */
public class Conexion 
{
    private String cadena = "jdbc:postgresql:";
    private String user = "postgres";
    private String pass = "admin";
    private String base = "Cajero";
    private String direccion = "127.0.0.1";//localhost
    //private String puerto = "0000";
    private Connection conexion = null;
    private Statement sentencia = null;
    private ResultSet resultado = null;

    public Conexion() {
    }
    
    public void realizarConexion(){
        try{
            Class.forName("org.postgresql.Driver");
            this.conexion = DriverManager.getConnection(this.cadenaConexion(), 
                user, pass);
            if (conexion !=null){
            }
        }
        catch(Exception e){
            System.out.println("Ocurrio un error : "+e.getMessage());
        }
    }
    
    public boolean insertQueryValue(String query){
        try{
            this.sentencia = this.conexion.createStatement();
            this.sentencia.executeUpdate(query);
        }
        catch(Exception e){
            return false;
        }
        return true;
    }
    
    public ResultSet consultaQueryValue(String query){
        try{
            this.sentencia = this.conexion.createStatement();
            this.resultado = this.sentencia.executeQuery(query);
        }
        catch(Exception e){
            return this.resultado;
        }
        return this.resultado;
    }
    
    public void cierraConexion(){
        try{
            this.conexion.close();
        }catch(Exception e){
            System.out.println("Problema para cerrar la Conexión a la base de datos");
        }
    }
    
    private String cadenaConexion(){
        //return this.cadena+"//"+this.direccion+":"+this.puerto+"/"+this.base;
        return this.cadena+"//"+this.direccion+"/"+this.base;
    }
}
