package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static LosEquipos losEquipos = new LosEquipos();

    public static void main(String[] args) {

        PantallaEquipos pantallaEquipos = new PantallaEquipos();
        while(pantallaEquipos.mostrar()) { }

    }
}
