package conexion_bada;

import clases.enfermera;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class Insert_enfermera extends enfermera{
    
    Conexion cone = new Conexion();
     public boolean InsertarEnfermera() {
        String sql = "INSERT INTO enfermera(\n"
                + "	enfer_codigo, enfer_cedula,enfer_primer_nombre, enfer_segundo_nombre,enfer_primer_apellido, enfer_segundo_apellido, enfer_correo,enfer_genero, enfer_direccion,enfer_telefono,enfer_tipo_sangre,enfer_anio_experiencia,enfer_fecha_nacimiento)\n"
                + "	VALUES ('"+getCodigo()+"','"+getCedula()+"', '"+getPri_nomb()+"', '"+getSeg_nombre()+"', '"+getPrim_apell()+"', '"+getSeg_apelli()+"', '"+getCorreo()+"','"+getGenero()+"', '"+getDireccion()+"','"+getTelefono()+"','"+getTipo_sangre()+"','"+getAño_ecperiencia()+"','"+getFecha_Nacimiento()+"');";
        return cone.InsertUpdateDeleteAcciones(sql);
    }
     
     public List<enfermera> ListaEnfermera() {
        String sqls = "select * from enfermera;";
        ResultSet rs = cone.selectConsulta(sqls);
        List<enfermera> enfer = new ArrayList<>();
        try {
            while (rs.next()) {
                enfermera mi_enfer = new enfermera();
                mi_enfer.setCedula(rs.getString("enfer_codigo"));
                mi_enfer.setCedula(rs.getString("enfer_cedula"));
                mi_enfer.setPri_nomb(rs.getString("enfer_primer_nombre"));
                mi_enfer.setSeg_nombre(rs.getString("enfer_segundo_nombre"));
                mi_enfer.setPrim_apell(rs.getString("enfer_primer_apellido"));
                mi_enfer.setSeg_apelli(rs.getString("enfer_segundo_apellido"));
                mi_enfer.setCorreo(rs.getString("enfer_correo"));
                mi_enfer.setGenero(rs.getString("enfer_genero"));            
                
                mi_enfer.setDireccion(rs.getString("enfer_direccion"));
                mi_enfer.setTelefono(rs.getString("enfer_telefono"));
                mi_enfer.setTipo_sangre(rs.getString("enfer_tipo_sangre"));
                mi_enfer.setAño_ecperiencia(rs.getString("enfer_anio_experiencia"));
                mi_enfer.setFecha_Nacimiento(rs.getString("enfer_fecha_nacimiento"));
                enfer.add(mi_enfer);
            }
            rs.close();
            return enfer;
        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
