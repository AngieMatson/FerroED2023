package com.upb.edu.FerroUPBP1.Model.Registro;

import com.upb.edu.FerroUPBP1.Model.Persona.Cliente;
import com.upb.edu.FerroUPBP1.Model.Tiquete.Tiquete;

public class Registro extends Tiquete {


    public Registro(int precioVenta, String tipoTiquete, boolean chequeoTiquete, Cliente cliente) {
        super(precioVenta, tipoTiquete, chequeoTiquete, cliente);
    }
}
