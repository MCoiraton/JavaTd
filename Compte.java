package TD1;

abstract class Compte  {
    private static int nbCompte=0;
    private int code;
    private double solde;
    private TypeCarte typeCarte;

    public Compte(double solde, TypeCarte typeCarte) {
        nbCompte++;
        this.code=nbCompte;
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

    public String CompteToString() {
        return "Compte numéro"+code+" [solde=" + solde + ", typeCarte=" + typeCarte + "]";
    }
    
    
}
