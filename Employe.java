public class Employe {
    //Attributs
    protected String nom;
    protected String prenom;
    protected int age;
    protected int anciennete;

    protected final double PRIME = 0.1f;

    //Constructeur
    public Employe(String nom, String prenom, int age, int anciennete) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.anciennete = anciennete;
    }

    //Salaire de base fixe a 2500dh
    public double calculerBaseSalaire(){
        return 2500.0d;
    }

    public double calculerSalaire(){
        double baseSalaire = calculerBaseSalaire();
        double primeAnciennete = baseSalaire * anciennete * PRIME;
        return baseSalaire + primeAnciennete;
    }

    public void afficherInline(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "Nom='" + nom + '\'' +
                ", Prenom='" + prenom + '\'' +
                ", Age=" + age + " ans " +
                ", Anciennete=" + anciennete +
                '}';
    }

    public void afficher() {
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Âge : " + age);
        System.out.println("Ancienneté : " + anciennete + " ans");
        System.out.println("Salaire total : " + calculerSalaire() + " DH");
    }

    //Getters && Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAnciennete() {
        return anciennete;
    }

    public void setAnciennete(int anciennete) {
        this.anciennete = anciennete;
    }

}
