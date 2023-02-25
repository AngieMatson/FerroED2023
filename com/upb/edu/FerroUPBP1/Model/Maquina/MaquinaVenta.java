package com.upb.edu.FerroUPBP1.Model.Maquina;
import com.upb.edu.FerroUPBP1.Model.Persona.Cliente;
import com.upb.edu.FerroUPBP1.Model.Tiquete.Tiquete;
public class MaquinaVenta extends Tiquete{
    public MaquinaVenta(int precioVenta, String tipoTiquete, boolean chequeoTiquete, Cliente cliente) {
        super(precioVenta, tipoTiquete, chequeoTiquete, cliente);
    }
    public static void main(String[] args) {




    }

    public boolean venta(boolean chequeoTiquete){
        if (chequeoTiquete == true){
            return true;
        } else {
            return false;
        }
    }

}
