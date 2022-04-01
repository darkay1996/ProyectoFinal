/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class cita_medica {
    private String codigo_citas;
    private String codigo_paciente;
    private String codigo_medico;
    private Date fecha_cita;
    private int hora_inicio;
    private int hora_fin;

    public cita_medica() {
    }

    public cita_medica(String codigo_citas, String codigo_paciente, String codigo_medico, Date fecha_cita, int hora_inicio, int hora_fin) {
        this.codigo_citas = codigo_citas;
        this.codigo_paciente = codigo_paciente;
        this.codigo_medico = codigo_medico;
        this.fecha_cita = fecha_cita;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
    }

    public String getCodigo_citas() {
        return codigo_citas;
    }

    public void setCodigo_citas(String codigo_citas) {
        this.codigo_citas = codigo_citas;
    }

    public String getCodigo_paciente() {
        return codigo_paciente;
    }

    public void setCodigo_paciente(String codigo_paciente) {
        this.codigo_paciente = codigo_paciente;
    }

    public String getCodigo_medico() {
        return codigo_medico;
    }

    public void setCodigo_medico(String codigo_medico) {
        this.codigo_medico = codigo_medico;
    }

    public Date getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(Date fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(int hora_fin) {
        this.hora_fin = hora_fin;
    }
    
    
    
}
