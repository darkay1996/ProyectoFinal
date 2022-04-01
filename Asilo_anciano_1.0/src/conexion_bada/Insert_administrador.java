package conexion_bada;

import clases.administrador;
//import conexion_bada.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Insert_administrador extends administrador {

    Conexion cone = new Conexion();

    public boolean InsertarAdministrador() {
        String sql = "INSERT INTO administrador(\n"
                + "	admin_codigo, admin_cedula,admin_primer_nombre,admin_segundo_nombre, admin_primer_apellido,admin_segundo_apellido, admin_correo, admin_genero, admin_direccion, admin_tipo_sangre,admin_telefono,admin_nivel_educacion,admin_fecha_nacimiento)\n"
                + "	VALUES ('" + getCodigo() + "','" + getCedula() + "', '" + getPri_nomb() + "', '" + getSeg_nombre() + "', '" + getPrim_apell() + "', '" + getSeg_apelli() + "', '" + getCorreo() + "','" + getGenero() + "','" + getDireccion() + "','" + getTipo_sangre() + "','" + getTelefono() + "','" + getNivel_educacion() + "','" + getFecha_Nacimiento() + "');";
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