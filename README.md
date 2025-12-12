# Conversor de Monedas Java

## 📜 Descripción del Proyecto

Este es una aplicación de **consola** desarrollada en **Java** para la conversión de divisas. El proyecto funciona mediante el consumo de una API externa (**ExchangeRate-API**) para obtener las tasas de cambio **en tiempo real**.

Las divisas soportadas en el menú interactivo incluyen: **USD**, **Peso Argentino**, **Real Brasileño**, **Peso Colombiano** y **Euro**.
## 📜 Cómo Usar

    ●Abre el proyecto en tu IDE (como IntelliJ IDEA).

    ●Verifica que la dependencia Gson se haya cargado correctamente.

    ●Ejecuta el método main de la clase principal: com.alura.conversor.Menu.

Una vez iniciado, el programa presentará el menú de 10 opciones de conversión. Simplemente ingresa el número de la opción deseada y la cantidad a convertir.


## ⚙️ Requisitos Clave

Para compilar y ejecutar el proyecto, asegúrate de tener:

1.  **Java Development Kit (JDK) 17+**.
2.  La librería **Google Gson**, esencial para el procesamiento de los datos JSON de la API.

Si estás utilizando **Maven** para gestionar dependencias, incluye el siguiente bloque en tu `pom.xml`:


```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>
```
