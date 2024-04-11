package TD1;

public class Payant extends Compte {
    private double decouvert;

    public Payant(double solde, TypeCarte typeCarte, double decouvert) {
        super(solde - 50, typeCarte);
        setMontantBanque(50);
        this.decouvert = decouvert;
    }

    public void versement(double montant) {
        setMontantBanque(1);
        super.versement(montant - 1);
    }

    public void retrait(double montant) {
        montant += 1;
        if (super.getSolde() - montant >= decouvert) {
            super.retrait(montant);
            setMontantBanque(1);
        } else
            System.out.println("découvert atteint");
    }

    public void virement(double montant, Compte receveur){
        montant+=1;
        
        if (super.getSolde()-montant>=decouvert){
            super.virement(montant, receveur);
            setMontantBanque(1);
        }
        else System.out.println("découvert atteint");   
    }
}
