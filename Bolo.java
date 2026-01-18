package soBolos;

public abstract class Bolo implements IBolo {
	private int codigo;
	private double custo;
	private IFormato formato;
	
	public Bolo(int codigo, double custo) {
		this.setCodigo(codigo);
		this.setCusto(custo);
	}
	
	public Bolo(int codigo, double custo, IFormato formato) {
        this.setCodigo(codigo);
        this.setCusto(custo);
        this.setFormato(formato);
    }
	
	public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public double getCusto() { return custo; }
    public void setCusto(double custo) { this.custo = custo; }

    public IFormato getFormato() { return formato; }
    public void setFormato(IFormato formato) { this.formato = formato; }
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Bolo b = (Bolo) o;
        if (o == null || getClass() != o.getClass()) return false;
        return codigo == b.codigo;
    }

    @Override
    public String toString() {
        return 
       "[CÓD: " + codigo +
       " | Custo: R$ " + custo +
       "]";
    }
}
