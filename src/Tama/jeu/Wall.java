/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tama.jeu;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
/**
 *
 * @author DJBRANBRAN
 */

public class Wall extends Actor {

    private Image image;

    public Wall(int x, int y, int i) {
        super(x, y);
        
        java.net.URL imgURL;
        if(i==0){
            imgURL = getClass().getResource("arbre.png");
            if (imgURL != null) {
                ImageIcon iia = new ImageIcon(imgURL);
                image = iia.getImage();
                this.setImage(image);
                //ImageIcon imageIcon = new ImageIcon(imgURL, "image de fond");
            } else {
                System.err.println("Couldn't find file: arbre.png");
            }    
        }
        if(i==1){
            imgURL = getClass().getResource("brique.png");
            if (imgURL != null) {
                ImageIcon iia = new ImageIcon(imgURL);
                image = iia.getImage();
                this.setImage(image);
                //ImageIcon imageIcon = new ImageIcon(imgURL, "image de fond");
            } else {
                System.err.println("Couldn't find file: brique.png");
            }    
        }
        
        
           /* URL loc = this.getClass().getResource("wall.jpg");
            ImageIcon iia = new ImageIcon(loc);
            image = iia.getImage();
            this.setImage(image);*/
       
        
        
    }
}

