package Tama;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NicolasDucViet
 */
public class Nourriture extends Objet{
    private int faim;

    public int getFaim() {
        return faim;
    }

    public void setFaim(int faim) {
        this.faim = faim;
    }
    
    public Nourriture(String nom, float poids, int faim){
        super(nom, poids);
        this.faim = faim;
    }
}
