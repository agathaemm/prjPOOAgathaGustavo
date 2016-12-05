package fatec.poo.control;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class Conexao {
   
   // atributos de conexao
   private String connectionString;
   private String driver;
   private String usuario;
   private String senha;
   private Connection connection=null;

   /**
    * Conexao
    * 
    * Metodo construtor
    * 
    * @param string nome de usuario do banco de dados
    * @param string senha do banco de dados
    */
   public Conexao(String usuario, String senha) {   
        this.usuario = usuario;
        this.senha = senha;   
   }
   
   /**
    * setConnectionString
    * 
    * Seta a string de conexao
    * 
    * @param string connectionString 
    */
   public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
   }
   
   /**
    * setDriver
    * 
    * Seta o driver sendo usado na conexao
    * 
    * @param string driver 
    */
   public void setDriver(String driver) {
        this.driver = driver;
   }
   
   /**
    * conectar
    * 
    * faz a conexao com o banco de dados
    * 
    * @return Connection connection
    */
   public Connection conectar() {
        
       //verifica se existe uma conexao
        if (connection == null){
            try {
               
               //tenta realizar a conexao
               Class.forName(driver);
               connection = DriverManager.getConnection(connectionString, usuario, senha);               
               
               //caso a conexao seja estabelecida com sucesso
               System.out.println("Conexao OK");
            } catch (Exception ex) {
                
                //caso nao seja possivel conectar
                System.out.println("Falha na Conexao");
                System.out.println(ex.toString() + ex.getMessage());
            }
        }
        
        //retorna a conexao
        return connection;
   }
   
   /**
    * fecharConexao
    * 
    * fecha a conexao com o banco de dados
    */
   public void fecharConexao(){
       
        //verifica se existe uma conexao
        if (connection != null){
            try {
                
                //tenta fechar a conexao
                connection.close();
 
            } catch (SQLException ex) {
                
                    //caso n tenha conseguido fechar a conexao
                    System.out.println(ex.toString());    
            }
        }   
    }
}