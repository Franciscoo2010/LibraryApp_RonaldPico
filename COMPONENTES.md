# Análisis de Componentes (COMPONENTES.md)

## Libro

| Campo | Registro |
|---|---|
| **Clase / Interfaz** | `org.rp.model.Libro` |
| **Capa** | Model |
| **Responsabilidad** | Representar la información de un libro y sus datos asociados. No debe encargarse de lógica de persistencia, consultas a la base de datos ni de controlar la interfaz de usuario. |
| **Dependencias** | `Autor`, `Categoria` y las librerías/clases utilizadas dentro de la clase. |
| **Javadoc** | Documentación de la clase, atributos y métodos principales mediante etiquetas como @param, @return ,@author,see y version |
| **Prueba** | Se comprueba creando objetos `Libro`, asignando sus atributos y verificando que los métodos de acceso (`get`/`set`) y demás comportamientos funcionen correctamente. |

## Autor

| Campo | Registro |
|---|---|
| **Clase / Interfaz** | `org.rp.model.Autor` |
| **Capa** | Model |
| **Responsabilidad** | Representar la información de un autor.|
| **Dependencias** | Las clases y librerías utilizadas directamente por `Autor`. |
| **Javadoc** | Documentación de la clase y de sus métodos principales con  las etiquetas @param, @return ,@author,see y version. |
| **Prueba** | Se comprueba creando objetos `Autor`, asignando sus datos y verificando sus métodos `get`/`set` y demás comportamiento definido. |

## Categoria

| Campo | Registro |
|---|---|
| **Clase / Interfaz** | `org.rp.model.Categoria` |
| **Capa** | Model |
| **Responsabilidad** | Representar la información de una categoría de libros. |
| **Dependencias** | Las clases y librerías utilizadas directamente por `Categoria`. |
| **Javadoc** | Documentación de la clase y de sus métodos principales mediante etiquetas Javadoc. |
| **Prueba** | Se comprueba creando objetos `Categoria`, asignando sus datos y verificando sus métodos `get`/`set` y demás comportamiento definido. |

