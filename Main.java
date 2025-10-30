public class Main {
    public static void main(String[] args) {
        Matrice M = new Matrice(3, 4);

        M.setValeur(0, 0, 0.0);
        M.setValeur(0, 1, 2.4);
        M.setValeur(0, 2, 1.89);
        M.setValeur(0, 3, -2.7);

        M.setValeur(1, 0, -0.67);
        M.setValeur(1, 1, 3.1);
        M.setValeur(1, 2, 9.09);
        M.setValeur(1, 3, 8.23);

        M.setValeur(2, 0, -90.3);
        M.setValeur(2, 1, 6.7);
        M.setValeur(2, 2, 7.45);
        M.setValeur(2, 3, -7.1);

        M.afficher();
        System.out.println("####################################");
        Matrice transposee = M.transposee();
        transposee.afficher();
        M.somme(transposee);
    }
}
