/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tama.jeu;

import java.util.ArrayList;
import javax.swing.JFrame;


/**
 *
 * @author DJBRANBRAN
 */
public final class Sokoban extends JFrame {

    private final int OFFSET = 100;//Taille de l'écran
    public ArrayList map = new ArrayList(); //Map dans son entier
    private int [][] map2 = new int[21][21];  //Une partie de la map

    public Sokoban() {
        InitUI();
    }

    public void InitUI() {
        Board board = new Board(0);
        add(board);/*
        GraphicsDevice d = GraphicsEnvironment
               .getLocalGraphicsEnvironment().getDefaultScreenDevice();
         if (d.isFullScreenSupported()) {
            d.setFullScreenWindow(this);
         }*/
        setSize(board.getBoardWidth() + OFFSET,
                board.getBoardHeight() + 2*OFFSET);

        setLocationRelativeTo(null);
        setTitle("Ninkoumpo");

    }
    
    public static void main(String[] args) {
        Sokoban sokoban = new Sokoban();
        sokoban.setVisible(true);
    }
    
}

