package soBolos;

public class Quadrado implements IFormato {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado*lado;
    }
}