
package clases;


public class doctor extends persona{
    
    private String especialidad;
    private int cod_usuario;
    
    public doctor() {
        super();
    }

    public doctor(String especialidad, int cod_usuario) {
        this.especialidad = especialidad;
        this.cod_usuario = cod_usuario;
    }

    public doctor(String especialidad, int cod_usuario, String codigo, String cedula, String pri_nomb, String seg_nombre, String prim_apell, String seg_apelli, String correo, String genero, String fecha_Nacimiento, String direccion, String telefono, String tipo_sangre) {
        super(codigo, cedula, pri_nomb, seg_nombre, prim_apell, seg_apelli, correo, genero, fecha_Nacimiento, direccion, telefono, tipo_sangre);
        this.especialidad = especialidad;
        this.cod_usuario = cod_usuario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }
}
