/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Faculdade
 */
public class Conexao {
    private boolean status = false;
    private String mensagem = "";
    private Connection con = null;
    private Statement statement;
    private ResultSet resultSet;
    
    private String servidor = "localhost:3306";
    private String nomeDoBanco = "pdv_db";
    private String usuario = "root";
    private String senha = "Beck2022!@#$%";
    
    public Conexao(){}
    
    public Conexao(String pServidor, String pNomeDoBanco, String pUsuario, String pSenha){
        this.servidor = pServidor;
        this.nomeDoBanco = pNomeDoBanco;
        this.usuario = pUsuario;
        this.senha = pSenha;
    }
    
    /**
     * Abre uma conexão com o banco de dados
     * @return Connection
     */
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.err.print(e.getMessage());
        }
        
        try{            
            String url = "jdbc:mysql://" + servidor + "/" + nomeDoBanco + "?useTimezone=true&serverTimezone=UTC";
            
            this.setCon((Connection) DriverManager.getConnection(url, usuario, senha));
            
            //Desabilita o controle de transaçãoautomática.
            //conexao.setAutoCommit(false);
            
            this.status = true;
        }catch(/*ClassNotFoundException | InstantionException | IllegalAccessException | */SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return this.getCon();
    }
    
    /**
     * Executa consultas SQL
     * @param pSQL
     * @return int
     */
    public boolean executarSQL(String pSQL){
        try{
            this.setStatement(getCon().createStatement());
            this.setResultSet(getStatement().executeQuery(pSQL));
        }catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    
    /**
     * Executa Update e Delete SQL
     * @param pSQL
     * @return boolean
     */
    public boolean executarUpdateDeleteSQL(String pSQL){
        try{
            this.setStatement(getCon().createStatement());
            this.getStatement().executeUpdate(pSQL);
        }catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    
    /**
     * Executa insert SQL
     * @param pSQL
     * @return boolean
     */
    public int insertSQL(String pSQL){
        int status = 0;
        try{
            this.setStatement(getCon().createStatement());
            this.getStatement().executeUpdate(pSQL);
            this.setResultSet(this.getStatement().executeQuery("SELECT last_insert_id();"));
            
            while(this.resultSet.next()){
                status = this.resultSet.getInt(1);
            }
            
           return status;
        }catch(SQLException ex){
            ex.printStackTrace();
            return status;
        }
    }
    
    /**
     * encerra a conexão corrente
     * @return boolean
     */
    public boolean fecharConexao(){
        try{
            if((this.getResultSet() != null) && (this.statement != null)){
                this.getResultSet().close();
                this.statement.close();
            }
            this.getCon().close();
            return false;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }

    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;
    }

    /**
     * @return the statement
     */
    public Statement getStatement() {
        return statement;
    }

    /**
     * @param statement the statement to set
     */
    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    /**
     * @return the resultSet
     */
    public ResultSet getResultSet() {
        return resultSet;
    }

    /**
     * @param resultSet the resultSet to set
     */
    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }
}
