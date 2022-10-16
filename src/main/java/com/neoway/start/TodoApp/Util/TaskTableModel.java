
package com.neoway.start.TodoApp.Util;

import com.neoway.start.TodoApp.Models.Task;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author RC_Ventura
 */
public class TaskTableModel extends AbstractTableModel {

    private   String[] columns = {"Nome", "Descrição","Prazo","Tarefa Concluída","Editar", "Excluir"};
    private  List <Task> tasks = new ArrayList();
    
    
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
    
   
    public boolean isCellEditable(int linha, int coluna) {                          // Método da Classe pai para edição de colunas no TaskTableModel
        
        return coluna == 3;                                                           //Apenas a coluna 3 é editável          
    }
    
    @Override                                                                           //Método da classe pai que retorna um tipo de dado

    public Class <?> getColumnClass (int coluna){                                   // Por Default esta clsse retirna uma String mas quando chamamos este método                                                                           // podemos modificar o tipo de dado para customizar a interface gráfica
   
            if (tasks.isEmpty()){                                                    // Caso a lista d etarefas esteja vazia retona um Object 
            return Object.class;                                
        } 
        return this.getValueAt(0, coluna).getClass();                               //  retorna então a mesma classe do tipo de dado da primeira linha
    }

    
    @Override                                                                       //Método Abstract Que é chamado para setar um novo valor em uma linha x coluna
    public void setValueAt(Object valor, int linha, int coluna) {
                                                                                    // Para criamos uma interação de clique em um box (tarefa concluida sim ou não) temos que setar um novo valor na coluna
        tasks.get(linha).setCompleted((boolean) valor);                             // Portanto, setamos um valor no parametro [valor] para uma linha qualquer na coluna Tarefa completada
                                                                                    // Usamos um UpperCast para transformar o valor para um object e depois fazermos um downcast de novo para bolean
    
    }
    
    @Override
    public Object getValueAt(int linha, int coluna) {                               // Método da classe pai que recebe parâmetros linha x coluna e carrega um dados de tarefas no banco de dados
        
                                                                                     // Nesta caso optamos por um swith onde para cada coluna carregamos em cada caso uma linha da lista
        switch (coluna){                                                                // de tarefa que conectou o banco de dados carregando as tarefas.  Coluna 0 -> carrega nome na lista 
                                                                                                
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
