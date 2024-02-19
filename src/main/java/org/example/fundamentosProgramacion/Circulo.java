package org.example.fundamentosProgramacion;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
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

    public double calcularArea(){
        return Math.PI*radio*radio;
    }
    public double calcularPerimetro() {
        return (2*Math.PI)*radio;
    }
}
