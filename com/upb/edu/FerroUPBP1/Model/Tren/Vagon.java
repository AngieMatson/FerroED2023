package com.upb.edu.FerroUPBP1.Model.Tren;

import com.upb.edu.FerroUPBP1.Lista.LinkedList;
import com.upb.edu.FerroUPBP1.Model.Persona.Cliente;
import com.upb.edu.FerroUPBP1.Model.Tren.Tren;

public class Vagon {
    LinkedList<Cliente> listaPasajero = new LinkedList<Cliente>();
    LinkedList<Object> ListaVagon = new LinkedList<Object>();


    public void addPasajerosAlVagon(LinkedList<Cliente> pasajeros) {
        int totalVagones = 0;
        while (totalVagones < 40) {
            // Cada dos vagones de pasajeros se agrega un vagon de carga
            if (totalVagones % 3 == 2) {
                ListaVagon.add(new VagonDeCarga());
                totalVagones++;
            } else {
                // Se agrega un vagon de pasajeros
                VagonDePasajeros vagon = new VagonDePasajeros();
                int maxPasajeros = (totalVagones == 0) ? 26 : 30;
                for (int i = 0; i < maxPasajeros; i++) {
                    if (pasajeros.isEmpty()) {
                        break;
                    }
                    vagon.addPasajero(pasajeros.getFirst());
                    pasajeros.remove(pasajeros.getFirst());
                }
                ListaVagon.add(vagon);
                totalVagones++;
            }
        }
        // Si el número de vagones de pasajeros es impar, se agrega un vagon de carga
        if (totalVagones % 3 == 2) {
            ListaVagon.add(new VagonDeCarga());
        }
    }

    private class VagonDePasajeros {
        LinkedList<Cliente> listaPasajero = new LinkedList<Cliente>();

        public void addPasajero(Cliente pasajero) {
            listaPasajero.add(pasajero);
        }
    }

    private class VagonDeCarga {
        // Clase vacía para representar un vagon de carga
    }
}
