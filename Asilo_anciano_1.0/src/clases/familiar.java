package clases;

public class familiar extends persona {

    private String codigo_de_paciente;
    private String fecha_de_visita;
    private String hora_inicio;
    private String hora_fin;

    public familiar() {
        super();
    }

    public familiar(String codigo_de_paciente, String fecha_de_visita, String hora_inicio, String hora_fin) {
        this.codigo_de_paciente = codigo_de_paciente;
        this.fecha_de_visita = fecha_de_visita;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
    }

    public familiar(String codigo_de_paciente, String fecha_de_visita, String hora_inicio, String hora_fin, String codigo, String cedula, String pri_nomb, String seg_nombre, String prim_apell, String seg_apelli, String correo, String genero, String fecha_Nacimiento, String direccion, String telefono, String tipo_sangre) {
        super(codigo, cedula, pri_nomb, seg_nombre, prim_apell, seg_apelli, correo, genero, fecha_Nacimiento, direccion, telefono, tipo_sangre);
        this.codigo_de_paciente = codigo_de_paciente;
        this.fecha_de_visita = fecha_de_visita;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
    }

    public String getCodigo_de_paciente() {
        return codigo_de_paciente;
    }

    public void setCodigo_de_paciente(String codigo_de_paciente) {
        this.codigo_de_paciente = codigo_de_paciente;
    }

    public String getFecha_de_visita() {
        return fecha_de_visita;
    }

    public void setFecha_de_visita(String fecha_de_visita) {
        this.fecha_de_visita = fecha_de_visita;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }
    
    
}
