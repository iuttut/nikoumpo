/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tama;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author DJBRANBRAN
 */
public class Sauvegarder {
  public static void main(String[] argv) throws IOException
  {
    BufferedReader lecteurAvecBuffer=null;
    String ligne;
    
    try
      {
	lecteurAvecBuffer = new BufferedReader(new FileReader(argv[0]));
      }
    catch(FileNotFoundException exc)
      {
	System.out.println("Erreur d'ouverture");
      }
    
    while ((ligne = lecteurAvecBuffer.readLine())!=null)
      System.out.println(ligne);
    lecteurAvecBuffer.close();
    }
}
