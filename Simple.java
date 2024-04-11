package TD1;

class Simple extends Compte{
    private double TAUX_INTERET = 5;

    public Simple(double solde, TypeCarte typeCarte) {
        super(solde, typeCarte);
    }
    
    public void versement(double montantTTC){
        montantTTC = montantTTC - 5;
        setMontantBanque(5);
        if (super.getSolde() + montantTTC >= 0) {
           super.versement(montantTTC);
        } else {
            System.out.println("Opération impossible : solde insuffisant.");
        }
    }
    public void retrait(double montantTTC){
        montantTTC= montantTTC-5;
        setMontantBanque(5);
        if (super.getSolde() - montantTTC >= 0) {
           super.retrait(montantTTC);
        } else {
            System.out.println("Opération impossible : solde insuffisant.");
        }
    }
    public void virement(double montantTTC, Compte receveur){
        montantTTC = montantTTC - 5;
        setMontantBanque(5);
        if (super.getSolde() - montantTTC >= 0) {
           super.virement(montantTTC, receveur);
        } else {
            System.out.println("Opération impossible : solde insuffisant.");
        }
    }
    
}