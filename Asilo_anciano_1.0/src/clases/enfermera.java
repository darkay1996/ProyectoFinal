package clases;

public class enfermera extends persona{
    
    private String año_ecperiencia;
    private int cod_usuario;

    public enfermera() {
        super();
    }

    public enfermera(String año_ecperiencia, int cod_usuario) {
        this.año_ecperiencia = año_ecperiencia;
        this.cod_usuario = cod_usuario;
    }

    public enfermera(String año_ecperiencia, int cod_usuario, String codigo, String cedula, String pri_nomb, String seg_nombre, String prim_apell, String seg_apelli, String correo, String genero, String fecha_Nacimiento, String direccion, String telefono, String tipo_sangre) {
        super(codigo, cedula, pri_nomb, seg_nombre, prim_apell, seg_apelli, correo, genero, fecha_Nacimiento, direccion, telefono, tipo_sangre);
        this.año_ecperiencia = año_ecperiencia;
        this.cod_usuario = cod_usuario;
    }

    public String getAño_ecperiencia() {
        return año_ecperiencia;
    }

    public void setAño_ecperiencia(String año_ecperiencia) {
        this.año_ecperiencia = año_ecperiencia;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }
}
