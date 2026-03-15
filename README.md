# IT Helpdesk REST API (Spring Boot)

Este proyecto es una API RESTful desarrollada en **Java (Spring Boot)** que simula el backend de un sistema de gestión de tickets de soporte técnico (Helpdesk). 

## Objetivo
Demostrar habilidades en Desarrollo Backend, diseño de Bases de Datos Relacionales (SQL) y la implementación de algoritmos de negocio.

## Características Principales (Features)
- **Operaciones CRUD:** Creación, lectura y actualización del estado de Tickets de soporte.
- **Bases de Datos Relacionales:** Uso de JPA/Hibernate para manejar relaciones `@ManyToOne` entre Usuarios y Tickets.
- **Algoritmo de Auto-asignación:** Lógica de negocio implementada en el Controlador que busca dinámicamente usuarios con el rol "Agente Soporte" en la base de datos SQL para asignarles automáticamente los nuevos incidentes.
- **Gestión de Estados:** Endpoints específicos (PUT) para la mutación segura de datos (ej. Marcar ticket como "Cerrado").

## Tech Stack
* **Lenguaje:** Java 17
* **Framework:** Spring Boot 3
* **Base de Datos:** H2 Database (En memoria, escalable a MySQL/PostgreSQL) / SQL
* **Testing:** Postman / REST Clients

## Endpoints de la API
* `POST /api/usuarios` - Registra un nuevo empleado o agente.
* `GET /api/tickets` - Obtiene todos los incidentes con sus usuarios relacionados (JOIN).
* `POST /api/tickets` - Crea un ticket y ejecuta el algoritmo de auto-asignación.
* `PUT /api/tickets/{id}/cerrar` - Actualiza el estado de un incidente a "Cerrado".

**Live Demo (API Pública):** https://helpdesk-tickets-api-java.onrender.com
