package com.upb.edu.FerroUPBP1.Model.Tiquete;

import com.upb.edu.FerroUPBP1.Model.Persona.Cliente;

public class VentaTiquete extends Tiquete {
    String ruta;
    public VentaTiquete(int precioVenta, String tipoTiquete, boolean chequeoTiquete, Cliente cliente, String ruta) {
        super(precioVenta, tipoTiquete, chequeoTiquete, cliente);
        ruta= this.ruta;
    }
}
