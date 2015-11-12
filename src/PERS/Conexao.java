package PERS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Jean_Henrique_Ferreira
 * @author Andressa
 * @author Eric Pinheiro
 */
public class Conexao {
   private static String url = "jdbc:postgresql://localhost:5432/controlabeneficio"; //nome do db
        private static String user = "postgres"; //usuario padrao
        private static String senha = "masterkey"; //colcoar a senha que foi definida no db
        
        public Connection getConnection(){
            try {
                return DriverManager.getConnection(url, user, senha);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }  
}
