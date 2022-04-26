/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;



/**
 *
 * @author Administrador
 */
public class Granja {
private String direccion;
private String nombre;
private String estado;

    public Granja(String direccion, String nombre, String estado) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
