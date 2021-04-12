package com.company;

public class Titulo {
    void mostrar(String nombre){
        Marco marco = new Marco();
        marco.mostrarHorizontal();
        marco.mostrarIzquierda();
        System.out.print(nombre);
        marco.mostrarDerecha();
        marco.mostrarHorizontal();

        System.out.println("Elige un equipo: ");
    }
}
