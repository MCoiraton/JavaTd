package TD1;

abstract class Compte  {
    private static int code=0;
    private double solde;
    private TypeCarte typeCarte;

    public Compte(double solde, TypeCarte typeCarte) {
        this.code = code++;
        this.solde = solde;
        this.typeCarte = typeCarte;
    }

    public double getSolde() {
        return solde;
    }
    public void setSolde(int solde) {
        this.solde = solde;
    }


    
}
