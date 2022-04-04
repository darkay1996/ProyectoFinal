package conexion_bada;

import clases.familiar;
//import clases.paciente;
//import conexion_bada.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Insert_familiar extends familiar {

    Conexion cone = new Conexion();

    public boolean InsertarFamiliar() {
        String sql = "INSERT INTO familiar(\n"
                + "	fam_codigo_visit, fam_cedula,fam_primer_nombre, fam_segundo_nombre,fam_primer_apellido, fam_segundo_apellido, fam_correo,fam_genero, fam_direccion,fam_tipo_sangre,fam_cod_paciente,fam_hora_inicio_visit,fam_hora_fin_visit,fam_telefono,fam_fecha_nacimiento,fam_fecha_visit)\n"
                + "	VALUES ('" + getCodigo() + "', '" + getCedula() + "', '" + getPri_nomb() + "', '" + getSeg_nombre() + "', '" + getPrim_apell() + "', '" + getSeg_apelli() + "', '" + getCorreo() + "', '" + getGenero() + "', '" + getDireccion() + "','" + getTipo_sangre() + "','" + getCodigo_de_paciente() + "','" + "','" + getTelefono() + "','" + getFecha_Nacimiento() + "');";
        return cone.InsertUpdateDeleteAcciones(sql);
    }

    public List<familiar> ListaFamiliar() {
        String sqls = "select * from familiar;";
        ResultSet rs = cone.selectConsulta(sqls);
        List<familiar> famili = new ArrayList<>();
        try {
            while (rs.next()) {
                familiar mi_famili = new familiar();
                mi_famili.setCodigo(rs.getString("fam_codigo_visit"));
                mi_famili.setCedula(rs.getString("fam_cedula"));
                mi_famili.setPri_nomb(rs.getString("fam_primer_nombre"));
                mi_famili.setSeg_nombre(rs.getString("fam_segundo_nombre"));
                mi_famili.setPrim_apell(rs.getString("fam_primer_apellido"));
                mi_famili.setSeg_apelli(rs.getString("fam_segundo_apellido"));
                mi_famili.setCorreo(rs.getString("fam_correo"));
                mi_famili.setGenero(rs.getString("fam_genero"));
                mi_famili.setDireccion(rs.getString("fam_direccion"));
                mi_famili.setTipo_sangre(rs.getString("fam_tipo_sangre"));

                mi_famili.setCodigo_de_paciente(rs.getString("fam_cod_paciente"));

                mi_famili.setTelefono(rs.getString("fam_telefono"));
                mi_famili.setFecha_Nacimiento(rs.getString("fam_fecha_nacimiento"));

                famili.add(mi_famili);
            }
            rs.close();
            return famili;
        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int cargarcodigo() {
        int codigo = 0;
        String sqls = "select max(fam_codigo) from familiar;";
        ResultSet ru = cone.selectConsulta(sqls);
        try {
            while (ru.next()) {
                codigo = ru.getInt("max") + 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
        return codigo;
    }
}
