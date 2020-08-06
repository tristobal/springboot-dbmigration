# springboot-dbmigration

## Levantar base de datos vacía de pruebas

```
docker run --rm --name postgres -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=demo -p 5432:5432 postgres:11
```

## Migración con Flyway
```
./mvnw flyway:migrate
```

## Migración con Liquibase

Ejecutar todos los changeSet definidos en masterchangelog.xml
De ser la primera ejecución creará las tablas:
- DATABASECHANGELOG. Guarda el historial de la Base de Datos.
- DATABASECHANGELOGLOCK. Guarda el "lock" que utiliza liquibase al ejecutarse (bloqueo tipo semáforo).

```
mvn liquibase:update
```

Ejecutar rollback de la base de datos hasta (inclusive) el changeset al cual pertenece el tag especificado en el comando.

```
mvn liquibase:rollback -Dliquibase.rollbackTag=tag
```


Crear los scripts indicados en el masterchangelog. Lo anterior es incremental, es decir, solo creará scripts para los cambios no efectuados en la base de datos.

```
mvn liquibase:updateSQL
```


Crear los scripts de rollback de la base de datos. Hasta (inclusive) el changeset al cual pertenece el tag especificado en el comando.

```
mvn liquibase:rollbackSQL -Dliquibase.rollbackTag=tag
```


### NOTA

Para una base de datos ya existente, primero se debe realizar lo siguiente:

1. Generar los script que emulen el estado actual de la base de datos.
2. Ejecutar mvn liquibase:changelogSync. Esto creará las tablas DATABASECHANGELOG y DATABASECHANGELOGLOCK con el estado actual.


## Ejecutar aplicación Spring Boot

```
./mvnw spring-boot:run
```