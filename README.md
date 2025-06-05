# CARLOS CASTRO ALDROVER 1º DAM

## Kata de Ricksy Business en Java

Orientado del: https://github.com/dfleta/ricksy-business-observer.git

### Descripción:
Rick se queda a cargo Morty y Summer, y celebra una pedazo de fiesta. Entre los invitados hay adolescentes, aliens, Gearhead, Squanchy, Birdpearson y Abradolph Lincler.

Al llegar, cada invitado es registrado por el sistema receptivo mediante su tarjeta de crédito. 

El receptivo carga en el crédito de la tarjeta:

- El coste del UberOvni de vuelta a casa
- El coste del pack de bienvenida (Collaxion crystals).


El componente de reserva de Ovnis y el componente de entrega del pack de bienvenida observan al componente receptivo, de modo que cuando el receptivo da de alta a un invitado/a automáticamente cargan en la tarjeta del invitado/a el coste de ambos servicios.

## Tecnologías utilizadas

- **Lenguaje:** Java 21
- **Build Tool:** Maven
- **Testing:** JUnit 4
- **IDE:** IntelliJ IDEA / VS Code

---

## Cómo ejecutar el proyecto

### Maven:

```bash
# Compilar el package del proyecto:
  mvn clean package
# Ejecutar tests:
  mvn test
# Ejecutar el JAR:
  java -jar target/ricky-buisiness-1.0-SNAPSHOT.jar
```