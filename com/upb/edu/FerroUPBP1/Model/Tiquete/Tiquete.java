package com.upb.edu.FerroUPBP1.Model.Tiquete;

import com.upb.edu.FerroUPBP1.Model.Persona.Cliente;


public class Tiquete{
    public static int precioVenta;
    public String tipoTiquete;
    public boolean chequeoTiquete;
    public Cliente cliente;
    public String ruta;
    public String horarioSalida;
    public static final int precio = precioVenta;

    public Tiquete(int precioVenta, String tipoTiquete, boolean chequeoTiquete, Cliente cliente, String ruta, String horarioSalida) {
        this.precioVenta = precioVenta;
        this.tipoTiquete = tipoTiquete;
        this.chequeoTiquete = chequeoTiquete;
        this.cliente = cliente;
        this.ruta = ruta;
        this.horarioSalida = horarioSalida;
    }

    public void setTipoTiquete(String tipoTiquete) {
        this.tipoTiquete = tipoTiquete;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setChequeoTiquete(boolean chequeoTiquete) {
        this.chequeoTiquete = chequeoTiquete;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public static void tipoTiquete(String tipoTiquete, int precioVenta, boolean chequeoTiquete){
        switch (tipoTiquete){
            case "PREMIUM":
            case "premium":
                precioVenta=1000000;
                System.out.println("El precio del tiquete es de"+ " " + precioVenta);
                chequeoTiquete = true;
                break;
            case "EJECUTIVO":
            case "ejecutivo":
                precioVenta=200000;
                System.out.println("El precio del tiquete es de"+ " " + precioVenta);
                chequeoTiquete = true;
                break;
            case "ECONOMICO":
            case "economico":
                precioVenta=75000;
                System.out.println("El precio del tiquete es de"+ " " + precioVenta);
                chequeoTiquete = true;
                break;
            default:
                chequeoTiquete = false;
                throw new IllegalStateException("Escriba bien");
        }
    }
}
