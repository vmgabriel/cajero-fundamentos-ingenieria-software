package model;

import java.util.Date;

/**
 *
 * @author gabriel
 */
public class Tarjeta 
{
    private int id;
    private String tipo;
    private String claveRSA;
    private String claveCuenta;
    private Date fechaCreacion;
    private Date fechaSalida;
    private int intentos;
    private int idCuenta;

    public Tarjeta(int id, String tipo, String claveRSA, String claveCuenta, Date fechaCreacion, Date fechaSalida, int intentos, int idCuenta) {
        this.id = id;
        this.tipo = tipo;
        this.claveRSA = claveRSA;
        this.claveCuenta = claveCuenta;
        this.fechaCreacion = fechaCreacion;
        this.fechaSalida = fechaSalida;
        this.intentos = intentos;
        this.idCuenta = idCuenta;
    }

    public Tarjeta(String tipo, String claveRSA, String claveCuenta, Date fechaCreacion, Date fechaSalida, int intentos, int idCuenta) {
        this.tipo = tipo;
        this.claveRSA = claveRSA;
        this.claveCuenta = claveCuenta;
        this.fechaCreacion = fechaCreacion;
        this.fechaSalida = fechaSalida;
        this.intentos = intentos;
        this.idCuenta = idCuenta;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getClaveRSA() {
        return claveRSA;
    }

    public String getClaveCuenta() {
        return claveCuenta;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public int getIntentos() {
        return intentos;
    }

    public int getIdCuenta() {
        return idCuenta;
    }
}
