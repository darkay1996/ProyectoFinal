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
public class medicamentos {
    private String codigo_medicamento;
    private String nombre_medicamento;

    public medicamentos() {
    }

    public medicamentos(String codigo_medicamento, String nombre_medicamento) {
        this.codigo_medicamento = codigo_medicamento;
        this.nombre_medicamento = nombre_medicamento;
    }

    public String getCodigo_medicamento() {
        return codigo_medicamento;
    }

    public void setCodigo_medicamento(String codigo_medicamento) {
        this.codigo_medicamento = codigo_medicamento;
    }

    public String getNombre_medicamento() {
        return nombre_medicamento;
    }

    public void setNombre_medicamento(String nombre_medicamento) {
        this.nombre_medicamento = nombre_medicamento;
    }
    
    
}
