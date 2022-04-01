
package conexion_bada;
import clases.paciente;
//import conexion_bada.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Insert extends paciente{

    Conexion cone = new Conexion();

    public boolean InsertarPaciente() {
        String sql = "INSERT INTO paciente(\n"
                + "	paci_codigo, paci_cedula,paci_primer_nombre, paci_segundo_nombre,paci_primer_apellido, paci_segundo_apellido, paci_correo,paci_genero, paci_direccion,paci_telefono,paci_tipo_sangre,paci_seguro,paci_fecha_nacimiento,paci_fecha_de_ingreso)\n"
                + "	VALUES ('"+getCodigo()+"','"+getCedula()+"', '"+getPri_nomb()+"', '"+getSeg_nombre()+"', '"+getPrim_apell()+"', '"+getSeg_apelli()+"', '"+getCorreo()+"', '"+getGenero()+"', '"+getDireccion()+"', '"+getTelefono()+"','"+getTipo_sangre()+"','"+getSeguro()+"','"+getFecha_Nacimiento()+"','"+getFecha_de_ingreso()+"');";
        return cone.InsertUpdateDeleteAcciones(sql);
    }
    public List<paciente> ListaPaciente() {
        String sqls = "select * from paciente;";
        ResultSet rs = cone.selectConsulta(sqls);
        List<paciente> paci = new ArrayList<>();
        try {
            while (rs.next()) {
                paciente mi_paciente = new paciente();
                mi_paciente.setCodigo(rs.getString("paci_codigo"));
                mi_paciente.setCedula(rs.getString("paci_cedula"));
                mi_paciente.setPri_nomb(rs.getString("paci_primer_nombre"));
                mi_paciente.setSeg_nombre(rs.getString("paci_segundo_nombre"));
                mi_paciente.setPrim_apell(rs.getString("paci_primer_apellido"));
                mi_paciente.setSeg_apelli(rs.getString("paci_segundo_apellido"));
                mi_paciente.setCorreo(rs.getString("paci_correo"));
                mi_paciente.setGenero(rs.getString("paci_genero"));
                mi_paciente.setDireccion(rs.getString("paci_direccion"));
                mi_paciente.setTelefono(rs.getString("paci_telefono"));
                mi_paciente.setTipo_sangre(rs.getString("paci_tipo_sangre"));
                mi_paciente.setSeguro(rs.getString("paci_seguro"));           
                mi_paciente.setFecha_Nacimiento(rs.getString("paci_fecha_nacimiento"));
                mi_paciente.setFecha_de_ingreso(rs.getString("paci_fecha_de_ingreso"));
                
                paci.add(mi_paciente);
            }
            rs.close();
            return paci;
        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
   
}
