REPORTE DE PRUEBAS UNITARIAS - PROYECTO "SAGA"
Estudiante: Andres Arcila - Cristian Valdez
Módulo probado: Gestión de Inventario de Ganado
Clase probada: InventarioGanadoService

1. Objetivo
Aprender a diseñar, implementar y ejecutar pruebas unitarias en Java utilizando JUnit,
siguiendo buenas prácticas de aseguramiento de calidad de software

Se realizaron pruebas unitarias utilizando JUnit 5 
para validar las funciones principales del módulo de inventario de ganado.
Los datos utilizados incluyen: ID, Raza, Sexo y Peso del animal.

- Las pruebas se ejecutaron utilizando JUnit 5.
- Se siguieron buenas prácticas: pruebas independientes, nombres descriptivos y cobertura de errores.
- Se ejecuto pruebas con Maven y todas fueron exitosas.

Process finished with exit code 0

Pruebas Unitarias de inventario de ganado.Test
Método de prueba	Qué verifica	Resultado esperado
1	agregarAnimal_correctamenteGuardado()	Que un animal se agrega bien	
2	agregarAnimal_conIdRepetido_lanzaExcepcion()	Que no permite IDs duplicados	
3	eliminarAnimal_loEliminaCorrectamente()	Que se puede eliminar un animal	
4	actualizarPeso_modificaCorrectamenteElPeso()	Que el peso se actualiza bien	
5	crearAnimal_conSexoInvalido_lanzaExcepcion()	Que lanza excepción por sexo inválido

<img width="910" height="278" alt="image" src="https://github.com/user-attachments/assets/20df8d69-3ad6-43ed-bb85-9cb88c27735a" />




Pruebas Unitarias de CalculadoraTest   

<img width="945" height="339" alt="image" src="https://github.com/user-attachments/assets/48dbf003-96de-402b-afa3-b33c27a29b26" />





