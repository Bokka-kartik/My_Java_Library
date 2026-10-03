# Hibernate Understanding

Small Java examples exploring Hibernate ORM with MySQL. The examples use
entity classes, Hibernate XML configuration, sessions, and transactions.

## Requirements

- JDK 17 or later
- Maven 3.6 or later
- MySQL Server

## Build

From this directory, run:

```powershell
mvn clean package
```

## Database configuration

The Hibernate configuration files are in `src/main/resources/`:

| Configuration file | Entity |
| --- | --- |
| `hibernate.cfg.xml` | `com.employee.Employee` |
| `Hibernate1.cfg.xml` | `com.student.Student` |
| `Hibernate2.cfg.xml` | `com.customer.Customer` |
| `Hibernate0..cfg.xml` | Intended for `com.crud.Banking` |

Before running an example, check its configuration file and set the MySQL
connection URL, database, username, and password for your local setup. The
examples expect a database named `hibernate` by default. Do not commit real
database credentials. `HibernateUtil` currently requests `Hibernate0.cfg.xml`,
but the file in resources is named `Hibernate0..cfg.xml`; reconcile these names
before running the CRUD example.

## Examples

Each package contains a small example:

- `com.employee` - employee entity and a basic session/transaction setup.
- `com.student` - student entity and persistence operations.
- `com.customer` - customer entity and persistence operations.
- `com.crud` - banking entity and create/update operations using a shared
  `SessionFactory` helper.

The runner classes have `main` methods and can be launched from an IDE after
configuring the database. Build the project first to verify its dependencies
compile.
