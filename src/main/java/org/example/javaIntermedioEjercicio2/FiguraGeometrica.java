package org.example.javaIntermedioEjercicio2;

abstract class FiguraGeometrica {
private String nombreFigura;

    public FiguraGeometrica(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "nombreFigura='" + nombreFigura + '\'' +
                '}';
    }

    public abstract double calcularArea();
}
