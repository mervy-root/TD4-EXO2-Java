public class Main {
    public static void main(String[] args) {
        Employe employe1 = new Employe("Dupont", "Jean", 35, 5);

        System.out.println("---------------------");
        employe1.afficher();
        System.out.println("---------------------");
        Employe employe2 = new Commercial("Durand", "Paul", 40, 5, 50000);
        Employe employe3 = new Technicien("Martin", "Sophie", 30, 3, 300);
        Employe employe4 = new Manutentionnaire("Leroy", "Marc", 25, 2, 160);

        employe2.afficher();
        System.out.println("---------------------");
        employe3.afficher();
        System.out.println("---------------------");
        employe4.afficher();

    }
}
