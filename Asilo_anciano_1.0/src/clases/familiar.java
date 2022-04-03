package clases;

public class familiar extends persona {

    private String codigo_de_paciente;
    private String parectesco;
    private int cod_usuario;

    public familiar() {
        super();
    }

    public familiar(String codigo_de_paciente, String parectesco, int cod_usuario) {
        this.codigo_de_paciente = codigo_de_paciente;
        this.parectesco = parectesco;
        this.cod_usuario = cod_usuario;
    }

    public familiar(String codigo_de_paciente, String parectesco, int cod_usuario, String codigo, String cedula, String pri_nomb, String seg_nombre, String prim_apell, String seg_apelli, String correo, String genero, String fecha_Nacimiento, String direccion, String telefono, String tipo_sangre) {
        super(codigo, cedula, pri_nomb, seg_nombre, prim_apell, seg_apelli, correo, genero, fecha_Nacimiento, direccion, telefono, tipo_sangre);
        this.codigo_de_paciente = codigo_de_paciente;
        this.parectesco = parectesco;
        this.cod_usuario = cod_usuario;
    }

    public String getCodigo_de_paciente() {
        return codigo_de_paciente;
    }

    public void setCodigo_de_paciente(String codigo_de_paciente) {
        this.codigo_de_paciente = codigo_de_paciente;
    }

    public String getParectesco() {
        return parectesco;
    }

    public void setParectesco(String parectesco) {
        this.parectesco = parectesco;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }
}
