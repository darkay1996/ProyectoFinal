package conexion_bada;

import clases.alergias;
import conexion_bada.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
// Prueba
public class Insert_alergias extends alergias {

    Conexion cone = new Conexion();

    public boolean InsertarAlergias() {
        String sql = "INSERT INTO alergias(\n"
                + "	aler_nombre_)\n"
                + "	VALUES ('" + getNombre_alergia() + "');";
        return cone.InsertUpdateDeleteAcciones(sql);
    }

    public List<alergias> ListaAlergias() {
        String sqls = "select * from alergias;";
        ResultSet rs = cone.selectConsulta(sqls);
        List<alergias> alergia = new ArrayList<>();
        try {
            while (rs.next()) {
                alergias mi_alergia = new alergias();
                mi_alergia.setCodigo_alergia(rs.getString("aler_codigo"));
                mi_alergia.setNombre_alergia(rs.getString("aler_nombre_"));
                alergia.add(mi_alergia);
            }
            rs.close();
            return alergia;
        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
