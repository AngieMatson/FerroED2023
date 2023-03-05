package com.upb.edu.FerroUPBP1.Model.Tren;

import com.upb.edu.FerroUPBP1.Lista.LinkedList;

public abstract class Tren {
    Vagon xd;
    LinkedList<Object> ListaVagon = new LinkedList<Object>();
    public void NumeroVagones(){
        if (xd.verificarNumPasajeros()){
            ListaVagon.add(xd);
        }
    }



}
