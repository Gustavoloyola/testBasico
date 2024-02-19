package org.example.javaIntermedioEjercicio2;

public class Main {
    public static void main(String[] args) {
        Circulo circulo=new Circulo("Circulo",5);
        Rectangulo rectangulo=new Rectangulo("Rectangulo",12,12);

        System.out.println("El area del "+circulo.getNombreFigura()+" es: ");
        System.out.println( circulo.calcularArea());
        System.out.println("El area del "+ rectangulo.getNombreFigura()+" es: ");
        System.out.println( rectangulo.calcularArea());
    }
}
