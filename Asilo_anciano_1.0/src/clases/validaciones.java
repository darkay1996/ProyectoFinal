/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Bryan
 */
public class validaciones {

    public boolean validar_cedula(String aux) {
        boolean validar=aux.matches("^\\d{10}$");
        return validar;
    }

    public boolean validar_nombre_apellido(String aux) {
        return aux.matches("^[a-zA-Z]{3,20}");
    }

    public boolean validarCorreo(String mail) {
        boolean val = false;
        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{1,30})$");

        // El email a validar
        Matcher mather = pattern.matcher(mail);
        val = mather.find();

        return val;
    }

    public boolean validarDireccion(String direccion) {
        direccion = direccion.trim();//trim()
        boolean validar = direccion.matches("([\\w\\s]+\\-*+\\#*)*");
        return validar;
    }
    
    public boolean validarNombresEspacios(String cadena) {
        cadena = cadena.trim();//trim()
        boolean validar = cadena.matches("[A-Za-z\\s]*");
        return validar;
    }
    
     public boolean validarTelefono(String telefono) {
        boolean validar = false;
        if (telefono.matches("[0-9]{10}")) {
                validar = true;
        }
        return validar;
    }
}
