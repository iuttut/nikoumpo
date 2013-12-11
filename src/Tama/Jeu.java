/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tama;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author DJBRANBRAN
 */
public class Jeu {
   
    public static void main(String args[]){
        Initialiser_page();
        Initialiser_GL();
        Boucler_jeu();
        Supprimer_page();
        
        
        
    }
        private static void Boucler_jeu(){
            while(!Display.isCloseRequested()){
                glClear(GL_COLOR_BUFFER_BIT);
                glLoadIdentity();//Pour le fixe lorsqu'il se déplace
                
                glColor3f(0.60f,0.25f,0.25f);
                
                
              //  
                
                dessiner_rectangle(10,10,1600,10,0);
                dessiner_rectangle(10,10,10,1600,0);
                dessiner_rectangle(10,590,1600,10,0);
                dessiner_rectangle(790,10,10,1600,0);
                dessiner_rectangle(250,250,50,50,0);
                
                
                
                Display.update();
            }
        }
        
        private static void dessiner_rectangle(float x, float y, float width, float height, float rot){
            glPushMatrix();{
                width /=2;
                height /= 2;
                glTranslatef(x,y,0);//Pour faire translated notre perso
                glRotatef(rot,0,0,1);//Pour l'orienter
                
                glBegin(GL_QUADS);{
                    glVertex2f(-width,-height);
                    glVertex2f(-width,height);
                    glVertex2f(width,height);
                    glVertex2f(width,-height);
                }
                glEnd();
            }
            glPopMatrix();
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
        }
        
        private static void Initialiser_page(){
            try {
                Display.setDisplayMode(new DisplayMode(800,600));
                Display.create();
            } catch (LWJGLException ex) {
                Logger.getLogger(Jeu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
}
