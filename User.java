/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 *
 * @author Administrador
 */
public class User {
private String nombre;
private String user;
private String pass;
private int id_granja;
private String rol;
private int funcionalidad;
private String modo;

    public User(String nombre, String user, String pass, int id_granja, String rol, int funcionalidad, String modo) {
        this.nombre = nombre;
        this.user = user;
        this.pass = pass;
        this.id_granja = id_granja;
        this.rol = rol;
        this.funcionalidad = funcionalidad;
        this.modo = modo;
    }

    public int getFuncionalidad() {
        return funcionalidad;
    }

    public void setFuncionalidad(int funcionalidad) {
        this.funcionalidad = funcionalidad;
    }

    public int getId_granja() {
        return id_granja;
    }

    public void setId_granja(int id_granja) {
        this.id_granja = id_granja;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

  
}
