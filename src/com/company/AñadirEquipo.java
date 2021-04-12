package com.company;

public class AñadirEquipo {

    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("AñadirEquipo");

        Equipos equipos = new Equipos();

        CampoTexto campoTexto = new CampoTexto();

        equipos.jugador = campoTexto.pedir("JUGADOR 1", true);
        equipos.jugador = campoTexto.pedir("JUGADOR 2", true);
        equipos.jugador = campoTexto.pedir("JUGADOR 3", true);
        equipos.jugador = campoTexto.pedir("JUGADOR 4", true);
        equipos.jugador = campoTexto.pedir("JUGADOR 5", true);
        equipos.jugador = campoTexto.pedir("JUGADOR 6", true);
        equipos.jugador = campoTexto.pedir("JUGADOR 7", true);
        equipos.jugador = campoTexto.pedir("JUGADOR 8", true);
        equipos.jugador = campoTexto.pedir("JUGADOR 9", true);
        equipos.jugador = campoTexto.pedir("JUGADOR 10", true);
        equipos.jugador = campoTexto.pedir("JUGADOR 11", true);
        equipos.jugador = campoTexto.pedir("JUGADOR 12", true);
        equipos.jugador = campoTexto.pedir("JUGADOR 13", true);
        equipos.jugador = campoTexto.pedir("JUGADOR 14", true);
        equipos.jugador = campoTexto.pedir("JUGADOR 15", true);
        equipos.jugador = campoTexto.pedir("JUGADOR 16", true);
    }
}
