<div align="center">

# Wordle en Java

**Versión para consola del juego Wordle, con diccionario local, colores e historial de la partida.**

![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk&logoColor=white)
![Console](https://img.shields.io/badge/Aplicación-Consola-4D4D4D)

</div>

## Descripción

Este proyecto implementa el funcionamiento básico de Wordle en una aplicación de consola escrita en Java. En cada partida se selecciona una palabra aleatoria de cinco letras y el jugador dispone de seis intentos para adivinarla.

El programa utiliza colores ANSI para indicar el resultado de cada letra y guarda una copia sin colores de la última partida en `Historial.txt`.

## Funcionalidades

- Selección aleatoria de palabras desde un diccionario local.
- Seis intentos por partida.
- Validación de palabras de cinco letras.
- Respuesta visual mediante colores ANSI:
  - Verde: letra y posición correctas.
  - Amarillo: letra presente en otra posición.
  - Rojo: letra no presente.
- Historial de intentos mostrado durante la partida.
- Registro de la última partida en un archivo de texto.
- Excepción personalizada para entradas con longitud incorrecta.

## Tecnologías y conceptos

| Área | Tecnologías o conceptos |
| --- | --- |
| Lenguaje | Java |
| Interfaz | Consola y códigos ANSI |
| Diseño | Programación orientada a objetos |
| Persistencia | Lectura y escritura de archivos de texto |
| Control de errores | Excepciones y recursos `try-with-resources` |

## Estructura

```text
src/Programacion_Trabajo/
|- Main.java                Punto de entrada
|- WordleGame.java          Flujo principal de la partida
|- WordleFeedBack.java      Evaluación y colores de las letras
|- WordleFileManager.java   Diccionario e historial
`- WordleException.java     Excepción personalizada

Words.txt                   Diccionario local
Historial.txt               Registro de la última partida
```

## Ejecutar el proyecto

Abre una terminal en la raíz del repositorio y compila las clases:

```powershell
javac -d out src\Programacion_Trabajo\*.java
```

Ejecuta la aplicación desde la misma carpeta para que pueda encontrar `Words.txt`:

```powershell
java -cp out Programacion_Trabajo.Main
```

## Ejemplo de partida

```text
Bienvenido al juego del Wordle

Tienes 6 intentos restantes
Escribe tu palabra de 5 letras: casas
```

Después de cada intento, la consola muestra las letras en verde, amarillo o rojo según su relación con la palabra secreta.

## Objetivo del proyecto

El proyecto se desarrolló para practicar programación orientada a objetos, gestión de archivos, validación de entrada, excepciones y separación de responsabilidades en Java.
