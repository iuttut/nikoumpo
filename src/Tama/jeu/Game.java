/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tama.jeu;

import org.lwjgl.opengl.Display;
import java.util.ArrayList;
import org.lwjgl.input.Keyboard;
/**
 *
 * @author DJBRANBRAN
 */
public class Game {
    
    private ArrayList<GameObject> objects;
    private GOPlayer joueur;
    
    public Game(){
        objects = new ArrayList<GameObject>();
        GOBall balle = new GOBall(Display.getWidth() / 2 - GOBall.SIZE / 2 , Display.getHeight() / 2 - GOBall.SIZE /2);
        joueur = new GOPlayer(0,Display.getHeight() /2 - GOPlayer.SIZEY /2, balle);
        
        objects.add(balle);
        objects.add(joueur);
    }
    
    public void Recuperer_touches(){
        if(Keyboard.isKeyDown(Keyboard.KEY_Z) || Keyboard.isKeyDown(Keyboard.KEY_UP)){
            joueur.move(1);
        }
        if(Keyboard.isKeyDown(Keyboard.KEY_S) || Keyboard.isKeyDown(Keyboard.KEY_DOWN)){
            joueur.move(-1);
        }
    }
    
    public void Modifier(){
        for(GameObject go : objects)
            go.Modifier();
    }
    
    public void Creation_des_rectangles(){
        for(GameObject go : objects)
            go.Creation_des_rectangles();
            /*glColor3f(0.25f,0.25f,0.25f);
            Dessiner_rectangle(10,10,1600,10,0);
            Dessiner_rectangle(10,10,10,1600,0);
            Dessiner_rectangle(10,590,1600,10,0);
            Dessiner_rectangle(790,10,10,1600,0);
            Dessiner_rectangle(250,250,50,50,0);*/
    }
    
}
