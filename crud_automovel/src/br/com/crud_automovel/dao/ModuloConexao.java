
package br.com.crud_automovel.dao;

import java.sql.*;

public class ModuloConexao {
    //estabelece a conexão com o bd
    public static Connection conector(){
        java.sql.Connection conexao = null;
        
        //chama driver iportado na biblioteca

        //armazena informações vindas do bd
        String url="jdbc:mysql://localhost:3306/db_crud_auto";
        String user="root";
        String password="retlavac19";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }
}
