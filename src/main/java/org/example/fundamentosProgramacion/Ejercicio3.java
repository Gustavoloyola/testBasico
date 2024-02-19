package org.example.fundamentosProgramacion;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingresa un numero:");
        int num=sc.nextInt();

        if (num%2  != 0){
            System.out.println("El numero " + num +" es primo");

        }else{
            System.out.println("el numero " + num +" es par");
        }
    }

}
