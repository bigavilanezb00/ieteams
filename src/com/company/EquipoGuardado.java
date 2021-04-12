package com.company;

public class EquipoGuardado {

    void mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("EQUIPO GUARDADO");

        for(Equipos equipos: Main.losEquipos.equipos){
            System.out.println(equipos.jugador);
        }
    }
}
