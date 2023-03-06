package com.upb.edu.FerroUPBP1.Model.Tiquete;

import com.upb.edu.FerroUPBP1.Lista.List;
import com.upb.edu.FerroUPBP1.Model.Persona.Cliente;

import java.util.LinkedList;

public class VentaTiquete extends Tiquete {
    private static final LinkedList<Ruta> rutasPredefinidas = new LinkedList<Ruta>() {{
        add(new Ruta("Bucaramanga", "Bogotá", "12:00", "15:00"));
        add(new Ruta("Bucaramanga", "Barranquilla", "08:00", "11:00"));
        // Agregar más rutas predefinidas aquí
    }};

    public VentaTiquete(String ruta, Cliente cliente, String tipoTiquete) {
        super(0, tipoTiquete, false, cliente, ruta, "");
        Ruta rutaSeleccionada = buscarRuta(ruta);
        super.setPrecioVenta(Tiquete.precio);
        super.setTipoTiquete(tipoTiquete);
        super.setChequeoTiquete(false);
        super.setRuta(rutaSeleccionada.getOrigen() + " - " + rutaSeleccionada.getDestino());
        super.setHorarioSalida(rutaSeleccionada.getHoraSalida());
    }

    private Ruta buscarRuta(String ruta) {
        for (Ruta r : rutasPredefinidas) {
            if ((r.getOrigen() + " - " + r.getDestino()).equals(ruta)) {
                return r;
            }
        }
        // Si la ruta no está predefinida, se establece una ruta genérica
        return new Ruta("Origen", "Destino", "10:00", "13:00");
    }
}



