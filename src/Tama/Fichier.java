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
        int i,j=0;

        
        BufferedReader fent = new BufferedReader( new FileReader( fe ) );
        //FileReader permet de lire le fichier
        //BufferedReader permet de mettre dans le buffer le fichier.
        
        while (fent.readLine() != null){
            j++;//Pour connaitre le nombre de lignes
        }
        
        i=(int)(Math.random()*j);// 0<i<nbr de lignes
        int k=0;
        String str=null;
        System.out.println( "Voici le contenu du fich :" );
        BufferedReader f = new BufferedReader(new FileReader(fe));
        
        while ( ( str = f.readLine( ) ) != null ) // null en cas de fin de fichier
        {
            if (k==i){            
                System.out.println( str );
            }
            k++;
        }
        fent.close( );
               
        Date date = new Date();
        SimpleDateFormat dateFormat;
 
        dateFormat = new SimpleDateFormat("EEEE dd MMMMM yyyy kk:mm:ss");
        System.out.println(dateFormat.format(date));
        
       }// fin main
    
      }