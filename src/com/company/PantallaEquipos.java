package com.company;

import java.io.File;
import java.util.Scanner;

public class PantallaEquipos {

    boolean mostrar (){
        Titulo titulo = new Titulo();
        titulo.mostrar("EQUIPOS IE");

        Menu menu = new Menu();
        String[] opciones = {"Raimon", "Royal", "Zeus","Añadir Equipo","Equipo Guardado", "Salir"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)){
            PantallaRaimon pantallaRaimon = new PantallaRaimon();
            pantallaRaimon.mostrar();
        } else if ("2".equals(opcion)){
            PantallaRoyal pantallaRoyal = new PantallaRoyal();
            pantallaRoyal.mostrar();
        } else if ("3".equals(opcion)){
            PantallaZeus pantallaZeus = new PantallaZeus();
            pantallaZeus.mostrar();
        } else if ("4".equals(opcion)){
            AñadirEquipo añadirEquipo = new AñadirEquipo();
            añadirEquipo.mostrar();
        } else if ("5".equals(opcion)){
            EquipoGuardado equipoGuardado = new EquipoGuardado();
            equipoGuardado.mostrar();
        } else if ("6".equals(opcion)){
            return false;
        }
        return true;
    }
}
