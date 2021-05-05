package be.bxl.formation.models;

public class Prof extends Personne {

    //region Champs
    private String course;
    //endregion

    //region Encapsulation
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    //endregion

    //region Constructeur
    public Prof(String prenom, String nom, String course) {
        // Appel du constructeur parent
        super(prenom, nom);

        setCourse(course);
    }
    //endregion

    //region Méthode
    public void donnerCours() {
        System.out.println(getNomComplet() + " donne cours de " + getCourse());
    }
    //endregion
}

