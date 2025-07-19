# notas de desarrollo de proyecto back-end, arquitectura hexagonal. eccomerce.

1. se modifco el arquetipo, borrando los paquetas con los que contaba dentro de la parte de dominio.
    - se adapta al proyecto ecommerce. se genera estructura de paquetes dentro de dominio. paquetas client y product. 


3. se implementa patron value object en entidad client.
  - de igual manera con producto y eventualmente con venta

4. se agrega dto (ClientDto, productDto)

5. se agrega estructura de port.
    - se agrego paquete dao y repository. dentro de cada uno con una interfaz. *ClientDao, ClientRepository*
    - se hace una distincion entre dao y repository.
        dao - sentencias que consultan datos. (getById, getAll).
        repository - sentencias que afectan. (create, update, delete.)

6. se implementan componentes de paquete service.
    estos son clases java, las cuales utilizan las interfaces port.
    se implementa logica de negocio, servicios edicion, creacion, etc.. 





# to-do
[X] modificacion de proyecto arqutipo.

[X] implementacion paquete entity.
    - se genero clase Client y su respectivas clases para value object.
    - se genero clase dto, se requiere implementar.*investigar*
    [X] implementar dto´s. modulo cliente
    [X] implementar dto´s. modulo producto

**19/07/25**
[-] implementar clases service dentro de cliente y product.


[X] desarrollar interfaces de paquete port.
    [ ] CRUD de clientes
    - a traves de estas interfaces se interactua con la entidad. estas interfaces nos indican que se hace.

    [X] metodos de interfaces.
        se implemento metodos getById, getAll dentro de dao.
        se implemento create, update, delete. dentro de repository.
    [ ] CRUD productos.
      [ ] implementacion de interfaces.


    [ ]  Modulo compra productos. (dentro directorio sale.)


**logica de negocios dentro de cliente**
[ ] Validar que los datos sean correctos y únicos.
        *se implementara en paquete service de client*
    [?] Mandar un mensaje en Kafka al topic "clientes_creados" con los datos del cliente creado. **investigar**
    [ ] El servicio debe escuchar el tópico del cliente creado, obtener los datos y simular el envío de un correo de bienvenida.



---------------------
# indicaciones proyecto arquitectura hexagonal.
Tienda Online:
1.- Módulo Clientes:
    - CRUD de clientes con los siguientes datos:
        - Nombre.
        - Apellido.
        - Email.
        - Teléfono.
        - Dirección.
    - Validar que los datos sean correctos y únicos.
    - Mandar un mensaje en Kafka al topic "clientes_creados" con los datos del cliente creado.
    - El servicio debe escuchar el tópico del cliente creado, obtener los datos y simular el envío de un correo de bienvenida.
2.- Módulo de productos.
    - CRUD de productos con los siguientes datos:
        - Nombre
        - Precio
        - Stock
3.- Módulo de compra de productos
    - A través de un servicio rest poder crear la venta de productos.
    - La venta de productos debe incluir:
        - Productos comprados.
        - Cantidad de productos.
        - Precio total.
        - Fecha de compra.
4.- Pruebas unitarias y de integración.
    - Realizar pruebas unitarias para cada módulo.
    - Realizar pruebas de integración para verificar que todos los módulos interactúan correctamente.

Ejemplos de respuestas de los endpoints:
1. Módulo Clientes
Crear Cliente
POST /clientes
Request:
{
    "nombre": "Juan",
    "apellido": "Pérez",
    "email": "juan.perez@email.com",
    "telefono": "5551234567",
    "direccion": "Calle Falsa 123"
}

Response:
{
  "id": 1,
  "nombre": "Juan",
  "apellido": "Pérez",
  "email": "juan.perez@email.com",
  "telefono": "5551234567",
  "direccion": "Calle Falsa 123"
}

Obtener Cliente
GET /clientes/1
Response:
{
  "id": 1,
  "nombre": "Juan",
  "apellido": "Pérez",
  "email": "juan.perez@email.com",
  "telefono": "5551234567",
  "direccion": "Calle Falsa 123"
}

2. Módulo Productos
Crear Producto
POST /productos
Request:
{
  "nombre": "Laptop",
  "precio": 15000.00,
  "stock": 50
}

Response:
{
  "id": 1,
  "nombre": "Laptop",
  "precio": 15000.00,
  "stock": 50
}
Obtener Producto
GET /productos/1
Response:

{
  "id": 1,
  "nombre": "Laptop",
  "precio": 15000.00
}

3. Módulo Compra de Productos
Crear Venta
POST /ventas
Request:
{
  "clienteId": 1,
  "productos": [
    { "productoId": 1, "cantidad": 2 },
    { "productoId": 2, "cantidad": 1 }
  ]
}
Response:

{
  "id": 1,
  "clienteId": 1,
  "productos": [
    { "productoId": 1, "nombre": "Laptop", "cantidad": 2, "precioUnitario": 15000.00 },
    { "productoId": 2, "nombre": "Mouse", "cantidad": 1, "precioUnitario": 500.00 }
  ],
  "precioTotal": 30500.00,
  "fechaCompra": "2025-07-06T14:30:00"
}

4. Kafka (Mensaje de Cliente Creado)
Mensaje enviado al topic clientes_creados:

{
  "id": 1,
  "nombre": "Juan",
  "apellido": "Pérez",
  "email": "juan.perez@email.com"
}
 