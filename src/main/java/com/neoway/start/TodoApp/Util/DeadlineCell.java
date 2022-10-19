
package com.neoway.start.TodoApp.Util;

import com.neoway.start.TodoApp.Models.Task;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author RC_Ventura
 */

public class DeadlineCell extends DefaultTableCellRenderer {                      // Criamos uma classe para customizaçãpo das cédulas da coluna deadline
                                                                                     // Para isso utilizamos um renderizador padrão do Java de cédulas DefaultTableCellRender
    
    
    @Override                                                                                 //Override do método abstract
    public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column) {
       
        
             JLabel label;                                                              //Criamos um objeto GUI JTable para modificá-lo
        
             label = (JLabel) super.getTableCellRendererComponent(table, value,         // Chamamos o construtor pai do renderizador
                    isSelected, hasFocus, row, column) ;
    
             label.setHorizontalAlignment(CENTER);                                      // setamos a alinhamento da cédula´para horizontal
             
             TaskTableModel taskModel = (TaskTableModel) table.getModel();          // Instanciamos um model de tarefas e chamamos o model na Jtable
             Task task = taskModel.getTasks().get(row);                             // instanciamos um objeto de tarefa e carregamos as tarefas do model na linha do model que queremos renderizar
             
             if(task.getDeadline().after(new Date())){                              // Fazemos uma condicional para saber se a tarefa na coluna deadline possui data posterior a data atual 
                label.setBackground(Color.GREEN);                                   // se True set sua cor verde ( meu deadline é maior que a data atual)
             } 
             else {                                                                  // se False set a sua cor para vermelho ( meu deadline é menor que a data atual) 
                 label.setBackground(Color.RED);
             }
             return label;                                                          // retorne essa label renderizada
    
    
                          }
                    
    }