/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tama.jeu;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author DJBRANBRAN
 */
public class Jeu {
   
    public static Game game;
    
    public static void main(String args[]){
        //Initialiser programme
        Initialiser_page();
        Initialiser_GL();
        
        Initialiser_jeu();
        
        Boucler_jeu();
        Supprimer_page();
        
        
        
    }
        

        private static void Initialiser_jeu(){
            game = new Game();
        }
        
        private static void Recuperer_touches(){
            game.Recuperer_touches();
        }
        
        private static void Modifier(){
            game.Modifier();
        }
        
        private static void Creation_des_rectangles(){
            glClear(GL_COLOR_BUFFER_BIT);
            glLoadIdentity();//Pour le fixe lorsqu'il se déplace
            game.Creation_des_rectangles();
            Display.update();
            Display.sync(60);
        }
        
        private static void Boucler_jeu(){
            while(!Display.isCloseRequested()){
                
                Recuperer_touches();
                Modifier();
                Creation_des_rectangles();
                
                
            }
        }
        
        private static void Initialiser_GL(){
            glMatrixMode(GL_PROJECTION);
            glLoadIdentity();//Pour identifier
            glOrtho(0,Display.getWidth(),0,Display.getHeight(),-1,1);
            glMatrixMode(GL_MODELVIEW);
            
            glClearColor(0,0,0,1);//Fond d'écran
            
            glDisable(GL_DEPTH_TEST);
        }
        private static void Supprimer_page(){
            Display.destroy();
            Keyboard.destroy();
        }
        
        private static void Initialiser_page(){
            try {
                Display.setDisplayMode(new DisplayMode(800,600));
                Display.create();
                Display.setVSyncEnabled(true);
                Keyboard.create();
            } catch (LWJGLException ex) {
                Logger.getLogger(Jeu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
}
