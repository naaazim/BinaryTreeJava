public class Matrice{
    private double[][]matrice;
    private int n;
    private int m;
    public Matrice(int n, int m){
        this.n = n;
        this.m = m;
        matrice = new double[n][m];
    }
    public void setValeur(int i, int j, double valeur) throws IllegalArgumentException{
        if(i < 0 || i > n || j < 0 || j > m) throw new IllegalArgumentException("verifiez que 0 <= i <= n et 0 <= j <= m");
        matrice[i][j] = valeur;
    }
    public double getValeur(int i, int j){
        if(i < 0 || i > n || j < 0 || j > m) throw new IllegalArgumentException("verifiez que 0 <= i <= n et 0 <= j <= m");
        return matrice[i][j];
    }
    public int getN() {
        return n;
    }
    public int getM() {
        return m;
    }
    public Matrice somme(Matrice autre) throws IllegalArgumentException{
        if(autre.getM() != m || autre.getN() != n){
            throw new IllegalArgumentException("Les taille des matrices doivent être égales");
        }
        Matrice resultat = new Matrice(n, m);
        double coefficient;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                coefficient = (matrice[i][j] + autre.getValeur(i, j));
                resultat.setValeur(i, j, coefficient); 
            }
        }
        return resultat;
    }
    public Matrice transposee(){
        Matrice resultat = new Matrice(m, n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                resultat.setValeur(j, i, matrice[i][j]);
            }
        }
        return resultat;
    }
    public void afficher() {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print(matrice[i][j] + "\t"); 
        }
        System.out.println(); 
    }
}

}