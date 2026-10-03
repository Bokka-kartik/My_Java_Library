# Java Projects

This repository brings together several independent Java learning and application
projects. Each project stays in its own directory and has its own build or run
instructions; there is no shared root build.

## Projects

| Project | Description | Main technologies |
| --- | --- | --- |
| [Hibernate Understanding](./Hibernate_Understanding/) | Small examples for Hibernate ORM, entities, and database access. | Java, Hibernate, Maven, MySQL Connector/J |
| [JDBC Servlet](./JDBC_Servlet/) | A servlet-based web application demonstrating JDBC database operations. | Java, Servlets, JSP, JDBC, Tomcat |
| [Student Job Portal Management](./Student_Job-Portal-Management/) | A web application for student profiles, job listings, and applications. | Java 17, Spring Boot, Spring Data JPA, MySQL |

## Working with a project

Run each build from that project's directory so its dependencies and outputs
remain isolated from the others.

### Hibernate Understanding

Requires Maven and a JDK:

```powershell
Set-Location Hibernate_Understanding
mvn package
```

### JDBC Servlet

The project includes a WAR file and a Dockerfile for running it with Tomcat:

```powershell
Set-Location JDBC_Servlet
docker build -t jdbc-servlet .
docker run --rm -p 8080:8080 jdbc-servlet
```

See the project's README for additional notes about the servlet and database
setup.

### Student Job Portal Management

Requires a JDK 17 or later:

```powershell
Set-Location Student_Job-Portal-Management
.\mvnw.cmd test
```

## Repository layout

```text
Java/
├── Hibernate_Understanding/
├── JDBC_Servlet/
└── Student_Job-Portal-Management/
```

Maven `target/` folders, compiled classes, and other generated `build/` output
are excluded from version control.
