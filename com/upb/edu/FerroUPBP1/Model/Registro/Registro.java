package com.upb.edu.FerroUPBP1.Model.Registro;

import com.upb.edu.FerroUPBP1.Model.Persona.Cliente;
import com.upb.edu.FerroUPBP1.Model.Tiquete.Tiquete;

import java.util.LinkedList;

public class Registro {
    private LinkedList<Tiquete> tiquetes;

    public Registro() {
        this.tiquetes = new LinkedList<Tiquete>();
    }

    public void agregarTiquete(Tiquete tiquete) {
        this.tiquetes.add(tiquete);
    }

    public Tiquete buscarTiquete(int numeroTiquete) {
        for (Tiquete tiquete : this.tiquetes) {
            if (tiquete.getNumeroTiquete() == numeroTiquete) {
                return tiquete;
            }
        }
        return null;
    }
}

