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
public class Objet {
    private static int numero = 1;
    private String nom;
    private float poids;

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Objet.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }
    
    public Objet(String nom, float poids){
        super();
        this.nom = nom;
        this.poids = poids;
        this.numero=this.numero+1;
    }
}
