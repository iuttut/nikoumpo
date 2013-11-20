
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NicolasDucViet
 */
public class Heros extends Personnage {
    private int pv;
    private int mp;
    private int lvl;
    private float exp;
    private int pepite;
    private int gold;
    private int humeur;
    private int ennui;
    private int faim;
    private int sommeil;
    private int atk;
    private int def;
    private float crit;
    private int vitesse;
    private int ep;
    private int epPv;
    private int epMp;
    
    private int pvActuel;
    private int faimActuel;
    private int sommeilActuel;
    private int humeurActuel;

    public int getPv() {
        return pv;
    }

    public int getMp() {
        return mp;
    }

    public int getLvl() {
        return lvl;
    }

    public float getExp() {
        return exp;
    }

    public int getHumeur() {
        return humeur;
    }

    public int getFaim() {
        return faim;
    }

    public int getSommeil() {
        return sommeil;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public float getCrit() {
        return crit;
    }

    public int getVitesse() {
        return vitesse;
    }

    public int getEp() {
        return ep;
    }

    public int getEpPv() {
        return epPv;
    }

    public int getEpMp() {
        return epMp;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setExp(float exp) {
        this.exp = exp;
    }

    public void setHumeur(int humeur) {
        this.humeur = humeur;
    }

    public void setFaim(int faim) {
        this.faim = faim;
    }

    public void setSommeil(int sommeil) {
        this.sommeil = sommeil;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setCrit(float crit) {
        this.crit = crit;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }

    public void setEpPv(int epPv) {
        this.epPv = epPv;
    }

    public void setEpMp(int epMp) {
        this.epMp = epMp;
    }

    public int getPvActuel() {
        return pvActuel;
    }

    public void setPvActuel(int pvActuel) {
        this.pvActuel = pvActuel;
    }

    public int getFaimActuel() {
        return faimActuel;
    }

    public void setFaimActuel(int faimActuel) {
        this.faimActuel = faimActuel;
    }

    public int getSommeilActuel() {
        return sommeilActuel;
    }

    public void setSommeilActuel(int sommeilActuel) {
        this.sommeilActuel = sommeilActuel;
    }

    public int getHumeurActuel() {
        return humeurActuel;
    }

    public void setHumeurActuel(int humeurActuel) {
        this.humeurActuel = humeurActuel;
    }

    public int getPepite() {
        return pepite;
    }

    public void setPepite(int pepite) {
        this.pepite = pepite;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getEnnui() {
        return ennui;
    }

    public void setEnnui(int ennui) {
        this.ennui = ennui;
    }
    
    public Heros(String nom, int pv, int pvActuel, int mp, int lvl, float exp, int humeur, 
            int faim, int faimActuel, int sommeil, int sommeilActuel, int atk, int def, float crit, int vitesse, int ep, int epPv, int epMp){
        super(nom);
        this.pv = pv;
        this.pvActuel = pvActuel;
        this.mp = mp;
        this.lvl = lvl;
        this.exp = exp;
        this.humeur = humeur;
        this.humeurActuel = (faimActuel+sommeilActuel)/2;
        this.faim = faim;
        this.faimActuel = faimActuel;
        this.sommeil = sommeil;
        this.sommeilActuel = sommeilActuel;
        this.atk = atk;
        this.def = def;
        this.crit = crit;
        this.vitesse = vitesse;
        this.ep = ep;
        this.epPv = epPv;
        this.epMp = epMp;
    }
    
    public void nourrir(Nourriture n){
        if(this.faimActuel+n.getFaim()>=100){
            this.faimActuel=100;
        }
        else{
            this.faimActuel=this.faimActuel+n.getFaim();
        }
        this.humeurActuel = (faimActuel+sommeilActuel)/2;
    }
    
    public void dormir(Long temps){
        int tps = (((Long) temps).intValue())/60000;
        if(this.sommeilActuel+10*tps>=100){
            this.sommeilActuel=100;
        }
        else{
            this.sommeilActuel=this.sommeilActuel+10*tps;
        }
        this.humeurActuel = (faimActuel+sommeilActuel)/2;
    }
    
    public void miner(){
        this.pepite=this.pepite+1;
    }
    
}
