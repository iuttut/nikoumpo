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

public class Utilisateur {
    private static final int MAX = 4;
    
    private static int numero;
    private String pseudo;
    private String password;
    private Personnage tab_perso[] = new Personnage[MAX];

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Utilisateur.numero = numero;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Personnage[] getTab_perso() {
        return tab_perso;
    }

    public void setTab_perso(Personnage[] tab_perso) {
        this.tab_perso = tab_perso;
    }
    
    public Utilisateur(String pseudo, String password){
        this.pseudo=pseudo;
        this.password=password;
        this.numero=this.numero+1;
    }
}
