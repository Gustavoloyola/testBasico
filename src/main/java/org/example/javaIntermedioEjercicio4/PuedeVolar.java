package org.example.javaIntermedioEjercicio4;

public interface PuedeVolar {
    public default void volar(){
        System.out.println("Puede volar");
    };
}
