package F1303B;

public class Tricou extends Produs{
	protected Tricou(Brand b) {
		super(b);
	}

	public String tipProdus(){
		return "Tricou de la "+brn.numeBrand();
    }
    
}
