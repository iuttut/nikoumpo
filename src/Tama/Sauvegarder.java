
package Tama;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sauvegarder {
    
  public static void sauvegarder(/*String [] args)*/float [] tab) {		
    File file = new File("C:\\Users\\DJBRANBRAN\\Documents\\GitHub\\nikoumpo\\src\\Tama\\Sauvegarde.txt");
    FileWriter fw;
//    FileReader fr;
		
    try {
      //Création de l'objet
      fw = new FileWriter(file);
      String str;
      str="PV_"+tab[0]+"_0_"+tab[1]+"\n"
        + "MP_"+tab[2]+"_0_"+tab[3]+"\n"
        + "LVL_100_0_"+tab[4]+"\n"
        + "EXP_"+tab[5]+"_0_"+tab[6]+"\n"
        + "FAIM_"+tab[7]+"_0_"+tab[8]+"\n"
        + "SOMMEIL_"+tab[9]+"_0_"+tab[10]+"\n"
        + "HUMEUR_100_0_"+tab[11]+"\n"
        + "PEPITE_1000000_0_"+tab[12]+"\n"
        + "OR_1000000_0_"+tab[13]+"\n"
        + "ATTAQUE_100_0_"+tab[14]+"\n"
        + "DEFENSE_50_0_"+tab[15]+"\n"
        + "RESISTANCE_50_0_"+tab[16]+"\n"
        + "CRITIQUE_50_0_"+tab[17]+"\n"
        + "VITESSE_50_0_"+tab[18]+"\n"
        + "EXTRAPOINT_"+tab[19]+"_"+tab[20]+"_"+tab[21]+"\n";
      
      //On écrit la chaîne
      fw.write(str);
      //On ferme le flux
      fw.close();
			
      //Création de l'objet de lecture
   /*   fr = new FileReader(file);
      str = "";
      int i = 0;
      //Lecture des données
      while((i = fr.read()) != -1)
        str += (char)i;

      //Affichage
      System.out.println(str);
*/
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}