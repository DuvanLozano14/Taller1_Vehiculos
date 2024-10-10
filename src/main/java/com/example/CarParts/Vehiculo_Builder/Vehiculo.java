package com.example.CarParts.Vehiculo_Builder;


import com.example.CarParts.Interface.IChasis;
import com.example.CarParts.Interface.ICojin;
import com.example.CarParts.Interface.IMotor;

public class Vehiculo {
    private IChasis chasis;
    private IMotor motor;
    private ICojin cojineria;
    private String color;
    private String fechaEnsamblaje;
    private int numeroEnsamblaje;

    public IChasis getChasis() {
        return chasis;
    }

    public void setChasis(IChasis chasis) {
        this.chasis = chasis;
    }

    public IMotor getMotor() {
        return motor;
    }

    public void setMotor(IMotor motor) {
        this.motor = motor;
    }

    public ICojin getCojineria() {
        return cojineria;
    }

    public void setCojineria(ICojin cojineria) {
        this.cojineria = cojineria;
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

    public int getNumeroEnsamblaje() {
        return numeroEnsamblaje;
    }

    public void setNumeroEnsamblaje(int numeroEnsamblaje) {
        this.numeroEnsamblaje = numeroEnsamblaje;
    }

    public Vehiculo(IChasis chasis, IMotor motor, ICojin cojineria, String color, String fechaEnsamblaje, int numeroEnsamblaje) {
        this.chasis = chasis;
        this.motor = motor;
        this.cojineria = cojineria;
        this.color = color;
        this.fechaEnsamblaje = fechaEnsamblaje;
        this.numeroEnsamblaje = numeroEnsamblaje;
    }

    @Override
    public String toString() {
        return "Vehiculo ensamblado: " + chasis.getNumeroPieza() + ", " + motor.getNumeroPieza() + ", " + cojineria.getNumeroPieza() + ", " + color + ", " + fechaEnsamblaje + ", " + numeroEnsamblaje;
    }
}
