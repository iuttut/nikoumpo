/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tama.jeu;



/**
 *
 * @author DJBRANBRAN
 */
public class GOPlayer  extends GameObject{
    
    public static final int SIZEX=16;
    public static final int SIZEY=SIZEX * 7;
    public static final float SPEED = 4f;
    
    private GOBall balle;
    
    public GOPlayer(float x, float y, GOBall balle){
        this.x=x;
        this.y=y;
        this.sx = SIZEX;
        this.sy = SIZEY;
        this.balle = balle;
    }
    
    @Override
    public void Modifier(){
        if(Physics.Collision(this, balle)){
            balle.reverseX();
        }
        
    }
    
    public void move(float mag){
        y += SPEED * mag;
    }
    
}
