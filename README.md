# Aplicación de Escritorio para Clínica Veterinaria

Esta aplicación de escritorio para una clínica veterinaria permite gestionar los datos de las mascotas y sus respectivos dueños. Implementada utilizando Java Persistence API (JPA), la aplicación sigue un modelo de capas para una mejor organización y mantenibilidad del código.

## Características

- **Formulario de Entrada de Datos:** Permite introducir los datos de las mascotas y sus dueños.
- **Almacenamiento en Base de Datos:** Todos los registros se almacenan de manera persistente en una base de datos.
- **Operaciones CRUD:** La aplicación permite realizar las operaciones de Crear, Leer, Actualizar y Borrar datos.

## Funcionalidades

1. **Guardar Datos:** Permite guardar la información de las mascotas y sus dueños en la base de datos.
2. **Ver Datos:** Muestra todos los registros almacenados en la base de datos.
3. **Editar Datos:** Permite actualizar la información de las mascotas y sus dueños.
4. **Borrar Datos:** Permite eliminar registros de la base de datos.

## Arquitectura en Capas

La aplicación está organizada en un modelo de capas, que incluye:

1. **Capa de Presentación:** Gestiona la interfaz de usuario.
2. **Capa de Negocio:** Contiene la lógica de negocio.
3. **Capa de Persistencia:** Maneja las operaciones con la base de datos.
4. **Capa de Datos:** Define las entidades y sus relaciones.

## Tecnologías Utilizadas

- **Java:** Lenguaje de programación principal.
- **JavaFX:** Para la interfaz de usuario.
- **JPA (Java Persistence API):** Para la persistencia de datos.
- **MySQL/PostgreSQL/SQLite:** Como base de datos (cualquiera de ellas puede ser utilizada según la preferencia).

## Instalación y Ejecución

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/usuario/repositorio-clinica-veterinaria.git
