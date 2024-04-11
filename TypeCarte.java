package TD1;

public enum TypeCarte {
    CB(0),
    VISA(5),
    MASTERCARD(10);

    private int cost;

    TypeCarte(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
