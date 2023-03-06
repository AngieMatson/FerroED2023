package com.upb.edu.FerroUPBP1.Model.Persona;

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
    public boolean pesomax(){
        return peso <= 150;
    }
}
