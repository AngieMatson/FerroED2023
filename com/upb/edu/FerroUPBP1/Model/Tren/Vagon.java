package com.upb.edu.FerroUPBP1.Model.Tren;

import com.upb.edu.FerroUPBP1.Lista.LinkedList;
import com.upb.edu.FerroUPBP1.Model.Persona.Cliente;
import com.upb.edu.FerroUPBP1.Model.Tren.Tren;

public class Vagon {
    Flota tren;
    Tren vagon;
    int cntVagones;
    int vagonesCarga;
    Cliente pasajero;
    LinkedList<Cliente> listaPasajero = new LinkedList<Cliente>();


    public void addPasajerosAlVagon() {
        while(tren.listaTrenes.size()<=8) {
            while (vagon.ListaVagon.size() <= 40) {
                for (int i = 0; i < 30; i++) {
                    listaPasajero.add(pasajero);
                    cntVagones++;
                }

                vagon.ListaVagon.add(listaPasajero);
                if (vagon.ListaVagon.size() % 2 != 0) {
                    vagonesCarga = vagonesCarga + 1;
                    vagon.ListaVagon.add(vagonesCarga);
                    cntVagones++;
                }
                listaPasajero.clear();
                tren.listaTrenes.add(vagon.ListaVagon);
                vagon.ListaVagon.clear();
            }
        }
    }



}
