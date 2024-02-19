package org.example.javaIntermedioEjercicio5;

abstract class Forma {

   private String tipo;

    public Forma(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "tipo='" + tipo + '\'' +
                '}';
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract void mostrarInformacion();
}


