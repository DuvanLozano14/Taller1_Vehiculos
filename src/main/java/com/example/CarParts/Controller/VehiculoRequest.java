package com.example.CarParts.Controller;

public class VehiculoRequest {
    private String marca;
    private String color;
    private String fechaEnsamblaje;
    private int numeroEnsamblaje;

    public int getNumeroEnsamblaje() {
        return numeroEnsamblaje;
    }

    public void setNumeroEnsamblaje(int numeroEnsamblaje) {
        this.numeroEnsamblaje = numeroEnsamblaje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFechaEnsamblaje() {
        return fechaEnsamblaje;
    }

    public void setFechaEnsamblaje(String fechaEnsamblaje) {
        this.fechaEnsamblaje = fechaEnsamblaje;
    }
}
