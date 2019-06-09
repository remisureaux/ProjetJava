/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modèle;

import static Modèle.Connexion.Connexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author quenq
 */
public class Insertion {
    public void Insertion(String text) throws SQLException{
      Connection cnx = Connexion();
      PreparedStatement stm;
    try{  
    stm = cnx.prepareStatement(text);
    stm.executeUpdate(text);
    
    }
    catch(SQLException e){
        Logger.getLogger(Insertion.class.getName()).log(Level.SEVERE, null,e);
        
    }
}
}
