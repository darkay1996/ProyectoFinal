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
public class FichaMedica extends persona {
    private String codigo_ficha_medica;
    private String codigo_paciente;
    private String enfermedades;
    private String alergias;
    private String observaciones;
    private Date fecha_actual;
    private String seguromedico;
    private Date fecha_nacimiento;
    private String codigo_enfermedad;
    private String codigo_alergia;

    public FichaMedica() {
        super();
    }

    public FichaMedica(String codigo_ficha_medica, String codigo_paciente, String enfermedades, String alergias, String observaciones, Date fecha_actual, String seguromedico, Date fecha_nacimiento, String codigo_enfermedad, String codigo_alergia) {
        this.codigo_ficha_medica = codigo_ficha_medica;
        this.codigo_paciente = codigo_paciente;
        this.enfermedades = enfermedades;
        this.alergias = alergias;
        this.observaciones = observaciones;
        this.fecha_actual = fecha_actual;
        this.seguromedico = seguromedico;
        this.fecha_nacimiento = fecha_nacimiento;
        this.codigo_enfermedad = codigo_enfermedad;
        this.codigo_alergia = codigo_alergia;
    }

    public FichaMedica(String codigo_ficha_medica, String codigo_paciente, String enfermedades, String alergias, String observaciones, Date fecha_actual, String seguromedico, Date fecha_nacimiento, String codigo_enfermedad, String codigo_alergia, String id, String cedula, String pri_nomb, String seg_nombre, String prim_apell, String seg_apelli, String edad, String direccion, String correo, String telefono, String genero, String tipo_sangre) {
        super(id, cedula, pri_nomb, seg_nombre, prim_apell, seg_apelli, edad, direccion, correo, telefono, genero, tipo_sangre);
        this.codigo_ficha_medica = codigo_ficha_medica;
        this.codigo_paciente = codigo_paciente;
        this.enfermedades = enfermedades;
        this.alergias = alergias;
        this.observaciones = observaciones;
        this.fecha_actual = fecha_actual;
        this.seguromedico = seguromedico;
        this.fecha_nacimiento = fecha_nacimiento;
        this.codigo_enfermedad = codigo_enfermedad;
        this.codigo_alergia = codigo_alergia;
    }

    public String getCodigo_ficha_medica() {
        return codigo_ficha_medica;
    }

    public void setCodigo_ficha_medica(String codigo_ficha_medica) {
        this.codigo_ficha_medica = codigo_ficha_medica;
    }

    public String getCodigo_paciente() {
        return codigo_paciente;
    }

    public void setCodigo_paciente(String codigo_paciente) {
        this.codigo_paciente = codigo_paciente;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFecha_actual() {
        return fecha_actual;
    }

    public void setFecha_actual(Date fecha_actual) {
        this.fecha_actual = fecha_actual;
    }

    public String getSeguromedico() {
        return seguromedico;
    }

    public void setSeguromedico(String seguromedico) {
        this.seguromedico = seguromedico;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCodigo_enfermedad() {
        return codigo_enfermedad;
    }

    public void setCodigo_enfermedad(String codigo_enfermedad) {
        this.codigo_enfermedad = codigo_enfermedad;
    }

    public String getCodigo_alergia() {
        return codigo_alergia;
    }

    public void setCodigo_alergia(String codigo_alergia) {
        this.codigo_alergia = codigo_alergia;
    }

            
            
}