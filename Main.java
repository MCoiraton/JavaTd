package TD1;

public class Main {
    public static void main(String[] args) {
        Payant p1 = new Payant(1500.50, TypeCarte.VISA, 50000);
        Simple s1= new Simple(2500, TypeCarte.CB);
        Premium pr1= new Premium(608840.60, TypeCarte.MASTERCARD);

        System.out.println(p1.compteToString());
        System.out.println(s1.compteToString());
        System.out.println(pr1.compteToString());

        p1.versement(500);
        s1.retrait(50);
        pr1.virement(1500, p1);

        
        System.out.println(p1.compteToString());
        System.out.println(s1.compteToString());
        System.out.println(pr1.compteToString());

        System.out.println(Compte.banqueToString());
    }
}
