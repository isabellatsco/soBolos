package soBolos;

public class Quadrado implements IFormato {
    private double lado;

    public Quadrado(double lado) {
        setLado(lado);
    }

    
    public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		if(lado <= 0) {
			System.out.println("Insira um valor positivo para o lado"); 
		} else {
			this.lado = lado;
		}
	}


	@Override
    public double area() {
        return lado*lado;
    }
}