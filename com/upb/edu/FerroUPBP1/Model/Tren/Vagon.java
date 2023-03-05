package com.upb.edu.FerroUPBP1.Model.Tren;

import com.upb.edu.FerroUPBP1.Lista.LinkedList;
import com.upb.edu.FerroUPBP1.Model.Persona.Cliente;

public class Vagon {
    Cliente pasajero;
    LinkedList<Cliente> listaPasajero = new LinkedList<Cliente>();
    public boolean verificarNumPasajeros(){
        if (listaPasajero.size()>=30){
            return false;
        }
        else{return true;}
    }
    public void añadirPasajerosAlVagon(){
        if (listaPasajero.size()>=30) {
            listaPasajero.add(pasajero);
        }
        else{System.out.println("El Vagon esta lleno");}

    }



}
