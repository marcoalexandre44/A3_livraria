/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//Classe de conexao
public class Conexao {
    
   Connection cn = null;
   String url = "";
   public  Connection conexaoBD(){
       try 
            {
                cn = DriverManager.getConnection(url);
            }
       catch (SQLException ex) 
            {
                System.out.println("error ao se conectar com o banco de dados" + ex);
             }
        return cn;
   } 
    
}
