package com.upb.edu.FerroUPBP1.Model.Tren;

import com.upb.edu.FerroUPBP1.Lista.LinkedList;
import com.upb.edu.FerroUPBP1.Lista.Node;
import com.upb.edu.FerroUPBP1.Model.Persona.Cliente;

public class Tren {
    private static final int MAX_PASAJEROS_PRIMER_VAGON = 26;
    private static final int MAX_PASAJEROS_VAGONES_PASAJEROS = 30;
    private static final int VAGONES_PASAJEROS_POR_CARGA = 2;

    private int trenId;
    private LinkedList<Vagon> listaVagones = new LinkedList<>();

    public Tren(int trenId) {
        this.trenId = trenId;
    }

    public void agregarVagon(Vagon vagon) {
        listaVagones.add(vagon);
    }

    public int getCantidadVagones() {
        return listaVagones.size();
    }

    public int getTrenId() {
        return trenId;
    }
}



