package com.neoway.start.TodoApp.Controllers;

import com.neoway.start.TodoApp.Models.Task;
import com.neoway.start.TodoApp.Util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author R.C_Ventura
 */
public class TaskController {

    public void save(Task task) {
        String sql = "INSERT INTO tasks(idProject, name, description, completed, notes, deadline, createdAt, updatedAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
                                                                                   //Cria uma conex�o com o banco
            connection = ConnectionFactory.getConnection();
                                                                                   //Cria um PreparedStatment, classe usada para executar a query
            statement =  connection.prepareStatement(sql);

            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadline().getTime()));           //Conversão de um Date Util para um DateTime Sql
            statement.setDate(7, new Date(task.getCreatedAt().getTime())); // podmeos só declarar um new Date mas importar o pacote Date sql
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));

                                                                                             //Executa a sql para inser��o dos dados
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar a tarefa " + e.fillInStackTrace(), e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
                                                                                 //Fecha as conex�es
          
            
        }

    }

    public void update(Task task) {

        String sql = "UPDATE tasks SET idProject = ?, name = ?, description = ?,"
                + " completed = ?, notes = ?, deadline = ?,  createdAt = ?,"
                + " updatedAt = ? WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
                                                                                         //Cria uma conex�o com o banco
            connection = ConnectionFactory.getConnection();
                                                                                        //Cria um PreparedStatment, classe usada para executar a query
            statement = connection.prepareStatement(sql);

            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());                                 //setando os valores do statement
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.setInt(9, task.getId());

                                                                                     //Executa a sql para inser��o dos dados
            statement.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro em atualizar a tarefa", e);
        } finally {
                     ConnectionFactory.closeConnection(connection,  statement);

        }
    }

    public List<Task> getAll(int idProject) {                                           
        String sql = "SELECT * FROM tasks WHERE idProject = ?";                     //Query para buscar uma lista de tarefas no banco de dados

        List<Task> tasks = new ArrayList();                                       // lista de tarefas que será devolvida quando chamada do método  acontecer (return)

        Connection connection = null;
        PreparedStatement statement = null;

                                                                                    //Classe que vai recuperar os dados do banco de dados pois temos um retorno neste método
        ResultSet resultset = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement =  connection.prepareStatement(sql);
            statement.setInt(1, idProject);                                     // setando o id do projeto associado a tarefa para consulta no banco de dados
            resultset = statement.executeQuery();                               // resultSet guarda o resultado da execução da query
            
           
                                                                                         //Enquanto existir dados no banco de dados, faça
            while (resultset.next()) {

                Task task = new Task();

                task.setId(resultset.getInt("id"));
                task.setIdProject(resultset.getInt("idProject"));
                task.setName(resultset.getString("name"));
                task.setDescription(resultset.getString("description"));
                task.setCompleted(resultset.getBoolean("completed"));
                task.setNotes(resultset.getString("notes"));
                task.setDeadline(resultset.getDate("deadline"));
                task.setCreatedAt(resultset.getDate("createdAt"));
                task.setCreatedAt(resultset.getDate("updatedAt"));

                //Adiciono o contato recuperado, a lista de contatos
                tasks.add(task);
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar as tarefas", e);
        } finally { 
            ConnectionFactory.closeConnection(connection, statement, resultset);
                 
        }
          return tasks;                                                               
    }

    public List<Task> getByProjectId(int idProject) {
        String sql = "SELECT * FROM tasks where idProject = ?";

        List<Task> tasks = new ArrayList();

        Connection connection = null;
        PreparedStatement statement = null;

        //Classe que vai recuperar os dados do banco de dados
        ResultSet resultSet = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement =  connection.prepareStatement(sql);

            statement.setInt(1, idProject);

            resultSet = statement.executeQuery();

            //Enquanto existir dados no banco de dados, fa�a
            while (resultSet.next()) {

                Task task = new Task();

                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setCompleted(resultSet.getBoolean("completed"));
                task.setNotes(resultSet.getString("notes"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setCreatedAt(resultSet.getDate("updatedAt"));

                //Adiciono o contato recuperado, a lista de contatos
                tasks.add(task);
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao buscar as tarefas", ex);
        } finally {
                    ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        return tasks;
    }

    public void removeById(int idTask) {

        String sql = "DELETE FROM tasks WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement =  connection.prepareStatement(sql);
            statement.setInt(1, idTask);
            statement.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar a tarefa", e);
        } finally {
                    ConnectionFactory.closeConnection(connection, statement);
            }
        }

    }


