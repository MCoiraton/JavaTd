package TD1;

public class Premium extends Compte{

    public Premium(double solde, TypeCarte typeCarte) {
        super(solde-150, typeCarte);
        setMontantBanque(150);
    }

}
