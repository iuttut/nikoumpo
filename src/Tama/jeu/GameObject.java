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
public abstract class GameObject {
    protected float x;
    protected float y;
    protected float sx;
    protected float sy;

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getSx() {
        return sx;
    }

    public float getSy() {
        return sy;
    }
    
    public float getCenterY(){
        return y + sy / 2;
    }
    
    abstract void Modifier();
    
    public void Creation_des_rectangles(){
        Dessiner.Rectangle(x,y,sx,sy);
    }
    
    
    
}
