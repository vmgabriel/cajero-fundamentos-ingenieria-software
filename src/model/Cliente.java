package model;

import java.util.Date;

/**
 *
 * @author gabriel
 */
public class Cliente 
{
    private int cedula;
    private String nombre;
    private String apellido;
    private Date fechaInscripcion;
    private Date fechaNacimiento;
    private String direccion;
    private String correo;
    private int telefono;
    private int sucursal;

    public Cliente(int cedula, String nombre, String apellido, Date fechaInscripcion, Date fechaNacimiento, String direccion, String correo, int telefono, int sucursal) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaInscripcion = fechaInscripcion;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.sucursal = sucursal;
    }

    //GETTER
    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getSucursal() {
        return sucursal;
    } 
}
