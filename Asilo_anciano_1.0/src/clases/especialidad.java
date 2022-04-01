/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Usuario
 */
public class especialidad {
    private String nombre_especialidad;
    private String codigo_especialidad;

    public especialidad() {
    }

    public especialidad(String nombre_especialidad, String codigo_especialidad) {
        this.nombre_especialidad = nombre_especialidad;
        this.codigo_especialidad = codigo_especialidad;
    }

    public String getNombre_especialidad() {
        return nombre_especialidad;
    }

    public void setNombre_especialidad(String nombre_especialidad) {
        this.nombre_especialidad = nombre_especialidad;
    }

    public String getCodigo_especialidad() {
        return codigo_especialidad;
    }

    public void setCodigo_especialidad(String codigo_especialidad) {
        this.codigo_especialidad = codigo_especialidad;
    }
    
    
}
