package org.example.javaIntermedioEjercicio5;

public class Rectangulo extends Forma implements Calculos{
    private int base;
    private int altura;

    private int lado1;

    private int lado2;

    public Rectangulo(String tipo, int base, int altura, int lado1, int lado2) {
        super(tipo);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
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

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", lado1=" + lado1 +
                ", lado2=" + lado2 +
                '}';
    }

    @Override
    public void mostrarInformacion() {

    }

    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public double calcularPerimetro() {
        return (lado1*2)+(lado2*2);
    }
}
