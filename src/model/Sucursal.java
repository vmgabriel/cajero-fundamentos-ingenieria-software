package model;

/**
 *
 * @author gabriel
 */
public class Sucursal 
{
    private int id;
    private String nombre;
    private String direccion;
    private int telefono;
    private String ciudad;
    private String nombreGerente;

    public Sucursal(int id, String nombre, String direccion, int telefono, String ciudad, String nombreGerente) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.nombreGerente = nombreGerente;
    }

    public Sucursal(String nombre, String direccion, int telefono, String ciudad, String nombreGerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.nombreGerente = nombreGerente;
    }
    
    //GETTERS
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getNombreGerente() {
        return nombreGerente;
    }
}
