public class Technicien extends Employe{
    private int nbUnitesProduites;
    private static final double BASE = 2500.0d;
    private static final double PART = 0.02d; // 2% du salaire par unité produite
    private static final double GAIN_UNITE = 50.0d; // Gain par unité

    public Technicien(String nom, String prenom, int age, int anciennete, float gainUnite) {
        super(nom, prenom, age, anciennete);
        nbUnitesProduites = 0;
    }

    public double calculerSalaire(){
        return BASE + nbUnitesProduites * PART * GAIN_UNITE;
    }

    public void afficher() {
        super.afficher();
        System.out.println("Nombre d'unités produites : " + nbUnitesProduites);
    }


}
