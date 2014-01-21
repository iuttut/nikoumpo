/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tama.jeu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
/**
 *
 * @author DJBRANBRAN
 */
public class Board extends JPanel { 

    private final int OFFSET = 10;
    private final int SPACE = 50;
    private final int LEFT_COLLISION = 1;
    private final int RIGHT_COLLISION = 2;
    private final int TOP_COLLISION = 3;
    private final int BOTTOM_COLLISION = 4;

    private ArrayList walls = new ArrayList();
    private ArrayList baggs = new ArrayList();
    private ArrayList areas = new ArrayList();
    private ArrayList portes = new ArrayList();
    private ArrayList combats = new ArrayList();
    private Player soko;
    private int w = 0;
    private int h = 0;
    private boolean completed = false;
    private boolean entreeH = false;
    private boolean entreeB = false;
    private boolean entreeG = false;
    private boolean entreeD = false;
    
    private String level;
    private int pLevel;

    public Board() {
        modifierPage();
        affichage(level);
        
    }
    public void modifierPage(){
        if(entreeG==true){//Pages à Gauche
            if(pLevel==3){//En haut à gauche
            level =
                "00000000000000000000\n"
              + "0                  0\n"
              + "0                 @P\n"
              + "0       111        0\n"
              + "0       111        0\n"
              + "0       111        0\n"
              + "0       111        0\n"
              + "0       111        0\n"
              + "0                  0\n"
              + "0                  0\n"
              + "00P00000000000000000\n"; 
            pLevel=1;
            }
            else if(pLevel==4){//En bas à gauche
            level =
                "00P00000000000000000\n"
              + "0                  0\n"
              + "0                  0\n"
              + "0     11111111     0\n"
              + "0          11      0\n"
              + "0         11       0\n"
              + "0       11111111   0\n"
              + "0                  0\n"
              + "0                 @P\n"
              + "0                  0\n"
              + "00000000000000000000\n"; 
            pLevel=2;
            }
            entreeG=false;          
        }
        else if(entreeD==true){//Pages à droite
            if(pLevel==0 || pLevel==1){//Haut
            level =
              "00000000000000000000\n"
            + "0                  0\n"
            + "P@                 0\n"
            + "0   11111111       0\n"
            + "0         11       0\n"
            + "0      11111       0\n"
            + "0         11       0\n"
            + "0   11111111       0\n"
            + "0                  0\n"
            + "0                  0\n"
            + "0000000000000P000000\n";  
            pLevel=3;
            }
            else if(pLevel==2){//Bas
            level =
              "0000000000000P000000\n"
            + "0                  0\n"
            + "0                  0\n"
            + "0   11             0\n"
            + "0   11  11         0\n"
            + "0   111111111      0\n"
            + "0       11         0\n"
            + "0       11         0\n"
            + "P@                 0\n"
            + "0                  0\n"
            + "00000000000000000000\n";  
            pLevel=4;
            }
            entreeD=false;
        }
        else if(entreeH==true){//Pages en Haut
            if(pLevel==2){//Gauche
            level =
                "00000000000000000000\n"
              + "0                  0\n"
              + "0                  P\n"
              + "0       111        0\n"
              + "0       111        0\n"
              + "0       111        0\n"
              + "0       111        0\n"
              + "0       111        0\n"
              + "0                  0\n"
              + "0 @                0\n"
              + "00P00000000000000000\n"; 
            pLevel=1;
            }
            else if(pLevel==4){//Droite
            level =
              "00000000000000000000\n"
            + "0                  0\n"
            + "P                  0\n"
            + "0   11111111       0\n"
            + "0         11       0\n"
            + "0      11111       0\n"
            + "0         11       0\n"
            + "0   11111111       0\n"
            + "0                  0\n"
            + "0            @     0\n"
            + "0000000000000P000000\n";  
            pLevel=3;
            }
            entreeH=false;
        }
        else if(entreeB==true){//Pages en Bas
           if(pLevel==1 || pLevel==0){//Gauche
            level =
                "00P00000000000000000\n"
              + "0 @                0\n"
              + "0                  0\n"
              + "0     11111111     0\n"
              + "0          11      0\n"
              + "0         11       0\n"
              + "0       11111111   0\n"
              + "0                  0\n"
              + "0                  P\n"
              + "0                  0\n"
              + "00000000000000000000\n"; 
            pLevel=2;
            }
           else if(pLevel==3){//Droite
            level =
              "0000000000000P000000\n"
            + "0            @     0\n"
            + "0                  0\n"
            + "0   11             0\n"
            + "0   11  11         0\n"
            + "0   111111111      0\n"
            + "0       11         0\n"
            + "0       11         0\n"
            + "P                  0\n"
            + "0                  0\n"
            + "00000000000000000000\n";  
            pLevel=4;
            } 
            entreeB=false;
        }
        else{//Page initiale
            level =
              "00000000000000000000\n"
            + "0                  0\n"
            + "0           CCCCCCCC@    P\n"
            + "0   111            0\n"
            + "0   111            0\n"
            + "0                  0\n"
            + "0      111         0\n"
            + "0      111         0\n"
            + "0                  0\n"
            + "0                  0\n"
            + "00P00000000000000000\n";
            pLevel=0;
        }
    }
    
    public void affichage(String level){
        this.level=level;
        addKeyListener(new TAdapter());
        setFocusable(true);
        initWorld();
    }

    public int getBoardWidth() {
        return this.w;
    }

    public int getBoardHeight() {
        return this.h;
    }

    public final void initWorld() {
        
        int x = OFFSET;
        int y = OFFSET;
        
        Wall wall;
        Baggage b;
        Area a;
        Porte p;
        Combat c;

        for (int i = 0; i < level.length(); i++) {

            char item = level.charAt(i);

            if (item == '\n') {
                y += SPACE;
                if (this.w < x) {
                    this.w = x;
                }
                x = OFFSET;
                
            } else if (item == '0') {
                wall = new Wall(x, y, 0);
                walls.add(wall);
                x += SPACE;
            } else if (item == '1') {
                wall = new Wall(x, y, 1);
                walls.add(wall);
                x += SPACE;
            } else if (item == 'P') {
                p = new Porte(x, y);
                portes.add(p);
                x += SPACE;
            } else if (item == 'C') {
                c = new Combat(x, y);
                combats.add(c);
                x += SPACE;
            } else if (item == '$') {
                b = new Baggage(x, y);
                baggs.add(b);
                x += SPACE;
            } else if (item == '.') {
                a = new Area(x, y);
                areas.add(a);
                x += SPACE;
            } else if (item == '@') {
                soko = new Player(x, y);
                x += SPACE;
            } else if (item == ' ') {
                x += SPACE;
            }

            h = y;
        }
    }

    public void buildWorld(Graphics g) {

        g.setColor(new Color(255, 255, 255));//Couleur du fond ecran
        g.fillRect(0, 0, this.getWidth(), this.getHeight());//Pour le mettre sur toute la page

        ArrayList world = new ArrayList();
        world.addAll(walls);
        world.addAll(areas);
        world.addAll(baggs);
        world.addAll(portes);
        world.addAll(combats);
        world.add(soko);

        for (int i = 0; i < world.size(); i++) {

            Actor item = (Actor) world.get(i);

            if ((item instanceof Player)
                    || (item instanceof Baggage)) {
                g.drawImage(item.getImage(), item.x() + 2, item.y() + 2, this);
            } else {
                g.drawImage(item.getImage(), item.x(), item.y(), this);
            }
             if (completed) {
                g.setColor(new Color(0, 0, 0));
                g.drawString("Completed", 25, 20);
                restartLevel();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        buildWorld(g);
    }


    class TAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            if (completed) {
                return;
            }

            
            int key = e.getKeyCode();

                
            if (key == KeyEvent.VK_LEFT) {
                if (checkWallCollision(soko,
                        LEFT_COLLISION)) {
                    return;
                }
                if (checkPorteCollision(soko,
                        LEFT_COLLISION)) {
                    chargerLevel();
                    return;
                }

                if (checkBagCollision(LEFT_COLLISION)) {
                    return;
                }

                soko.move(-SPACE, 0);

                if (checkCombatCollision(soko,LEFT_COLLISION)) {
                    return;
                }
                
            } else if (key == KeyEvent.VK_RIGHT) {

                if (checkWallCollision(soko,
                        RIGHT_COLLISION)) {
                    return;
                }
                if (checkPorteCollision(soko,
                        RIGHT_COLLISION)) {
                    chargerLevel();
                   return;
                }
                
                if (checkBagCollision(RIGHT_COLLISION)) {
                    return;
                }

                soko.move(SPACE, 0);
                
                 if (checkCombatCollision(soko,RIGHT_COLLISION)) {
                    return;
                }

            } else if (key == KeyEvent.VK_UP) {

                if (checkWallCollision(soko,
                        TOP_COLLISION)) {
                    return;
                }
                
                if (checkPorteCollision(soko,
                        TOP_COLLISION)) {
                    chargerLevel();
                    return;
                }
                
                if (checkBagCollision(TOP_COLLISION)) {
                    return;
                }

                soko.move(0, -SPACE);
                
                if (checkCombatCollision(soko,TOP_COLLISION)) {
                    return;
                }

            } else if (key == KeyEvent.VK_DOWN) {

                if (checkWallCollision(soko,
                        BOTTOM_COLLISION)) {
                    return;
                }
                
                if (checkPorteCollision(soko,
                        BOTTOM_COLLISION)) {
                    chargerLevel();
                    return;
                }
                
                if (checkBagCollision(BOTTOM_COLLISION)) {
                    return;
                }

                soko.move(0, SPACE);
                
                if (checkCombatCollision(soko,BOTTOM_COLLISION)) {
                    return;
                }

            } else if (key == KeyEvent.VK_R) {
                restartLevel();
            }

            repaint();
        }
    }

    
    private boolean checkWallCollision(Actor actor, int type) {

        if (type == LEFT_COLLISION) {

            for (int i = 0; i < walls.size(); i++) {
                Wall wall = (Wall) walls.get(i);
                if (actor.isLeftCollision(wall)) {
                    return true;
                }
            }
            return false;

        } else if (type == RIGHT_COLLISION) {

            for (int i = 0; i < walls.size(); i++) {
                Wall wall = (Wall) walls.get(i);
                if (actor.isRightCollision(wall)) {
                    return true;
                }
            }
            return false;

        } else if (type == TOP_COLLISION) {

            for (int i = 0; i < walls.size(); i++) {
                Wall wall = (Wall) walls.get(i);
                if (actor.isTopCollision(wall)) {
                    return true;
                }
            }
            return false;

        } else if (type == BOTTOM_COLLISION) {

            for (int i = 0; i < walls.size(); i++) {
                Wall wall = (Wall) walls.get(i);
                if (actor.isBottomCollision(wall)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

     private boolean checkPorteCollision(Actor actor, int type) {
    
        if (type == LEFT_COLLISION) {

            for (int i = 0; i < portes.size(); i++) {
                Porte entree = (Porte) portes.get(i);
                if (actor.isLeftCollision(entree)) {
                    entreeG=true;
                    return true;
                }
            }
            return false;

        } else if (type == RIGHT_COLLISION) {

            for (int i = 0; i < portes.size(); i++) {
                 Porte entree = (Porte) portes.get(i);
                if (actor.isRightCollision(entree)) {
                    entreeD=true;
                    return true;
                }
            }
            return false;

        } else if (type == TOP_COLLISION) {

            for (int i = 0; i < portes.size(); i++) {
                Porte entree = (Porte) portes.get(i);
                if (actor.isTopCollision(entree)) {
                    entreeH=true;
                    return true;
                }
            }
            return false;

        } else if (type == BOTTOM_COLLISION) {

            for (int i = 0; i < portes.size(); i++) {
                Porte entree = (Porte) portes.get(i);
                if (actor.isBottomCollision(entree)) {
                    entreeB=true;
                    return true;
                }
            }
            return false;
        }
        return false;
    }
     
     private void lancerCombat(){//--------------------------------------------- A MODIFIER ------------------------------------
         //Faire la partie combat !
         System.out.println("Entrez dans lancerCombat()");
         
     }
     
      private boolean checkCombatCollision(Actor actor ,int type) {
          if (type == LEFT_COLLISION) {
              for (int i = 0; i < combats.size(); i++) {
                Combat combat = (Combat) combats.get(i);
                if (actor.isLeftCollision(combat)) {
                    
                    int a = (int)(Math.random()*(10-0))+1;
                
                    if (a>5){  
                       lancerCombat();
                       return true;
                    }
                
                }
              }
                
          }
          else if (type == RIGHT_COLLISION) {
           
              for (int i = 0; i < combats.size(); i++) {
                Combat combat = (Combat) combats.get(i);
                if (actor.isRightCollision(combat)) {
                    
                    int a = (int)(Math.random()*(10-0))+1;
                
                    if (a>5){  
                       lancerCombat();
                       return true;
                    }
                
                }
              }
          }
          else if (type == TOP_COLLISION) {
           
              for (int i = 0; i < combats.size(); i++) {
                Combat combat = (Combat) combats.get(i);
                if (actor.isTopCollision(combat)) {
                    
                    int a = (int)(Math.random()*(10-0))+1;
                
                    if (a>5){  
                       lancerCombat();
                       return true;
                    }
                
                }
              }
          }
          else if (type == BOTTOM_COLLISION) {
            
              for (int i = 0; i < combats.size(); i++) {
                Combat combat = (Combat) combats.get(i);
                if (actor.isBottomCollision(combat)) {
                    
                    int a = (int)(Math.random()*(10-0))+1;
                
                    if (a>5){  
                       lancerCombat();
                       return true;
                    }
                
                }
              }
          }
          return false;
      }
   

          
      private boolean checkBagCollision(int type) {

        if (type == LEFT_COLLISION) {

            for (int i = 0; i < baggs.size(); i++) {

                Baggage bag = (Baggage) baggs.get(i);
                if (soko.isLeftCollision(bag)) {

                    for (int j=0; j < baggs.size(); j++) {
                        Baggage item = (Baggage) baggs.get(j);
                        if (!bag.equals(item)) {
                            if (bag.isLeftCollision(item)) {
                                return true;
                            }
                        }
                        if (checkWallCollision(bag,
                                LEFT_COLLISION)) {
                            return true;
                        }
                    }
                    bag.move(-SPACE, 0);
                    isCompleted();
                }
            }
            return false;

        } else if (type == RIGHT_COLLISION) {

            for (int i = 0; i < baggs.size(); i++) {

                Baggage bag = (Baggage) baggs.get(i);
                if (soko.isRightCollision(bag)) {
                    for (int j=0; j < baggs.size(); j++) {

                        Baggage item = (Baggage) baggs.get(j);
                        if (!bag.equals(item)) {
                            if (bag.isRightCollision(item)) {
                                return true;
                            }
                        }
                        if (checkWallCollision(bag,
                                RIGHT_COLLISION)) {
                            return true;
                        }
                    }
                    bag.move(SPACE, 0);
                    isCompleted();                   
                }
            }
            return false;

        } else if (type == TOP_COLLISION) {

            for (int i = 0; i < baggs.size(); i++) {

                Baggage bag = (Baggage) baggs.get(i);
                if (soko.isTopCollision(bag)) {
                    for (int j = 0; j < baggs.size(); j++) {

                        Baggage item = (Baggage) baggs.get(j);
                        if (!bag.equals(item)) {
                            if (bag.isTopCollision(item)) {
                                return true;
                            }
                        }
                        if (checkWallCollision(bag,
                                TOP_COLLISION)) {
                            return true;
                        }
                    }
                    bag.move(0, -SPACE);
                    isCompleted();
                }
            }

            return false;

        } else if (type == BOTTOM_COLLISION) {
        
            for (int i = 0; i < baggs.size(); i++) {

                Baggage bag = (Baggage) baggs.get(i);
                if (soko.isBottomCollision(bag)) {
                    for (int j = 0; j < baggs.size(); j++) {

                        Baggage item = (Baggage) baggs.get(j);
                        if (!bag.equals(item)) {
                            if (bag.isBottomCollision(item)) {
                                return true;
                            }
                        }
                        if (checkWallCollision(bag,
                                BOTTOM_COLLISION)) {
                            return true;
                        }
                    }
                    bag.move(0, SPACE);
                    isCompleted();
                }
            }
        }

        return false;
    }

    
    public void isCompleted() {

        int num = baggs.size();
        int compl = 0;

        for (int i = 0; i < num; i++) {
            Baggage bag = (Baggage) baggs.get(i);
            for (int j = 0; j < num; j++) {
                Area area = (Area) areas.get(j);
                if (bag.x() == area.x()
                        && bag.y() == area.y()) {
                    compl += 1;
                }
            }
        }

        if (compl == num) {
            completed = true;
            repaint();
        }
    }
    public void clearLevel(){
        combats.clear();
        areas.clear();
        baggs.clear();  
        walls.clear();
        portes.clear();
        entreeG=false;
        entreeD=false;
        entreeH=false;
        entreeB=false;
    }

    public void restartLevel() {
        clearLevel();
        initWorld();
        if (completed) {
            completed = false;
        }
    }
    
    public final void chargerLevel(){
        combats.clear();
        areas.clear();
        baggs.clear();  
        walls.clear();
        portes.clear();
        modifierPage();
        initWorld();
        if (completed) {
            completed = false;
        }
    }
}