package org.example.javaIntermedioEjercicio5;

public class Main {
    public static void main(String[] args) {
        Rectangulo rec1=new Rectangulo("rectangulo",10,5,12,5);
        Circulo cir1=new Circulo("circulo",50);

        System.out.println(rec1.calcularArea());
        System.out.println( rec1.calcularPerimetro());
        System.out.println(rec1);

        System.out.println("Calculos circulo: ");
        System.out.println(cir1.calcularArea());
        System.out.println( cir1.calcularPerimetro());
        System.out.println(cir1);
    }
}
