package controller;

import java.sql.ResultSet;
import model.Conexion;

/**
 *
 * @author gabriel
 */
public class EveFrmHistorial {
    private Conexion conexion;

    public EveFrmHistorial(Conexion conexion){
        this.conexion = conexion;
    }
    
    public ResultSet obtenerHistorial(int id){
        String query = "SELECT * FROM Cuenta WHERE id = "+id+";";
        this.conexion.realizarConexion();
        ResultSet a = this.conexion.consultaQueryValue(query);
        this.conexion.cierraConexion();
        return a;
    }
}
