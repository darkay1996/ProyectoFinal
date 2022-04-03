package conexion_bada;

import clases.especialidad;
import conexion_bada.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Insert_especialidad extends especialidad {

    Conexion cone = new Conexion();

    public boolean InsertarEspecialidad() {
        String sql = "INSERT INTO especialidades(\n"
                + "	esp_nombre_)\n"
                + "	VALUES ('" + getNombre_especialidad() + "');";
        return cone.InsertUpdateDeleteAcciones(sql);
    }

    public List<especialidad> ListaEspecialidades() {
        String sqls = "select * from especialidades;";
        ResultSet rs = cone.selectConsulta(sqls);
        List<especialidad> espe = new ArrayList<>();
        try {
            while (rs.next()) {
                especialidad mi_especialidad = new especialidad();
                mi_especialidad.setCodigo_especialidad(rs.getString("esp_codigo"));
                mi_especialidad.setNombre_especialidad(rs.getString("esp_nombre_"));
                espe.add(mi_especialidad);
            }
            rs.close();
            return espe;
        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
