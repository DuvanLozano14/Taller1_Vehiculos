package com.example.CarParts.Controller;

import com.example.CarParts.Interface.IVehiculoAbstractFactory;
import com.example.CarParts.Factory.VehiculoFactory;
import com.example.CarParts.Vehiculo_Builder.Vehiculo;
import com.example.CarParts.Vehiculo_Builder.VehiculoBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {


    @PostMapping("/ensamblar")
    public Map<String, Object> crearVehiculo(@RequestBody VehiculoRequest request) {
        // Obtener la fábrica basada en la marca
        IVehiculoAbstractFactory factory = VehiculoFactory.getVehiculoFactory(request.getMarca());

        // Construir el vehículo
        Vehiculo builder = new VehiculoBuilder()
                .setChasis(factory.crearChasis())
                .setMotor(factory.crearMotor())
                .setCojineria(factory.crearCojineria())
                .setColor(request.getColor())
                .setFechaEnsamblaje(request.getFechaEnsamblaje())
                .setNumeroEnsamblaje(request.getNumeroEnsamblaje())
                .build();


        // Aquí puedes construir la respuesta con los detalles del vehículo
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Vehículo ensamblado correctamente.");
        response.put("marca", request.getMarca());
        response.put("color", builder.getColor());
        response.put("fecha ensamblaje", builder.getFechaEnsamblaje());
        response.put("numeroEnsamblaje", builder.getNumeroEnsamblaje());
        response.put("cojineria", builder.getCojineria());
        response.put("chasis", builder.getChasis());
        response.put("motor", builder.getMotor());

        return response;
    }
}
