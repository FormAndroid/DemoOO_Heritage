package be.bxl.formation.models;

import java.util.Random;

public class Etudiant extends Personne {

    //region Champs
    private String hobby;
    private double resultat;
    //endregion

    //region Encapsulation
    public double getResultat() {
        return resultat;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setResultat(double resultat) {
        this.resultat = resultat;
    }
    //endregion

    //region Constructeur
    public Etudiant(String prenom, String nom, double resultat) {
        super(prenom, nom);

        setResultat(resultat);
        setHobby(null);
    }

    public Etudiant(String prenom, String nom, double resultat, String hobby) {
        this(prenom, nom, resultat);

        setHobby(hobby);
    }
    //endregion

    //region Méthode
    public void suivreCours(Prof professeur) {
        System.out.println(getNomComplet() + " suit le cours de " + professeur.getNomComplet());
    }

    public void guindailler() {
        System.out.println(getNomComplet() + " guindaille !");
        super.manger("Pita");
    }

    @Override
    public void dormir() {
        Random rng = new Random();

        if(rng.nextInt(4) > 2) {
            guindailler();
        }

        super.dormir();
    }

    //endregion
}
