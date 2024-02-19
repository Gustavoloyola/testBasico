package org.example.javaIntermedioEjercicio5;

public class Circulo extends Forma implements Calculos{
    private double radio;

    public Circulo(String tipo, double radio) {
        super(tipo);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

    @Override
    public double calcularArea() {
        return Math.PI*radio*radio;
    }

    @Override
    public double calcularPerimetro() {
        return (2*Math.PI)*radio;
    }

    @Override
    public void mostrarInformacion() {

    }
}
