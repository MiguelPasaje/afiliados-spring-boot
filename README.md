
el proyecto se inicializa con spring initializr
- Lenguaje Java
- Maven
- Spring Boot 3.2.3
- Packaging Jar
- Java 17

Api de afiliados (CRUD)

1. crear afiliado.
    - metodo POST
    http://localhost:9005/api/Afiliados

   {
    "nombres": "Miguel2",
    "apellidos": "Pasaje2",
    "fechaNacimiento": "1995-01-17",
    "direccion": "San Juan de Pasto",
    "telefono": "3172205469",
    "genero": "MASCULINO"
   }

2. listar afiliados
    - metodo GET
    http://localhost:9005/api/Afiliados

3. actualizar afiliados
    - metodo PUT
    http://localhost:9005/api/Afiliados/:id 

    {
    "nombres": "Miguel Andres",
    "apellidos": "Pasaje Urbano",
    "fechaNacimiento": "1995-01-17",
    "direccion": "San Juan de Pasto",
    "telefono": "3172205469",
    "genero": "MASCULINO"
    }


4. eliminar afiliado
    - metodo  DELETE
    http://localhost:9005/api/Afiliados/:id


5. obtener afiliado por id
   - metodo GET
   http://localhost:9005/api/Afiliados/1
