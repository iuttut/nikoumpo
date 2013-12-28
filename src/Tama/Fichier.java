/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tama;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DJBRANBRAN
 */
public class Fichier {
    
     public static void main(String[] args) throws IOException {
        String nomfichier = "Sauvegarde.propreties";
        File fe = new File(nomfichier);
        //----------------- Test pour l'existance d'un fichier --------------------
        if (! fe.exists()){
            System.out.println("Le fichier "+ nomfichier + " n'existe pas");
            System.exit(1);
        }
        //------------------ Lecture d'un fichier ---------------------------------
        int i=0,j=0;
        int max=0, min=0, actuel=0;
        

        
        BufferedReader fent = new BufferedReader( new FileReader( fe ) );
        //FileReader permet de lire le fichier
        //BufferedReader permet de mettre dans le buffer le fichier.
        
        while (fent.readLine() != null){
            j++;//Pour connaitre le nombre de lignes
        }
        
        i=(int)(Math.random()*j);// 0<i<nbr de lignes
        String ligne=null;
        String  []partie=null;
        String parametre=null;
        System.out.println( "Voici le contenu du fich :" );
        BufferedReader f = new BufferedReader(new FileReader(fe));
        
        while ( ( ligne = f.readLine( ) ) != null ) // null en cas de fin de fichier
        {
            partie=ligne.split("_");
            max=Integer.parseInt(partie[1]);
            min=Integer.parseInt(partie[2]);
            actuel=Integer.parseInt(partie[3]);
            parametre=partie[0];
            if(parametre.equals("PV")){
                
            }
            if(parametre.equals("MP")){
                
            }
            if(parametre.equals("LVL")){
                
            }
            if(parametre.equals("EXP")){
                
            }
            if(parametre.equals("FORCE")){
                
            }
            if(parametre.equals("DEFENSE")){
                
            }
            if(parametre.equals("RESISTANCE")){
                
            }
            if(parametre.equals("HUMEUR")){
                
            }
            if(parametre.equals("FAIM")){
                
            }
            if(parametre.equals("SOMMEIL")){
                
            }
            if(parametre.equals("PEPITE")){
                
            }
            if(parametre.equals("OR")){
                
            }
            
        }
        fent.close( );
               
        Date date = new Date();
        SimpleDateFormat dateFormat;
 
        dateFormat = new SimpleDateFormat("EEEE dd MMMMM yyyy kk:mm:ss");
        System.out.println(dateFormat.format(date));
        
       }// fin main
    
      }