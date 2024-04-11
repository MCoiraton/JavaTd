package TD1;

abstract class Compte  {
    private static int nbCompte=0;
    private int code;
    private double solde;
    private TypeCarte typeCarte;
    private static double montantBanque;
    private static int nbOperations;

    public Compte(double solde, TypeCarte typeCarte) {
        nbCompte++;
        this.code=nbCompte;
        this.solde = solde - typeCarte.getCost();
        setMontantBanque(typeCarte.getCost());
        this.typeCarte = typeCarte;
    }

    public static void setMontantBanque(double montantBanque) {
        Compte.montantBanque = montantBanque;
    }

    public double getSolde() {
        return solde;
    }
    public void setSolde(int solde) {
        this.solde = solde;
    }

    public void versement(double montantTTC){
        this.solde+=montantTTC;
        nbOperations++;
    }

    public void retrait(double montantTTC){
        this.solde-=montantTTC;
        nbOperations++;
    }
    public void virement(double montantTTC, Compte receveur){
        retrait(montantTTC);
        receveur.versement(montantTTC);
        nbOperations++;
    }

    public String compteToString() {
        return "Compte numéro"+code+" [solde=" + solde + ", typeCarte=" + typeCarte + "]";
    }
    
    public String banqueToString(){
        return "montant ammassé par la banque : "+montantBanque+" pour " +nbOperations+" operations";
    }
    
}
