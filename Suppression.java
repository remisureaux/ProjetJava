/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modèle;

import static Modèle.Connexion.Connexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 *
 * @author quenq
 */
public class Suppression {
    public String Suppression(String str){
    try {
      Connection cnx = Connexion();
      PreparedStatement stm = cnx.prepareStatement(str);
      ResultSet res = stm.executeQuery();
      ResultSetMetaData resultMeta = res.getMetaData();
      while (res.next()){
        for(int j = 1; j <= resultMeta.getColumnCount(); j++){
            
            return res.getObject(j).toString();
      }     
      }

      res.close();
      stm.close();

    } catch (SQLException e) {
      e.getMessage();
    }
    return null;
}
}
