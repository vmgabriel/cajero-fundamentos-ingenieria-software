package model;

import java.util.Date;

/**
 *
 * @author gabriel
 */
public class Cuenta 
{
    private int id;
    private String tipo;
    private int codigo;
    private Date fechaInscripcion;
    private int monto;
    private int clave;
    private int cedula;

    public Cuenta(int id, String tipo, int codigo, Date fechaInscripcion, int monto, int clave, int cedula) {
        this.id = id;
        this.tipo = tipo;
        this.codigo = codigo;
        this.fechaInscripcion = fechaInscripcion;
        this.monto = monto;
        this.clave = clave;
        this.cedula = cedula;
    }

    public Cuenta(String tipo, int codigo, Date fechaInscripcion, int monto, int clave, int cedula) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.fechaInscripcion = fechaInscripcion;
        this.monto = monto;
        this.clave = clave;
        this.cedula = cedula;
    }

    public Cuenta() {
    }
    
    //GETTER
    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public int getMonto() {
        return monto;
    }

    public int getClave() {
        return clave;
    }

    public int getCedula() {
        return cedula;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
