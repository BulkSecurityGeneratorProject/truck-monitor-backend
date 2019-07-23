# T Monitor - Backend

<!-- TOC -->
- [Development](#Development)
  - [Testing](#Testing)
  - [Docker](#docker)
    - [`Build`](#Build)
    - [`Working with databases`](#Working-with-databases)
- [CI](#ci)
- [API](#api)
- [Security (Important note)](#security)

<!-- /TOC -->

## Development

To start your application in the dev profile, simply run:

    ./mvnw

### Testing

To launch your application's tests, run:

    ./mvnw verify

## Docker

### Build

To build a Docker image using [Jib](https://github.com/GoogleContainerTools/jib):

With Maven, type:

    ./mvnw package -Pprod verify jib:dockerBuild

To run this image, use the Docker Compose configuration located in the src/main/docker folder of your application:

    docker-compose -f src/main/docker/app.yml up

### Working with databases

If you just want to start the database, and not the other services, use the Docker Compose configuration:

    docker-compose -f src/main/docker/postgresql.yml up

## API

To use Swagger UI, visit this url:

[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Security

**!! IMPORTANT !!**

We are disabling security authentication for [/api/**](/Users/iuri.pereira/dev/iuri/man-jhipster/src/main/java/com/truckmonitor/config/SecurityConfiguration.java) and hope to start making authenticated request soon

    .antMatchers("/api/**").permitAll()

## Configuration

This project was bootstrapped with [JHipster](https://www.jhipster.tech/). You can learn more about it and how to configure in the [JHipster documentation](https://www.jhipster.tech/).
