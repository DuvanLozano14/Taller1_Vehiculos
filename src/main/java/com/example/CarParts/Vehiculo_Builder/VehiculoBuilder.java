package com.example.CarParts.Vehiculo_Builder;

import com.example.CarParts.Interface.IChasis;
import com.example.CarParts.Interface.IMotor;
import com.example.CarParts.Interface.ICojin;

public class VehiculoBuilder {
    private IChasis chasis;
    private IMotor motor;
    private ICojin cojineria;
    private String color;
    private String fechaEnsamblaje;
    private int numeroEnsamblaje;

    public VehiculoBuilder setChasis(IChasis chasis) {
        this.chasis = chasis;
        return this;
    }

    public VehiculoBuilder setMotor(IMotor motor) {
        this.motor = motor;
        return this;
    }

    public VehiculoBuilder setCojineria(ICojin cojineria) {
        this.cojineria = cojineria;
        return this;
    }

    public VehiculoBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public VehiculoBuilder setFechaEnsamblaje(String fechaEnsamblaje) {
        this.fechaEnsamblaje = fechaEnsamblaje;
        return this;
    }

    public VehiculoBuilder setNumeroEnsamblaje(int numeroEnsamblaje) {
        this.numeroEnsamblaje = numeroEnsamblaje;
        return this;
    }

    public Vehiculo build() {
        return new Vehiculo(chasis, motor, cojineria, color, fechaEnsamblaje, numeroEnsamblaje);
    }
}
