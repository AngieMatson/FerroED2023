package com.upb.edu.FerroUPBP1.Model.Maquina;
import com.upb.edu.FerroUPBP1.Model.Persona.Cliente;
import com.upb.edu.FerroUPBP1.Model.Tiquete.Tiquete;

import javax.swing.*;

public class MaquinaVenta extends Tiquete{
    public MaquinaVenta(int precioVenta, String tipoTiquete, boolean chequeoTiquete, Cliente cliente) {
        super(precioVenta, tipoTiquete, chequeoTiquete, cliente);
    }
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Ingresar Datos");
        String nombres = JOptionPane.showInputDialog(null,"Escribir los Nombres");
        String apellidos = JOptionPane.showInputDialog(null,"Escribir los Apellidos");
        JOptionPane.showMessageDialog(null,"Bienvenido " + nombres + " " + apellidos);
        String direccion = JOptionPane.showInputDialog(null,"Escribir la dirección");
        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null,"Escribir el teléfono"));
        int peso = Integer.parseInt(JOptionPane.showInputDialog(null,"Escribir cantidad de peso a llevar"));

    }
    public boolean venta(boolean chequeoTiquete, float peso){
        if (chequeoTiquete == true){
            return true;
        } else {
            return false;
        }

    }

}
