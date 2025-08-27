package com.saga.servicio;

import com.saga.modelo.Animal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InventarioGanadoServiceTest {
    private InventarioGanadoService inventario;

    @BeforeEach
    void setUp() {
        inventario = new InventarioGanadoService();
    }

    @Test
    void agregarAnimal_correctamenteGuardado() {
        Animal a = new Animal("A001", "Brahman", "M", 350.5);
        inventario.agregarAnimal(a);
        assertEquals("Brahman", inventario.buscarPorId("A001").getRaza());
    }

    @Test
    void agregarAnimal_conIdRepetido_lanzaExcepcion() {
        Animal a1 = new Animal("A002", "Angus", "F", 300);
        Animal a2 = new Animal("A002", "Hereford", "M", 400);
        inventario.agregarAnimal(a1);
        assertThrows(IllegalArgumentException.class, () -> inventario.agregarAnimal(a2));
    }

    @Test
    void eliminarAnimal_loEliminaCorrectamente() {
        Animal a = new Animal("A003", "Hereford", "F", 290);
        inventario.agregarAnimal(a);
        inventario.eliminarAnimal("A003");
        assertNull(inventario.buscarPorId("A003"));
    }

    @Test
    void actualizarPeso_modificaCorrectamenteElPeso() {
        Animal a = new Animal("A004", "Simmental", "M", 40);
        inventario.agregarAnimal(a);
        inventario.actualizarPeso("A004", 470);
        assertEquals(470, inventario.buscarPorId("A004").getPeso());
    }

    @Test
    void crearAnimal_conSexoInvalido_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> new Animal("A005", "Limousin", "X", 350));
    }
}
