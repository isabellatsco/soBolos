package soBolos;

public class Redondo implements IFormato {
    private double raio;

    public Redondo(double raio) {
        setRaio(raio);
    }

    
    public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		if(raio <= 0) {
			System.out.println("Insira um valor positivo para o raio");
		} 
		else {
			this.raio = raio;

		}
	}


	@Override
    public double area() {
        return Math.PI * (raio*raio);
    }
}