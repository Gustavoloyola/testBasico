package org.example.fundamentosProgramacion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {


        int[] numeros = {1, 2, 3, 4, 578, 905, 90, 12};

        int[] numerosOrden = Arrays.stream(numeros).sorted().toArray();

        for(int n:numerosOrden){
            System.out.println(n);
        }

        int size=numerosOrden.length;
        System.out.println("El tamaño del arreglo es: "+size);
        System.out.println("el mayor es:"+numerosOrden[size-1]);
        System.out.println(" ");

      int numeroMayor= Arrays.stream(numerosOrden).max().getAsInt();
        System.out.println("El numero mayor es:");
        System.out.println(numeroMayor);


    }}





