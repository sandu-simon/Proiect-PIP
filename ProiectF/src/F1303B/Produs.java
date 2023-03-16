package F1303B;

public abstract class Produs {
    protected Brand brn;
    protected Produs(Brand b){
        brn=b;
    }

    abstract public String tipProdus();
}
