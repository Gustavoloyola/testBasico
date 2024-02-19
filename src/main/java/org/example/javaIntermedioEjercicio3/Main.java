package org.example.javaIntermedioEjercicio3;

import java.util.Scanner;

//8.	Escribe una clase en Java llamada "Empleado" que tenga atributos para el nombre, el salario
// y el número de identificación. Implementa métodos para aumentar el salario y mostrar la información
// del empleado.
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        Empleado empleado1 = new Empleado("Fatima", 28000, 1);

        int aumentoSueldo= 1000;



        empleado1.aumentarSalario(aumentoSueldo);
        empleado1.mostrarDatos();

    }


}
