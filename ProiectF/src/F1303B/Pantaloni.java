package F1303B;

public class Pantaloni extends Produs {
	Pantaloni(Brand b){
        super(b);
    }
    
    public String tipProdus(){
        return "Pantaloni de la "+brn.numeBrand();
    }
}
