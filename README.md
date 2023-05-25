# Empresa constructora

Una empresa constructora construye edificios y viviendas utilizando un 
conjunto de materiales.

Los materiales que se utilizan para las construcciones. 
Al día de hoy se utiliza: (1) Cemento, (2) Pintura y (3) Caños.

La constructora tiene almacenes de acopio donde almacena los materiales para 
construir. La cantidad de materiales disponibles por tipo se miden en 
unidades (en adelante 'u'). Por ejemplo: 100u de cemento o 900u de pintura.

Para construir una "Vivienda" son necesarios los siguientes materiales:
- Una base de 50u de cemento.
- Por cada ambiente: (1) 10 ude cemento, (2) 100u de caños y 
  (3) 500u de pintura.

Ej.: Construir una casa de dos ambientes consume: (1) Cemento: 50u + 2 * 10u,
(2) Caños: 2 * 100u y (3) 2 * 500u.

Para construir un "Edificio" son necesarios los siguientes materiales, que 
dependerá del número de plantas:
- Una base de: (1) 100u de cemento, (2) 100u de caños y (3) 100 u de pintura.
- Para la primera planta los materiales utilizados equivalen a construir 
  una vivienda de 5 ambientes. 
- Para el resto de las plantas: (1) 100u de cemento * "el número de la 
  planta", (2) 100 u de caños -no depende de planta- y (3) 100 u de pintura 
  -no depende de planta-.

## Casos de uso

La constructora quiere conocer el remanente de material en sus 
almacenes luego de:
1. Haber construido una casa de 5 ambientes.
2. Haber construido un edificio de 5 pisos.
3. Haber construido un complejo de dos edificios de 5 pisos y una casa de 5 
   ambientes.

## Se pide:
- Diagrama de clases completo incluyendo todas las clases y abstracción por 
más que no se utilicen en los diagramas de secuencia de los casos de uso.
- Diagrama de secuencia para cada uno de los casos de uso.
- Código de la prueba para cada uno de los casos de uso.

# Soluciones

- [Ejercicio 1](diagrams/exercise_01)
- [Ejercicio 2](diagrams/exercise_02)