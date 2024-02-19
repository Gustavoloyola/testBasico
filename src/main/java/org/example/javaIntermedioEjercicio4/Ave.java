package org.example.javaIntermedioEjercicio4;

public class Ave implements PuedeVolar{
    private String Tipo;

    public Ave(String tipo) {
        Tipo = tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "Tipo='" + Tipo + '\'' +
                '}';
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    @Override
    public void volar() {
        System.out.println("El " + this.Tipo +" Puede volar.");

    }
}
