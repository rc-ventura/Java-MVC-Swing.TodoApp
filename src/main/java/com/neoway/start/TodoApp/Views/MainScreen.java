
package com.neoway.start.TodoApp.Views;


import com.neoway.start.TodoApp.Controllers.*;
import com.neoway.start.TodoApp.Models.*;
import com.neoway.start.TodoApp.Util.TaskTableModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author RC_Ventura
 */
public class MainScreen extends javax.swing.JFrame {

     private ProjectController projectController; 
     private TaskController taskController;
     private DefaultListModel  projectsModel; 
     private TaskTableModel taskModel;
    /**
     * Creates new form MainScreen
     */
    public   MainScreen() {
            
            initComponents();                                                       //chamando os métodos criados
            decorateTableTask();
            initDataController();
            initComponentsModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTaskPanelSecond = new javax.swing.JPanel();
        jLabelTaskPanelIcon = new javax.swing.JLabel();
        jLabelTaskPanelTitle = new javax.swing.JLabel();
        jLabelTaskPanelSubTitle = new javax.swing.JLabel();
        jPanelTooBar = new javax.swing.JPanel();
        jLabelTooBarTitle = new javax.swing.JLabel();
        jLabelTooBarSubTitle = new javax.swing.JLabel();
        jPanelProjectBar = new javax.swing.JPanel();
        jLabelProjectTitle = new javax.swing.JLabel();
        ProjectIcon = new javax.swing.JLabel();
        jPanelTaskBar = new javax.swing.JPanel();
        jLabelTaskTitle = new javax.swing.JLabel();
        jLabelTaskIcon = new javax.swing.JLabel();
        jPanelProjectList = new javax.swing.JPanel();
        jScrollPaneProjectList = new javax.swing.JScrollPane();
        jListProject = new javax.swing.JList<>();
        jPanelTaskPanelFirst = new javax.swing.JPanel();
        jScrollPaneTaskTable = new javax.swing.JScrollPane();
        jTableTaskTable = new javax.swing.JTable();

        jPanelTaskPanelSecond.setBackground(java.awt.Color.white);
        jPanelTaskPanelSecond.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTaskPanelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTaskPanelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/list/lista-de-desejos (3).png"))); // NOI18N

        jLabelTaskPanelTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTaskPanelTitle.setForeground(new java.awt.Color(51, 102, 255));
        jLabelTaskPanelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTaskPanelTitle.setText("Nenhuma tarefa por aqui :D");

        jLabelTaskPanelSubTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTaskPanelSubTitle.setForeground(new java.awt.Color(153, 153, 153));
        jLabelTaskPanelSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTaskPanelSubTitle.setText("Clique no botão \"+\" para adicionar uma nova tarefa");

        javax.swing.GroupLayout jPanelTaskPanelSecondLayout = new javax.swing.GroupLayout(jPanelTaskPanelSecond);
        jPanelTaskPanelSecond.setLayout(jPanelTaskPanelSecondLayout);
        jPanelTaskPanelSecondLayout.setHorizontalGroup(
            jPanelTaskPanelSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskPanelSecondLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTaskPanelSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTaskPanelIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTaskPanelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTaskPanelSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelTaskPanelSecondLayout.setVerticalGroup(
            jPanelTaskPanelSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskPanelSecondLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabelTaskPanelIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTaskPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTaskPanelSubTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 800));

        jPanelTooBar.setBackground(new java.awt.Color(51, 102, 255));
        jPanelTooBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTooBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelTooBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTooBarTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tick/verifica (2).png"))); // NOI18N
        jLabelTooBarTitle.setText(" Todo App");

        jLabelTooBarSubTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTooBarSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTooBarSubTitle.setText("Anote tudo e não esqueça mais nada");

        javax.swing.GroupLayout jPanelTooBarLayout = new javax.swing.GroupLayout(jPanelTooBar);
        jPanelTooBar.setLayout(jPanelTooBarLayout);
        jPanelTooBarLayout.setHorizontalGroup(
            jPanelTooBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTooBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTooBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
            .addGroup(jPanelTooBarLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabelTooBarSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTooBarLayout.setVerticalGroup(
            jPanelTooBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTooBarLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabelTooBarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTooBarSubTitle)
                .addGap(18, 18, 18))
        );

        jPanelProjectBar.setBackground(java.awt.Color.white);
        jPanelProjectBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelProjectTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelProjectTitle.setForeground(new java.awt.Color(51, 102, 255));
        jLabelProjectTitle.setText("Projetos");

        ProjectIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add/add (5).png"))); // NOI18N
        ProjectIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProjectIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelProjectBarLayout = new javax.swing.GroupLayout(jPanelProjectBar);
        jPanelProjectBar.setLayout(jPanelProjectBarLayout);
        jPanelProjectBarLayout.setHorizontalGroup(
            jPanelProjectBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProjectTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(ProjectIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelProjectBarLayout.setVerticalGroup(
            jPanelProjectBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProjectBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProjectIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelProjectTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanelTaskBar.setBackground(java.awt.Color.white);
        jPanelTaskBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTaskTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTaskTitle.setForeground(new java.awt.Color(51, 102, 255));
        jLabelTaskTitle.setText("Tarefas");

        jLabelTaskIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add/add (5).png"))); // NOI18N
        jLabelTaskIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTaskIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTaskBarLayout = new javax.swing.GroupLayout(jPanelTaskBar);
        jPanelTaskBar.setLayout(jPanelTaskBarLayout);
        jPanelTaskBarLayout.setHorizontalGroup(
            jPanelTaskBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskBarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelTaskTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(jLabelTaskIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelTaskBarLayout.setVerticalGroup(
            jPanelTaskBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTaskBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTaskIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTaskTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanelProjectList.setBackground(java.awt.Color.white);
        jPanelProjectList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jListProject.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jListProject.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jListProject.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPaneProjectList.setViewportView(jListProject);

        javax.swing.GroupLayout jPanelProjectListLayout = new javax.swing.GroupLayout(jPanelProjectList);
        jPanelProjectList.setLayout(jPanelProjectListLayout);
        jPanelProjectListLayout.setHorizontalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelProjectListLayout.setVerticalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTaskPanelFirst.setBackground(java.awt.Color.white);
        jPanelTaskPanelFirst.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableTaskTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableTaskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Tarefa Concluída"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTaskTable.setGridColor(java.awt.Color.white);
        jTableTaskTable.setRowHeight(50);
        jTableTaskTable.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jTableTaskTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTaskTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTaskTableMouseClicked(evt);
            }
        });
        jScrollPaneTaskTable.setViewportView(jTableTaskTable);

        javax.swing.GroupLayout jPanelTaskPanelFirstLayout = new javax.swing.GroupLayout(jPanelTaskPanelFirst);
        jPanelTaskPanelFirst.setLayout(jPanelTaskPanelFirstLayout);
        jPanelTaskPanelFirstLayout.setHorizontalGroup(
            jPanelTaskPanelFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTaskTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanelTaskPanelFirstLayout.setVerticalGroup(
            jPanelTaskPanelFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTaskPanelFirstLayout.createSequentialGroup()
                .addComponent(jScrollPaneTaskTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanelTooBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelProjectBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTaskBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTaskPanelFirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanelTooBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelProjectBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelTaskBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTaskPanelFirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProjectIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProjectIconMouseClicked
        // TODO add your handling code here:
        ProjectDialogScreen projectDialogScreen = 
                new ProjectDialogScreen(this, rootPaneCheckingEnabled);             //Criando uma tela de cadastro de projetos
        projectDialogScreen.setVisible(true);                                       // Habilitando a tela para visível ao usuário
        
        projectDialogScreen.addWindowListener(new WindowAdapter(){                  //Adicionando um objeto da classe ouvinte Window na Screen de cadastro de projetos
            public void windownClosed(WindowEvent e){                               // Quando a janela fechar chama LoadData()
                loadProjects();
            }
        });
                

    }//GEN-LAST:event_ProjectIconMouseClicked
        
    private void jLabelTaskIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTaskIconMouseClicked
        // TODO add your handling code here:
       TaskDialogScreen taskDialogScreen = 
               new TaskDialogScreen(this, rootPaneCheckingEnabled);                     //Criando uma tela de cadastro de projetos
     //  taskDialogScreen.setProject(null);                                              //setando o Id do projeto associado a tarefa
       taskDialogScreen.setVisible(true);                                                //Habilitando ao usuário
        
       
    }//GEN-LAST:event_jLabelTaskIconMouseClicked

    private void jTableTaskTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTaskTableMouseClicked
        // TODO add your handling code here:                                            // Método para salvar se a tarefa foi concluida  ( Pega um ponto na tela clicado)
        int linha = jTableTaskTable.rowAtPoint(evt.getPoint());                     // um evento de clique é disparado a partir de um ponto na tela e guardado  na var linha
        int coluna = jTableTaskTable.columnAtPoint(evt.getPoint());                 // um evento de clique é disparado a partir de um ponto na tela e guardado na va coluna

        switch (coluna){                                                            
            case 3 -> {                                                                 
                Task task = taskModel.getTasks().get(linha);                        // se a coluna for 3 o taskModel carrega a lista de tarefas e carrega a linha da lista de tarefas que disparou o evento de clique
                taskController.update(task);                                           // chamamos o controller para atualizar no banco de dados esta mudança de valor da tarefa concluida
             }                                                                          
        }                                                                               //RESUMO: Quando clicamos na GUI e mudamos o status da tarefa isso chama uo método setValueAt no TaskModelTable    
                                                                                        // Este evento de mudança de status dispara um novo evento de clique que gaurda a linha e coluna clicados.
                                                                                        // Este evento de clique do mouse chama o Model de tarefas carregar todas as tarefas e selecionar apenas a tarefa que teve uma linha modificada na coluna 3. Atualizamos esta tarefa.
    }//GEN-LAST:event_jTableTaskTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java Swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ProjectIcon;
    private javax.swing.JLabel jLabelProjectTitle;
    private javax.swing.JLabel jLabelTaskIcon;
    private javax.swing.JLabel jLabelTaskPanelIcon;
    private javax.swing.JLabel jLabelTaskPanelSubTitle;
    private javax.swing.JLabel jLabelTaskPanelTitle;
    private javax.swing.JLabel jLabelTaskTitle;
    private javax.swing.JLabel jLabelTooBarSubTitle;
    private javax.swing.JLabel jLabelTooBarTitle;
    private javax.swing.JList<String> jListProject;
    private javax.swing.JPanel jPanelProjectBar;
    private javax.swing.JPanel jPanelProjectList;
    private javax.swing.JPanel jPanelTaskBar;
    private javax.swing.JPanel jPanelTaskPanelFirst;
    private javax.swing.JPanel jPanelTaskPanelSecond;
    private javax.swing.JPanel jPanelTooBar;
    private javax.swing.JScrollPane jScrollPaneProjectList;
    private javax.swing.JScrollPane jScrollPaneTaskTable;
    private javax.swing.JTable jTableTaskTable;
    // End of variables declaration//GEN-END:variables

    //Editando a TaskTable
    public void decorateTableTask(){
        jTableTaskTable.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,14));
        jTableTaskTable.getTableHeader().setBackground(new Color(51,102,255));
        jTableTaskTable.getTableHeader().setForeground(new Color (255,255,255));
        
        jTableTaskTable.setAutoCreateRowSorter(true);                                //Criando um Sort para organização das colunas
    }
    
    public void initDataController(){
         projectController = new ProjectController();                               //Inicializando os controllers
         taskController = new TaskController();
        
    }
    
    public void initComponentsModel(){                                              
        projectsModel = new DefaultListModel<>();                                    //Inicializando um Default Model
        loadProjects();
        
        taskModel = new TaskTableModel();                                           //Inicializando a classe personalizada TaskTableModel
        jTableTaskTable.setModel(taskModel);                                        // setando a classe personalizada Model no JTable                  
        loadTasks(1);
    }
    
    
    public void loadTasks(int idProject){                                                     
        List <Task> tasks = taskController.getAll(idProject);                              // Carregando uma lista de tarefas e guardando em um List tasks
        taskModel.setTasks(tasks);                                                // Setando essa lista de tarefas em um Model de tarefas
    }
    
    
    public void loadProjects(){
        List <Project> projects = projectController.getAll();                        //Carregamos todos os projetos do banco para um ArraysList
        
        projectsModel.clear();                                                       //Limpamos os dados do model
        
        for( int i = 0; i < projects.size(); i++){                                  // interamaos o Array com todos os elementos                                                          
            Project project = projects.get(i);                                      // guardamos na variável project cada dado no index i do Array   
            projectsModel.addElement(project);                                       // add cada elemento projeto ao model
        
        jListProject.setModel(projectsModel);                                        // O model carregará os elementos guardados nele no componente jListProject
        }
        
        
    }
}

