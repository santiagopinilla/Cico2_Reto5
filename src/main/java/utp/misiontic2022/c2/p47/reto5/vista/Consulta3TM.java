/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p47.reto5.vista;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p47.reto5.modelo.vo.Requerimiento_3;

/**
 *
 * @author SANTIAGO
 */
public class Consulta3TM extends AbstractTableModel {
    
    private   ArrayList<Requerimiento_3> registrosBS3;
    
    
    public Consulta3TM(){
        this(new ArrayList<>());
    }

    public Consulta3TM(ArrayList<Requerimiento_3> registrosBS3){
        this.registrosBS3 = registrosBS3;
    }

    @Override
    public int getRowCount() {
        return registrosBS3.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Requerimiento_3 requerimiento3 = registrosBS3.get(row);
        switch(column){
            case 0:
                return requerimiento3.getIdProyecto();
            case 1:
                return requerimiento3.getCiudad();
            case 2:
                return requerimiento3.getClasificacion();
            case 3:
                return requerimiento3.getCostoProyecto();    
        }
        return null;
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "Id proyecto";
            case 1:
                return "Ciudad";
            case 2:
                return "Clasificacion";
            case 3:
                return "Costo Proyecto";    
        }
        return super.getColumnName(column);
    }
    
}
