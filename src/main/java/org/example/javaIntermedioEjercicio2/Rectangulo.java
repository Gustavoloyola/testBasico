package org.example.javaIntermedioEjercicio2;

public class Rectangulo extends FiguraGeometrica{
    private int base;
    private  int altura;

    public Rectangulo(String nombreFigura, int base, int altura) {
        super(nombreFigura);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    @Override
    public double calcularArea() {
        return base*altura;
    }
}
