## Introducción a Micronaut

El objetivo de estos ejercicios es incorporar los conocimientos básicos de Micronaut mediante la ejercitación planteada en el documento.

## Requisitos

Para realizar la ejercitación se recomienda descargar
[Intellij ](https://www.jetbrains.com/idea/download/#section=windows)en su versión community y descargar el binario de [Micronaut. ](https://micronaut.io/download.html)Además se recomienda tener Java instalado y Maven o Gradle.

## Ejercicios

Tomar el siguiente caso de uso para los siguientes ejercicios.

Se busca construir un microservicio que gestione el material de estudio para la matriz de conocimiento.

El material de estudio está representado en cursos que tienen un título, una descripción, un link al material y una lista de tags.

Entonces necesitamos:

1. Construir un microservicio básico con Micronaut definiendo el swagger para obtener los cursos y crear un curso.
2. Una vez completado el servicio, utilizar la configuración correspondiente para validar los campos (por ejemplo que sean obligatorios el título y el link).
3. Crear una segunda versión del recurso de obtener cursos que posea un parámetro que permita filtrar por un tag específico (queda a elección como implementar el filtrado).
4. Agregar al menos 4 test unitarios que validen las funcionalidades agregadas utilizando las definiciones de Micronaut (http client).
5. Agregar un manejador de errores a nivel general, que en caso de error devuelva 500 y el mensaje “Error en el sistema. Contacte con el administrador.”

### Feature http-client documentation

- [Micronaut Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)
