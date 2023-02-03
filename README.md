# Proyecto Trasnportes

## Actividad Propuesta

Se requiere una aplicación que le permita a una terminal de transporte gestionar los horarios de los viajes, en donde tiene que haber la posibilidad de registrar destinos, buses con sus capacidades y se debe llevar un registro de los viajes que se han realizado con los pasajeros que han ido a bordo del bus con sus datos personales para poder gestionar quien usa el sistema de transporte.
Basándose en esta necesidad y usando tu creatividad construye una api REST usando los métodos http que consideres prudentes, para conseguir el propósito arriba mencionado.

## Solucion

Para resolver este ejercicio pense, en una API en la que se inicia creando: Destinos, Buses, y Pasajeros o tambien es posible usar los que se crearon por defecto desde el codigo. Para luego por medio del Endpoint de viajes; creara los distintos viajes que contaban con una hora de salida, un destino y un bus. Posteriormente en otro metodo se agregaba un array en el que se especificaban que pasajeros subian en ese viaje.

### Pasajeros

Para crear un pasajero se usa una peticion post asi:

Endpoint: http://127.0.0.1:8080/pasajeros
Metodo: POST
Ejemplo body:

{
    "nombre": "Andrea Castillo",
    "cedula": 124564789
}


Usando el metodo GET, es posible obtener todos los pasajeros, y especificando el id en la ruta es posible obtener uno especifico:

Todos los Pasajeros:
Endpoint: http://127.0.0.1:8080/pasajeros
Metodo: GET

Pasajero especifico:
Endpoint: http://127.0.0.1:8080/pasajeros/1
Metodo: GET

### Destinos

Para crear un destino se usa una peticion post asi:

Endpoint: http://127.0.0.1:8080/destinos
Metodo: POST
Ejemplo body: 
{
    "nombre": "Bucaramanga",
    "ubicacion": "Santander"
 }

Usando el metodo GET, es posible obtener todos los destinos, y especificando el id en la ruta es posible obtener uno especifico:

Todos los destinos:
Endpoint: http://127.0.0.1:8080/destinos
Metodo: GET

Destino especifico:
Endpoint: http://127.0.0.1:8080/destinos/1
Metodo: GET

### Buses

Para crear un Bus se usa una peticion post asi:

Endpoint: http://127.0.0.1:8080/buses
Metodo: POST
Ejemplo body: 
{
        "placa": "abx321",
        "capacidad": 30
 }

Usando el metodo GET, es posible obtener todos los buses, y especificando el id en la ruta es posible obtener uno especifico:

Todos los buses:
Endpoint: http://127.0.0.1:8080/buses
Metodo: GET

Destino especifico:
Endpoint: http://127.0.0.1:8080/buses/1
Metodo: GET

### Viajes

Viajes es un poco distinto, para crear un viaje se debe usar el metodo POST:

Endpoint: http://127.0.0.1:8080/viajes/destinoId/3/busId/1
Metodo: POST
Body: "13:50" 
En el body solo es necesario añadir una String con la hora que deseas para el viaje

Usando el metodo GET, es posible obtener todos los buses:
Ejemplo:
Enpoint: http://127.0.0.1:8080/viajes
Metodo: GET

Y para añadir una lista de pasajeros se hace una peticion de tipo PUT especificando la ID de el viaje al cual le asignaras pasajeros:

Ejemplo: 
Enpoint: http://127.0.0.1:8080/viajes/1/pasajeros
Metodo: PUT
Body: [1,2,3] Para el body solo es necesario agregar esta especie de array con las ID de los pasajeros que subiran a el viaje.

Y por ultimo si deseas ver todos los viajes que hay, solo debes usar una peticion GET, de esta manera:

Ejemplo:
Endpoint: http://127.0.0.1:8080/viajes
Metodo: GET















