
package com.neoway.start.TodoApp.Util;

import com.neoway.start.TodoApp.Models.Task;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author RC_Ventura
 */
public class TaskTableModel extends AbstractTableModel {

    String[] columns = {"Nome", "Descrição","Prazo","Tarefa Concluída","Editar", "Excluir"};
    List <Task> tasks = new ArrayList<>();
    
    
    @Override
    public int getRowCount() {
        return tasks.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
    @Override
    public String getColumnName(int coluna){
        return columns[coluna];
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        

        switch (coluna){
            
            case 0:                                                                 //Começamos com o Case 0 pois Arrays começam com o index 0
                return tasks.get(linha).getName();
            
            case 1:
                return tasks.get(linha).getDescription();
            
            case 2:
                 SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");              // Criação de um SimpleDateFomat para formatar o padrão da data
                return dateFormat.format(tasks.get(linha).getDeadline());
                
            case 3:
                return tasks.get(linha).isCompleted();
                
            case 4:
                return "";
            
            case 5:
                return "";
                
            default: 
                return "Dados não encontrados";
            
            
            
        }
    
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    
    
}
