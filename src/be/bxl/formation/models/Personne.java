package be.bxl.formation.models;

import java.util.ArrayList;

public class Personne {

    //region Champs
    private String nom;
    private String prenom;
    //endregion

    //region Encapsulation
    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getNomComplet() {
        return getPrenom() + " " + getNom();
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    }
    //endregion

    //region Constructeur
    public Personne(String prenom, String nom ){
        setNom(nom);
        setPrenom(prenom);
    }
    //endregion


    //region Méthode
    public void manger(String repas) {
        System.out.println(getNomComplet() + " mange " + repas);
    }

    public void dormir() {
        System.out.println(getNomComplet() + " dort!");
    }

    @Override
    public String toString() {
        return this.getNomComplet();
    }
    //endregion
}
