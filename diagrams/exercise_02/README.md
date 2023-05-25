# Diagrama 2

## Ventajas

- Se puede indicar el `Consultor` a utilizar. Cumplimos _Inversion de la 
  dependencia_.
- Un cambio de requerimiento, acerca de la sección de `Consultor`, no 
  repercute en múltiples clases cumpliendo el principio de _Abierto/Cerrado_.
- Un nuevo tipo de `Vehiculo` puede implementarse cumpliendo _Abierto/Cerrado_.

## Desventajas

- Duplicación de los atributos (`referencia` y `valor`)
- Duplicación del código para consultar al `Consultor`

# Diagrama 1

## Ventajas

Reutilización de código:
- La de selección de utilización del "Consultor", 
evitando duplicar el código en `Vehiculo` y `Camion`.
- Los atributos (`referencia` y `valor`) no están duplicados.

## Desventajas
- No se puede cambiar el `Consultor` por no poder pasarlo al `Vehículo` o 
  `Camion`. Compromete el principio de _Inversión de la dependencia_.
- La relación de _herencia_ entre `Vehículo` y `Camion` **muy 
  probablemente** no se cumpla en el futuro.
- No se puede actualizar el valor de referencia de un `Camion`