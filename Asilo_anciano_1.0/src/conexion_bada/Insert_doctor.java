package conexion_bada;

import clases.doctor; 
//import conexion_bada.Conexion;
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
public class Insert_doctor extends doctor{
    
    Conexion cone = new Conexion();
     public boolean InsertarDoctor() {
        String sql = "INSERT INTO doctor(\n"
                + "	doc_codigo, doc_cedula,doc_primer_nombre, doc_segundo_nombre,doc_primer_apellido, doc_segundo_apellido,doc_correo,doc_genero,doc_direccion,doc_telefono,doc_tipo_sangre,doc_nivel_educacion,doc_fecha_nacimiento)\n"
                + "	VALUES ('"+getCodigo()+"','"+getCedula()+"', '"+getPri_nomb()+"', '"+getSeg_nombre()+"', '"+getPrim_apell()+"', '"+getSeg_apelli()+"', '"+getCorreo()+"', '"+getGenero()+"','"+getDireccion()+"','"+getTelefono()+"', '"+getTipo_sangre()+"','"+getEspecialidad()+"','"+getFecha_Nacimiento()+"');";
        return cone.InsertUpdateDeleteAcciones(sql);
    }
    public List<doctor> ListaDoctor() {
        String sqls = "select * from doctor;";
        ResultSet rs = cone.selectConsulta(sqls);
        List<doctor> doc = new ArrayList<>();
        try {
            while (rs.next()) {
                doctor mi_doc = new doctor();
                mi_doc.setCodigo(rs.getString("doc_codigo"));
                mi_doc.setCedula(rs.getString("doc_cedula"));
                mi_doc.setPri_nomb(rs.getString("doc_primer_nombre"));
                mi_doc.setSeg_nombre(rs.getString("doc_segundo_nombre"));
                mi_doc.setPrim_apell(rs.getString("doc_primer_apellido"));
                mi_doc.setSeg_apelli(rs.getString("doc_segundo_apellido"));
                mi_doc.setCorreo(rs.getString("doc_correo"));
                mi_doc.setGenero(rs.getString("doc_genero")); 
                mi_doc.setDireccion(rs.getString("doc_direccion"));
                mi_doc.setTelefono(rs.getString("doc_telefono"));
                mi_doc.setTipo_sangre(rs.getString("doc_tipo_sangre"));
                mi_doc.setEspecialidad(rs.getString("doc_nivel_educacion"));
                mi_doc.setFecha_Nacimiento(rs.getString("doc_fecha_nacimiento"));
                
                
                
                
                doc.add(mi_doc);
            }
            rs.close();
            return doc;
        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
