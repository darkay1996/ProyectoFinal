package conexion_bada;

import clases.administrador;
import clases.usuario;
//import conexion_bada.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Insert_administrador extends administrador{

    Conexion cone = new Conexion();

    public boolean InsertarPersona() {
        String sql = "INSERT INTO persona(\n"
                + "	per_cedula, per_primer_nombre,per_segundo_nombre, per_primer_apellido,per_segundo_apellido, per_correo, per_genero, per_direccion,per_tipo_sangre,per_telefono,per_fecha_nacimiento)\n"
                + "	VALUES ('" + getCedula() + "', '" + getPri_nomb() + "', '" + getSeg_nombre() + "', '" + getPrim_apell() + "', '" + getSeg_apelli() + "', '" + getCorreo() + "', '" + getGenero() + "', '" + getDireccion() + "', '" + getTipo_sangre() + "','" + getTelefono() + "','" + getFecha_Nacimiento() + "');";
        return cone.InsertUpdateDeleteAcciones(sql);
    }
    usuario miusuario= new usuario();
    public boolean InsertarUsuario() {
        String sql = "INSERT INTO usuario(\n"
                + "	us_usuario,us_contraseña)\n"
                + "	VALUES ('" + miusuario.getUsuario() + "', '" + miusuario.getContraseña() + "');";
        return cone.InsertUpdateDeleteAcciones(sql);
    }

    public boolean InsertarAdministrador() {
        String sql = "INSERT INTO administrador(\n"
                + "     admin_cedula,admin_nivel_educacion,admin_codigo_usuario)\n"
                + "	VALUES ('" +getCedula()  +"','" + getNivel_educacion() + "','" + getCod_usuario() + "');";
        return cone.InsertUpdateDeleteAcciones(sql);
    }
    
    public List<administrador> ListaAdministrador() {
        String sqls = "select * from administrador;";
        ResultSet rs = cone.selectConsulta(sqls);
        List<administrador> admin = new ArrayList<>();
        try {
            while (rs.next()) {
                administrador mi_admin = new administrador();
                mi_admin.setCodigo(rs.getString("Codigo"));
                mi_admin.setCedula(rs.getString("Cedula"));
                mi_admin.setPri_nomb(rs.getString("Primer_nombre"));
                mi_admin.setSeg_nombre(rs.getString("Segundo_nombre"));
                mi_admin.setPrim_apell(rs.getString("Primer_apellido"));
                mi_admin.setSeg_apelli(rs.getString("Segundo_apellido"));
                mi_admin.setCorreo(rs.getString("Email"));
                mi_admin.setGenero(rs.getString("Sexo"));
                mi_admin.setFecha_Nacimiento(rs.getString("Fecha de nacimiento"));
                mi_admin.setDireccion(rs.getString("Direccion"));
                mi_admin.setTelefono(rs.getString("Celular"));
                mi_admin.setTipo_sangre(rs.getString("Tipo_de_sangre"));
                mi_admin.setNivel_educacion(rs.getString("Nivel de educacion"));
                admin.add(mi_admin);
            }
            rs.close();
            return admin;
        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
