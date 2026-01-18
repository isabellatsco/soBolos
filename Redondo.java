package soBolos;

public class Redondo implements IFormato {
    private double raio;

    public Redondo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * (raio*raio);
    }
}