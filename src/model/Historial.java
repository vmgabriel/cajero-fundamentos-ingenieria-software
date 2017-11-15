package model;

import java.util.Date;

/**
 *
 * @author gabriel
 */
public class Historial 
{
    private int id;
    private String tipo;
    private Date fecha;
    private int montoATranzar;
    private String direccionSalida;
    private int idCuenta;

    public Historial(int id, String tipo, Date fecha, int montoATranzar, String direccionSalida, int idCuenta) {
        this.id = id;
        this.tipo = tipo;
        this.fecha = fecha;
        this.montoATranzar = montoATranzar;
        this.direccionSalida = direccionSalida;
        this.idCuenta = idCuenta;
    }

    public Historial(String tipo, Date fecha, int montoATranzar, String direccionSalida, int idCuenta) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.montoATranzar = montoATranzar;
        this.direccionSalida = direccionSalida;
        this.idCuenta = idCuenta;
    }

    public Historial() {
    }
    
    

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getMontoATranzar() {
        return montoATranzar;
    }

    public String getDireccionSalida() {
        return direccionSalida;
    }

    public int getIdCuenta() {
        return idCuenta;
    }
}
