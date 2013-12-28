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


/**
 *
 * @author DJBRANBRAN
 */
public class Charger {
    //Pour le nombre de paramètre aidez vous du constructeur Heros
    
    public Charger(){
        
    }
    
     public static /*void*/float [] main(String [] args) throws IOException {
        float [] tab = new float[22];
        
        File fe = new File("C:\\Users\\DJBRANBRAN\\Documents\\GitHub\\nikoumpo\\src\\Tama\\Sauvegarde.txt");

       
        //----------------- Test pour l'existance d'un fichier --------------------
        if (! fe.exists()){
            System.out.println("Le fichier  n\'existe pas");
            System.exit(1);
        }
        //------------------ Lecture d'un fichier ---------------------------------
        
        BufferedReader fent = new BufferedReader( new FileReader( fe ) );        
        float max=0, min=0, actuel=0;
        
        //FileReader permet de lire le fichier
        //BufferedReader permet de mettre dans le buffer le fichier.
        
        
        String ligne= new String();//Ligne du fichier
        String [] partie= new String[3];//Un tableau contenant juste les paramètres qu'on veut
        String parametre=new String();//Le premier paramètre
        
        while ( ( ligne = fent.readLine( ) ) != null ) // null en cas de fin de fichier
        {
            partie=ligne.split("_");
            max=Float.parseFloat(partie[1]);
            min=Integer.parseInt(partie[2]);
            actuel=Integer.parseInt(partie[3]);
            parametre=partie[0];
            System.out.println(parametre +":"+max+"_"+min+"_"+actuel);
            if(parametre.equals("PV")){
                System.out.println("Tu es rentré dans PV");
                tab[0]=max;
                tab[1]=actuel;
                        
            }
            if(parametre.equals("MP")){
                tab[2]=max;
                tab[3]=actuel;
                        
            }
            if(parametre.equals("LVL")){
                tab[4]=actuel;
                        
            }
            if(parametre.equals("EXP")){
                tab[5]=max;
                tab[6]=actuel;
                
            }
            if(parametre.equals("FAIM")){
                tab[7]=max;
                tab[8]=actuel;
                
            }
            
            if(parametre.equals("SOMMEIL")){
                tab[9]=max;
                tab[10]=actuel;
                
            }
            
            if(parametre.equals("HUMEUR")){
                tab[11]=max;
                
                
            }
            
            if(parametre.equals("PEPITE")){
                tab[12]=actuel;
                
            }
            if(parametre.equals("OR")){
                tab[13]=actuel;
                
            }
            if(parametre.equals("ATTAQUE")){
                tab[14]=actuel;
                
            }
            if(parametre.equals("DEFENSE")){
                tab[15]=actuel;
                
            }
            if(parametre.equals("RESISTANCE")){
                tab[16]=actuel;
                
            }
            if(parametre.equals("CRITIQUE")){
                tab[17]=actuel;
                
            }
            if(parametre.equals("VITESSE")){
                tab[18]=max;
                
            }
            if(parametre.equals("EXTRAPOINT")){
                tab[19]=min;//Nbr d'Extra point
                tab[20]=max;//Extra point PV
                tab[21]=actuel;//Extra point MP
                
            }
            
            
        }
        fent.close( );
        
        int i = 0;
        System.out.println("-------------------------------");
        System.out.println("------------- TAB -------------");
        System.out.println("-------------------------------");
        while (i<22){
            System.out.println(tab[i]);
            i++;
        }
        
        return tab;
            
       }// fin main
    
      }