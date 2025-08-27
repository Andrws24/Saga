package com.saga.servicio;

import com.saga.modelo.Animal;

import java.util.HashMap;
import java.util.Map;

public class InventarioGanadoService {
    private Map<String, Animal> inventario = new HashMap<>();

    public void agregarAnimal(Animal animal) {
        if (inventario.containsKey(animal.getId()))
            throw new IllegalArgumentException("Animal ya registrado con ese ID");
        inventario.put(animal.getId(), animal);
    }

    public Animal buscarPorId(String id) {
        return inventario.get(id);
    }

    public void eliminarAnimal(String id) {
        inventario.remove(id);
    }

    public void actualizarPeso(String id, double nuevoPeso) {
        Animal animal = inventario.get(id);
        if (animal == null) throw new IllegalArgumentException("Animal no encontrado");
        animal.setPeso(nuevoPeso);
    }
}
