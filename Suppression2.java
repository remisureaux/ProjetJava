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

/**
 *
 * @author quenq
 */
public class Suppression2 {
  public void Suppression2(String str)
  {
    try
    {
     
      Connection cnx = Connexion();
      PreparedStatement stm = cnx.prepareStatement(str);
      stm.execute();
      cnx.close();
    }
    catch (SQLException e)
    {
      e.getMessage();
    }

  }  
}
