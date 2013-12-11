package Tama.gestionPerso;

import Tama.gestionObjets.Objet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NicolasDucViet
 */
public class Personnage {
    private static final int MAX = 10;
    
    private static int numero=1;
    private String nom;
    private Objet inventaire[] = new Objet[MAX];

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Personnage.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Objet[] getInventaire() {
        return inventaire;
    }

    public void setInventaire(Objet[] inventaire) {
        this.inventaire = inventaire;
    }
    
    public Personnage(String nom){
        super();
        this.nom=nom;
        this.numero=this.numero+1;
    }
}
