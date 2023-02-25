package com.upb.edu.FerroUPBP1.Model.Tiquete;

import com.upb.edu.FerroUPBP1.Model.Persona.Cliente;


public class Tiquete{
    public  int precioVenta;
    public String tipoTiquete;
    public boolean chequeoTiquete;
    public Cliente cliente;
    public Tiquete(int precioVenta, String tipoTiquete, boolean chequeoTiquete, Cliente cliente) {
        this.precioVenta = precioVenta;
        this.tipoTiquete = tipoTiquete;
        this.chequeoTiquete = chequeoTiquete;
        this.cliente = cliente;
    }
    public void setTipoTiquete(String tipoTiquete) {
        this.tipoTiquete = tipoTiquete;
    }
    public static void tipoTiquete(String tipoTiquete, int precioVenta, boolean chequeoTiquete){
       switch (tipoTiquete){
           case "PREMIUM", "premium":
               precioVenta=1000000;
               System.out.println("El precio del tiquete es de"+ " " + precioVenta);
               chequeoTiquete = true;
               break;
           case "EJECUTIVO", "ejecutivo":
               precioVenta=200000;
               System.out.println("El precio del tiquete es de"+ " " + precioVenta);
               chequeoTiquete = true;
               break;
           case "ECONOMICO", "economico":
               precioVenta=75000;
               System.out.println("El precio del tiquete es de"+ " " + precioVenta);
               chequeoTiquete = true;
               break;
           default:
               throw new IllegalStateException("Escriba bien");
       }
    }

}
