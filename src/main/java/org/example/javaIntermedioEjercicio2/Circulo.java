package org.example.javaIntermedioEjercicio2;

class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(String nombreFigura, int radio) {
        super(nombreFigura);
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
}