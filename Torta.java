package soBolos;

public class Torta extends Bolo {
	private boolean recheio = true;
	private boolean cobertura = true;
	
	public Torta(int codigo, double custo, IFormato formato) {
		super(codigo, custo, formato);
	}
	
	public Torta(int codigo, double custo, IFormato formato, boolean recheio, boolean cobertura) {
		super(codigo, custo, formato);
		this.setRecheio(recheio);
		this.setCobertura(cobertura);
	}

	public boolean isRecheio() { return recheio;}
	public void setRecheio(boolean recheio) { this.recheio = recheio;}

	public boolean isCobertura() { return cobertura; }
	public void setCobertura(boolean cobertura) { this.cobertura = cobertura; }

	@Override
	public double preco() {
		double precoBase = this.getCusto() * this.getFormato().area();
		double precoRecheio = this.isRecheio() ? 20 : 0;
		double precoCobertura = this.isCobertura() ? 12.50 : 0;
		return precoBase + precoRecheio + precoCobertura;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Torta\n" +
        	"⤷ Preço: " + this.preco() +
        	" | Formato: " + this.getFormato().getClass().getSimpleName() +
			(this.isRecheio() ? "Sem" : "Com") + " Recheio" +
			(this.isCobertura() ? "Sem" : "Com") + " Cobertura";
        
    }
	
}
