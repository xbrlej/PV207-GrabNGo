# PV207-GrabNGo
PV207 project implementation

This project includes:
- a mock of a REST API used by the jBPM implementation (run on port 8081)
- a working email service for launching email exposed by a REST endpoint (run on port 8081)
- a camel integration route (with mocked destination) exposed by a REST endpoint (run on port 8082)

Requires JDK 17 to be compiled.

### Installation
Install this project with maven (maven wrapper is also included)
```
mvn clean install
```
then run the installed jar package with
```
java -jar {path to jar}
```
or launch spring boot with maven
```
mvn spring-boot:run
```