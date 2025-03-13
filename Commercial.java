public class Commercial extends Employe {
    private double chiffreAffaire;
    private static final double PART = 0.2; // 2% du chiffre d'affaires
    private static final double BASE = 2500.0d;



    public Commercial(String nom, String prenom, int age, int anciennete, double chiffreAffaire) {
        super(nom, prenom, age, anciennete);
        this.chiffreAffaire = (BASE + chiffreAffaire * PART);
    }

    public double calculerSalaire() {
        return BASE + chiffreAffaire * PART;
    }

    public void afficher() {
        super.afficher();
        System.out.println("Chiffre d'affaires : " + chiffreAffaire + " DH");
    }
}
