/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Bryan
 */
public class usuario {

    private int usuario;
    private int contraseña;

    public usuario(int usuario, int contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public usuario() {
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }
    
    

}
