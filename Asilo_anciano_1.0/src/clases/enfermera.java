package clases;

public class enfermera extends persona{
    
    private String año_ecperiencia;

    public enfermera() {
    }

    public enfermera(String año_ecperiencia) {
        this.año_ecperiencia = año_ecperiencia;
    }

    public enfermera(String año_ecperiencia, String id, String cedula, String pri_nomb, String seg_nombre, String prim_apell, String seg_apelli, String edad, String direccion, String correo, String telefono, String genero, String tipo_sangre) {
        super(id, cedula, pri_nomb, seg_nombre, prim_apell, seg_apelli, edad, direccion, correo, telefono, genero, tipo_sangre);
        this.año_ecperiencia = año_ecperiencia;
    }

    public String getAño_ecperiencia() {
        return año_ecperiencia;
    }

    public void setAño_ecperiencia(String año_ecperiencia) {
        this.año_ecperiencia = año_ecperiencia;
    }
    
    
}
