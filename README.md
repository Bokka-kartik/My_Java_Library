# Java Projects

This repository brings together several independent Java learning and application
projects. Each project stays in its own directory and has its own build or run
instructions; there is no shared root build.

## Projects

| Project | Description | Main technologies |
| --- | --- | --- |
| [Project1 - Hibernate Understanding](./Project1/) | Small examples for Hibernate ORM, entities, and database access. See its [README](./Project1/README.md) for build and database setup. | Java, Hibernate, Maven, MySQL Connector/J |
| [Project2 - JDBC Servlet](./Project2/) | A servlet-based web application demonstrating JDBC database operations. | Java, Servlets, JSP, JDBC, Tomcat |
| [Project3 - Student Job Portal Management](./Project3/) | A web application for student profiles, job listings, and applications. | Java 17, Spring Boot, Spring Data JPA, MySQL |

## Working with a project

Run each build from that project's directory so its dependencies and outputs
remain isolated from the others.

### Hibernate Understanding

Requires Maven and a JDK:

```powershell
Set-Location Project1
mvn package
```

### JDBC Servlet

The project includes a WAR file and a Dockerfile for running it with Tomcat:

```powershell
Set-Location Project2
docker build -t jdbc-servlet .
docker run --rm -p 8080:8080 jdbc-servlet
```

See the project's README for additional notes about the servlet and database
setup.

### Student Job Portal Management

Requires a JDK 17 or later:

```powershell
Set-Location Project3
mvn test
```

## Repository layout

```text
Java/
|-- Project1/  (Hibernate Understanding)
|-- Project2/  (JDBC Servlet)
\-- Project3/  (Student Job Portal Management)
```

Maven `target/` folders, compiled classes, and other generated `build/` output
are excluded from version control.
