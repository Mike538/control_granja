/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Administrador
 */
public class Cultivo {

    private String nombre;
    private String nombre_cientifico;
    private int tiempo_cosecha;
    private int cant_postura;
    private String estado;

    public Cultivo(String nombre, String nombre_cientifico, int tiempo_cosecha, int cant_postura, String estado) {
        this.nombre = nombre;
        this.nombre_cientifico = nombre_cientifico;
        this.tiempo_cosecha = tiempo_cosecha;
        this.cant_postura = cant_postura;
        this.estado = estado;
    }

    public int getCant_postura() {
        return cant_postura;
    }

    public void setCant_postura(int cant_postura) {
        this.cant_postura = cant_postura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_cientifico() {
        return nombre_cientifico;
    }

    public void setNombre_cientifico(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }

    public int getTiempo_cosecha() {
        return tiempo_cosecha;
    }

    public void setTiempo_cosecha(int tiempo_cosecha) {
        this.tiempo_cosecha = tiempo_cosecha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
