package clases;


public class paciente extends persona{
    
    private String fecha_de_ingreso;
    private String Seguro;
    

    public paciente() {
        super();
    }

    public paciente(String fecha_de_ingreso, String Seguro) {
        this.fecha_de_ingreso = fecha_de_ingreso;
        this.Seguro = Seguro;
    }

    public paciente(String fecha_de_ingreso, String Seguro, String codigo, String cedula, String pri_nomb, String seg_nombre, String prim_apell, String seg_apelli, String correo, String genero, String fecha_Nacimiento, String direccion, String telefono, String tipo_sangre) {
        super(codigo, cedula, pri_nomb, seg_nombre, prim_apell, seg_apelli, correo, genero, fecha_Nacimiento, direccion, telefono, tipo_sangre);
        this.fecha_de_ingreso = fecha_de_ingreso;
        this.Seguro = Seguro;
    }

    public String getFecha_de_ingreso() {
        return fecha_de_ingreso;
    }

    public void setFecha_de_ingreso(String fecha_de_ingreso) {
        this.fecha_de_ingreso = fecha_de_ingreso;
    }

    public String getSeguro() {
        return Seguro;
    }

    public void setSeguro(String Seguro) {
        this.Seguro = Seguro;
    }

}
