# Diagrama 1

## Ventajas

1. Reutilización de código:
  - La de selección de utilización del "Consultor",
    evitando duplicar el código en `Vehiculo` y `Camion`.
  - Los atributos (`referencia` y `valor`) no están duplicados.

## Desventajas

1. _Inversion de la dependencia_.
  - No se puede cambiar el `Consultor` por no poder pasarlo al `Vehículo` o
    `Camion`. Compromete el principio de _Inversión de la dependencia_.
2. Reutilización
  - La relación de _herencia_ entre `Vehículo` y `Camion` **muy
    probablemente** no se cumpla en el futuro.
  - No se puede actualizar el valor de referencia de un `Camion`

# Diagrama 2

## Ventajas

1. _Inversion de la dependencia_.
  - Se puede indicar el `Consultor` a utilizar. Cumplimos
2. _Abierto/Cerrado_
  - Un cambio de requerimiento, acerca de la sección de `Consultor`, no 
  repercute en múltiples clases.
  - Un nuevo tipo de `Vehiculo` puede implementarse sin afectar a las clases 
    existentes.

## Desventajas

1. Duplicación
  - Los atributos (`referencia` y `valor`)
  - Código para consultar al `Consultor`.

