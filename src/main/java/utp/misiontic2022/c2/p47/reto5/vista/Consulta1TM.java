/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p47.reto5.vista;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p47.reto5.modelo.vo.Requerimiento_1;

/**
 *
 * @author SANTIAGO
 */
public class Consulta1TM  extends AbstractTableModel {
     private   ArrayList<Requerimiento_1> registrosBS;
     
      public Consulta1TM(){
        this(new ArrayList<>());
    }
    public Consulta1TM(ArrayList<Requerimiento_1> registrosBS){
        this.registrosBS = registrosBS;
    }
     

    @Override
    public int getRowCount() {
        return registrosBS.size();
        }

    @Override
    public int getColumnCount() {
     
        return 3;
     }

    @Override
    public Object getValueAt(int row, int column) {
        Requerimiento_1 requerimiento1 = registrosBS.get(row);
        switch(column){
            case 0:
                return requerimiento1.getLider();
            case 1:
                return requerimiento1.getCargo();
            case 2:
                return requerimiento1.getProyectos();
            }
        return null;
    }
        
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "Lider";
            case 1:
                return "Cargo";
            case 2:
                return "Proyectos";
        }
        return super.getColumnName(column);
    }
}  

