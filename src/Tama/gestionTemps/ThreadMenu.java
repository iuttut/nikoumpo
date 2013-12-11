package Tama.gestionTemps;

import Tama.*;
//import gestionObjets.Heros;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Wouaip
 */
public class ThreadMenu extends Thread { // Thread = C'est un programme qui se déroule en paralèlle en gros.

    long dateCre; // Date de lancement du Thread
    long tpUt;
    float tpUts;
    int tpUtm;// TpUt-> Temps d'Utilisation du Theros en milli; tpUts-> Tps d'utili. en seconde etc..
    long MyThID;//ID du thread  TODO Pour l'instant inutilisé
    menu menu;

    public ThreadMenu(String name, menu menu) {
        super(name);
        dateCre = System.currentTimeMillis(); // Initialisaiton avec la date de lancement du prog. 
        tpUt = 0;
        tpUts = 0;
        tpUtm = 0;
        MyThID = Thread.currentThread().getId(); // A voir si c'est utile.
        this.menu=menu;
    }

    @Override
    public void run() {
        while (1 == 1) {//TODO Un peu moche le while 1=1. ? on peut trovuer autr' chose ?
            tpUt = System.currentTimeMillis() - dateCre; // Temps d'utilisation = Temps actuel - Temps de lancement du prog
            tpUts = tpUt / 1000 + 1; // Passage en seconde
            
                menu.repaint();
                System.out.println("!Menu! On tourne depuis " + tpUts + " secondes. ");
                /*if (tpUtm!=0) {
                 heros.setTempsEnnuiPlus(heros.getTempsEnnuiPlus()-1); heros.setTempsFaimPlus(heros.getTempsFaimPlus()-1); // Mise à jour du temps avant augmentation des stats
                 }*/
                tpUts++;
                try {
                    this.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                /*if(heros.getTempsEnnuiPlus()==0) { heros.gainEnnui();} // appel des fctions modificatrice des stats et test de la valeur
            
                 if(heros.getTempsFaimPlus()==0) {heros.gainFaim();}*/
                while (tpUt % 1000 == 0 && tpUts % 60 == 0) {
                    tpUt = System.currentTimeMillis() - dateCre; // Pour eviter qu'on affiche plein de fois le println.
                
            }
        }

    }
}
