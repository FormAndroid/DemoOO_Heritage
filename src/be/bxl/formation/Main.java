package be.bxl.formation;

import be.bxl.formation.models.Etudiant;
import be.bxl.formation.models.Personne;
import be.bxl.formation.models.Prof;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Prof prof = new Prof("Balthazar", "Picsou", "Finance");

        prof.manger("Pates");
        prof.donnerCours();
        prof.dormir();
        System.out.println();

        Etudiant zaza = new Etudiant("Zaza", "Vanderquack", 18);

        zaza.suivreCours(prof);
        zaza.dormir();
        System.out.println();
        zaza.suivreCours(prof);
        zaza.dormir();
        System.out.println();
        zaza.suivreCours(prof);
        zaza.dormir();
        System.out.println();
        zaza.suivreCours(prof);
        zaza.dormir();
        System.out.println();


        //  - Polymorphisme
        // Un type de donnée est composé de tout les types dont il hérite.
        // Exemple : Prof -> Personne -> Object

        ArrayList<Personne> personnes = new ArrayList<>();

        personnes.add(prof);
        personnes.add(zaza);
        personnes.add(new Personne("Donald", "Duck"));
        personnes.add(new Etudiant("Riri", "Duck", 8, "Peche"));
        personnes.add(new Etudiant("Loulou", "Duck", 1, "Dormir"));

        System.out.println("Liste des personnes : ");
        for (Personne p : personnes) {
            System.out.println(" - " + p); // Conversion implicite en String -> .toString()
        }
        System.out.println();

        System.out.println("Je veux faire guindailler tout les personnes qui sont etudiant");
        for (Personne p : personnes) {

            // Je test si la personne a le type "Etudiant"
            if(p instanceof Etudiant) {
                Etudiant e = (Etudiant) p;
                e.guindailler();
            }
        }
        System.out.println();

    }
}
