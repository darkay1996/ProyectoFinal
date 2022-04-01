package conexion_bada;

import clases.recepcionista;
//import conexion_bada.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Insert_recepcionista extends recepcionista {

    Conexion cone = new Conexion();

    public boolean InsertarRecepcionista() {
        String sql = "INSERT INTO recepcionista(\n"
                + "	recep_codigo, recep_cedula,recep_primer_nombre, recep_segundo_nombre,recep_primer_apellido, recep_segundo_apellido, recep_correo,recep_genero, recep_direccion,recep_tipo_sangre,recep_celular,recep_fecha_nacimiento,recep_hingreso,recep_hsalida)\n"
                + "	VALUES ('" + getCodigo()+ "', '" + getCedula()+ "', '" + getPri_nomb()+ "', '" + getSeg_nombre()+ "', '" + getPrim_apell()+ "', '" + getSeg_apelli()+ "', '" + getCorreo()+ "', '" + getGenero()+ "', '" + getDireccion()+ "','" + getTipo_sangre()+ "','" + getTelefono()+ "','" + getFecha_Nacimiento()+ "','" + getHora_ingreso()+ "','" + getHora_salida()+ "');";
        return cone.InsertUpdateDeleteAcciones(sql);
    }
    
    public List<recepcionista> ListaRecepcionista() {
        String sqls = "select * from recepcionista;";
        ResultSet rs = cone.selectConsulta(sqls);
        List<recepcionista> recep = new ArrayList<>();
        try {
            while (rs.next()) {
                recepcionista mi_recepcionista = new recepcionista();
                mi_recepcionista.setCodigo(rs.getString("recep_codigo"));
                mi_recepcionista.setCedula(rs.getString("recep_cedula"));
                mi_recepcionista.setPri_nomb(rs.getString("recep_primer_nombre"));
                mi_recepcionista.setSeg_nombre(rs.getString("recep_segundo_nombre"));
                mi_recepcionista.setPrim_apell(rs.getString("recep_primer_apellido"));
                mi_recepcionista.setSeg_apelli(rs.getString("recep_segundo_apellido"));
                mi_recepcionista.setCorreo(rs.getString("recep_correo"));
                mi_recepcionista.setGenero(rs.getString("recep_genero"));
                mi_recepcionista.setDireccion(rs.getString("recep_direccion"));
                mi_recepcionista.setTipo_sangre(rs.getString("recep_tipo_sangre"));
                mi_recepcionista.setTelefono(rs.getString("recep_celular"));
                mi_recepcionista.setFecha_Nacimiento(rs.getString("recep_fecha_nacimiento"));
                mi_recepcionista.setHora_ingreso(rs.getString("recep_hingreso"));
                mi_recepcionista.setHora_salida(rs.getString("recep_hsalida"));
                recep.add(mi_recepcionista);
            }
            rs.close();
            return recep;
        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
