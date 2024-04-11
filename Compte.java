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

    public void versement(double montantTTC){
        this.solde+=montantTTC;
    }

    public void retrait(double montantTTC){
        this.solde-=montantTTC;
    }
    public void virement(double montantTTC, Compte receveur){
        retrait(montantTTC);
        receveur.versement(montantTTC);
    }

    @Override
    public String toString() {
        return "Compte [solde=" + solde + ", typeCarte=" + typeCarte + "]";
    }
    
    
}
