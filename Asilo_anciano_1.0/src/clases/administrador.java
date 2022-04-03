
package clases;


public class administrador extends persona {

    
    private String nivel_educacion;
    private int cod_usuario;
    
    public administrador() {
        super();
    }

    public administrador(String nivel_educacion, int cod_usuario) {
        this.nivel_educacion = nivel_educacion;
        this.cod_usuario = cod_usuario;
    }

   

    public administrador(String nivel_educacion, String codigo, String cedula, String pri_nomb, String seg_nombre, String prim_apell, String seg_apelli, String correo, String genero, String fecha_Nacimiento, String direccion, String telefono, String tipo_sangre) {
        super(codigo, cedula, pri_nomb, seg_nombre, prim_apell, seg_apelli, correo, genero, fecha_Nacimiento, direccion, telefono, tipo_sangre);
        this.nivel_educacion = nivel_educacion;
    }

    public String getNivel_educacion() {
        return nivel_educacion;
    }

    public void setNivel_educacion(String nivel_educacion) {
        this.nivel_educacion = nivel_educacion;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

}
