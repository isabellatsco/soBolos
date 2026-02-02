package soBolos;

public class BoloSimples extends Bolo {
	private boolean semLactose = false;
	
	public BoloSimples(int codigo, double custo, IFormato formato) {
		super(codigo, custo, formato);
		
	}
	
	public BoloSimples(int codigo, double custo, IFormato formato, boolean semLactose) {
		super(codigo, custo, formato);
		this.setSemLactose(semLactose);
	}

	public boolean isSemLactose() { return semLactose; }
	public void setSemLactose(boolean semLactose) { this.semLactose = semLactose; }

	@Override
	public double preco() {
		double precoBase = this.getCusto() * this.getFormato().area();
		return precoBase + (this.isSemLactose() ? 25 : 0);
	}
	
	@Override
	public String toString() {
		return super.toString() + " Bolo Simples\n" +
        	"⤷ Preço: " + this.preco() +
        	" | Formato: " + this.getFormato().getClass().getSimpleName() +
        	(this.isSemLactose() ? "Sem" : "Com") + " Lactose";
        
    }
	
}
