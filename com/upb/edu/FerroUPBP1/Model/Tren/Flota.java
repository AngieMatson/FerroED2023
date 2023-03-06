package com.upb.edu.FerroUPBP1.Model.Tren;

import com.upb.edu.FerroUPBP1.Lista.LinkedList;

public class Flota {
    private LinkedList<Tren> listaTrenes;
    private int maximoTrenes;
    private int trenesActuales;

    public Flota(int maximoTrenes) {
        listaTrenes = new LinkedList<Tren>();
        this.maximoTrenes = maximoTrenes;
        this.trenesActuales = 0;
    }

    public LinkedList<Tren> getListaTrenes() {
        return listaTrenes;
    }

    public void addTren(Tren tren) {
        if (trenesActuales < maximoTrenes) {
            listaTrenes.add(tren);
            trenesActuales++;
        } else {
            System.out.println("Se ha alcanzado el límite máximo de trenes.");
        }
    }

    public int getCantidadTrenes() {
        return listaTrenes.size();
    }
}