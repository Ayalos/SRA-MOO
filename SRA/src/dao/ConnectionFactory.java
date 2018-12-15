package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
    
    private static final String  DRIVER = "com.mysql.jdbc.Driver"; // CONSTANTE COM DRIVER PARA CONEXAO DO BANCO DE DADOS
    private static final String URL = "jdbc:mysql://localhost:3306/promed"; // CONEXAO COM BANCO DE DADOS
    private static final String USER = "root"; // USUARIO PARA ACESSAR O BANCO DE DADOS 
    private static final String PASSWORD = ""; // SENHA PARA ACESSAR O BANCO DE DADOS 

    public static Connection getConnection(){ // PEGAR CONEXAO COM BANCO 
        try {
            Class.forName(DRIVER); // PEGANDO CLASS DO DRIVER
            return DriverManager.getConnection(URL, USER, PASSWORD); // RETORNADO CONEXAO
        } catch (ClassNotFoundException | SQLException ex) { // CASO ACONTECA ALGUMA EXCECAO
            throw new RuntimeException ("Erro na conexão: ", ex); // RETORNANDO UM EXCECAO CASO ACONTECA ALGUM ERRO
        }        
    } // FINAL getConnection
    
    // METODO PARA FECHAR CONEXAO ( RECEBE A CONEXAO EM ABERTO)
    public static void closeConnection(Connection conn){
        try {
            if (conn != null ){ // VERIFICAR SE A CONEXAO RECEBIDA ESTA DIFERENTE DE NULL
                conn.close(); // FECHAR A CONEXAO
            }
        } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    // SOBRECARGA DO METODO
    public static void closeConnection(Connection conn, PreparedStatement stmt){
        
        closeConnection(conn); // FECHANDO CONEXAO COM METODO CRIADO ANTES
        
        try {
            if (stmt != null ){ // VERIFICAR SE O STATEMENT RECEBIDO ESTA DIFERENTE DE NULL
                stmt.close(); // FECHAR O STATEMENT
            }
        } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    // SOBRECARGA DO METODO
    public static void closeConnection(Connection conn, PreparedStatement stmt, ResultSet rs){
        
        closeConnection(conn, stmt); // FECHANDO CONEXAO COM METODO CRIADO ANTES
        
        try {
            if (rs != null ){ // VERIFICAR SE O STATEMENT RECEBIDO ESTA DIFERENTE DE NULL
                rs.close(); // FECHAR O STATEMENT
            }
        } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    // FINAL closeConnection
    
}
