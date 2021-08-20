package utp.misiontic2022.c2.p47.reto5.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto5.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto5.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        ArrayList<Requerimiento_2> registrosBS2 = new ArrayList<>();
        Requerimiento_2 registroBS2 = null;


        String sql ="SELECT MC.ID_MaterialConstruccion, MC.Nombre_Material, C.Cantidad, MC.Precio_Unidad, (C.Cantidad * MC.Precio_Unidad) AS 'Precio_Total' FROM Compra AS C INNER JOIN MaterialConstruccion AS MC ON MC.ID_MaterialConstruccion = C.ID_MaterialConstruccion INNER JOIN Proyecto AS P ON P.ID_Proyecto = C.ID_Proyecto WHERE P.ID_Proyecto IN (10,14,23,24,38,50,29) ORDER BY P.ID_Proyecto ASC, MC.Precio_Unidad DESC";


                    try (
                        Connection conn = JDBCUtilities.getConnection();
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                    ) {
                        while (rs.next()) {
                            registroBS2 = new Requerimiento_2();
            
                            registroBS2.setIdMaterial(rs.getInt("ID_MaterialConstruccion"));
                            registroBS2.setNombreMaterial(rs.getString("Nombre_Material"));
                            registroBS2.setCantidad(rs.getInt("Cantidad"));
                            registroBS2.setPrecioUnidad(rs.getInt("Precio_Unidad"));
                            registroBS2.setPrecioTotal(rs.getInt("Precio_Total"));
            
                            registrosBS2.add(registroBS2);
                        }
                    } 
            
                    return registrosBS2;
    }
}