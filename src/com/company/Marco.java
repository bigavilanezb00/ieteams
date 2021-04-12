package com.company;

public class Marco {
    void mostrarHorizontal() {
        System.out.println("\033[35m----------------\033[0m");
    }

    void mostrarIzquierda(){
        System.out.print("\033[35m|\033[0m");
    }

    void mostrarDerecha(){
        System.out.println("\033[35m|\033[0m");
    }

}