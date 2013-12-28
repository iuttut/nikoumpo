/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tama.jeu;

import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glPopMatrix;
import static org.lwjgl.opengl.GL11.glPushMatrix;
import static org.lwjgl.opengl.GL11.glRotatef;
import static org.lwjgl.opengl.GL11.glTranslatef;
import static org.lwjgl.opengl.GL11.glVertex2f;

/**
 *
 * @author DJBRANBRAN
 */
public class Dessiner {
    public static void Rectangle(float x, float y, float width, float height){
            Rectangle(x,y,width,height,0);
    }
     public static void Rectangle(float x, float y, float width, float height, float rot){
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
}

