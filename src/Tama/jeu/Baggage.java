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

public class Baggage extends Actor {

    public Baggage(int x, int y) {
        super(x, y);
        java.net.URL imgURL = getClass().getResource("baggage.png");
        if (imgURL != null) {
            ImageIcon iia = new ImageIcon(imgURL);
            Image image = iia.getImage();
            this.setImage(image);
            //ImageIcon imageIcon = new ImageIcon(imgURL, "image de fond");
        } else {
            System.err.println("Couldn't find file: baggage.png");

        }
        
    }

    public void move(int x, int y) {
        int nx = this.x() + x;
        int ny = this.y() + y;
        this.setX(nx);
        this.setY(ny);
    }
}

