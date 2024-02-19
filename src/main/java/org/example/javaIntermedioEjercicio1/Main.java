package org.example.javaIntermedioEjercicio1;

import java.util.Scanner;

//6.	Escribe una clase en Java llamada "CuentaBancaria" que
// tenga atributos para el saldo y los métodos para depositar y retirar dinero.
// Implementa también un método para verificar si el saldo es suficiente
// para una transacción de retiro.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int saldoInicial = 10000;


        while (true) {
            System.out.println("Bienvenido al cajero");
            System.out.println("1. Deposito");
            System.out.println("2. Retiro");
            System.out.println("3. Mostrar saldo");
            System.out.println("4. salir");

            int opcion= sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingresa la cantidad a depositar:");
                    int deposito= sc.nextInt();
                    System.out.println("Tu deposito se realizo con exito, tu saldo actual es:");
                    System.out.println(saldoDeposito(saldoInicial,deposito));
                    break;
                case 2:
                    System.out.println("Ingresa la cantidad a retirar");
                    int retiro=sc.nextInt();
                    if (saldoInicial<retiro){
                        System.out.println("saldo insuficiente");
                    }else{
                        System.out.println("Retiro exitoso, tu nuevo saldo es:");
                        System.out.println(saldoRetiro(saldoInicial,retiro));
                    }
                    break;
                case 3:
                    System.out.println("tu saldo actual es: " + saldoInicial);
                    break;
                case 4:
                    System.out.println("hasta luego.");
                    return;
                default:
                    System.out.println("opcion invalida, ingresa otra opcion.");






            }


        }
    }
public static int saldoDeposito(int saldoInicial,int deposito){
        return saldoInicial+deposito;
}
public static int saldoRetiro(int saldoInicial,int retiro) {
   return saldoInicial-retiro;

}
}