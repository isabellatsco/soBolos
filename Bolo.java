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
		this(codigo,custo);
        this.setFormato(formato);
    }

	public int getCodigo() { return codigo; }
	
	public void setCodigo(int codigo) { 
		if(codigo <= 0) {
			System.out.println("Insira um número positivo");
		} 
		else {
			this.codigo = codigo;

		}
	}

	public double getCusto() { return custo; }
	
	public void setCusto(double custo) {
		if(custo <= 0) {
			System.out.println("Insira um valor positivo");
		} 
		else {
			this.custo = custo; 
		}
	}

	public IFormato getFormato() { return formato; }
	
	public void setFormato(IFormato formato) {
		if(formato == null) {
			System.out.println("Insirar um formato válido");
		}
		else {
			this.formato = formato; 
		}
	}
	
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
