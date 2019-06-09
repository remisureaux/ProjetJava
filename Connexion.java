/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modèle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author quenq
 */
public class Connexion {
    //Se connecter à la base de données
    public static Connection Connexion()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3307/qg";
            String user="root";
            String password="";
            Connection cnx = DriverManager.getConnection(url,user,password);
            return cnx;
        } catch (ClassNotFoundException e) {
            System.err.println("Driver non trouvé");
            System.exit(1);
        } catch (SQLException e) {
            System.err.println("Erreur SQL lors de la connexion");
            System.exit(1);
        } catch (Exception e) {
            System.exit(1);
        }
    return null;
    }
}
     
    

