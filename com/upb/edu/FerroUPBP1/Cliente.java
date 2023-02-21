package com.upb.edu.FerroUPBP1;

public class Cliente  extends Persona {
    float peso = 0;
    public Cliente(String nombre, String apellido, int id, String direccion, int telefono, float peso) {
        super(nombre, apellido, id, direccion, telefono);
        this.peso = peso;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void pesomax(float peso){
        if(peso <= 150){
            System.out.println("Peso Válido por persona");
            }
        else{
            System.out.println("Peso No Válido, no puede ingresar");
        }

    }
}
