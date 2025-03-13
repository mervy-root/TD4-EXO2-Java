public class Manutentionnaire extends Employe {
    private int nbHeures;
    private static final double BASE_SALAIRE_HORAIRE = 20.0; //20.0 dh par heure de travail

    public Manutentionnaire(String nom, String prenom, int age, int anciennete, int nbHeures) {
        super(nom, prenom, age, anciennete);
        this.nbHeures = nbHeures;
    }

    public double calculerSalaire() {
        return BASE_SALAIRE_HORAIRE * nbHeures;
    }

    public void afficher() {
        super.afficher();
        System.out.println("Nombre d'heures travaillées : " + nbHeures);
    }

    public int getNbHeures() {
        return nbHeures;
    }

    public void setNbHeures(int nbHeures) {
        this.nbHeures = nbHeures;
    }



}
