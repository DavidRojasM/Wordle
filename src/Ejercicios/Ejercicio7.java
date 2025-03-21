package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Lo dejo para cuando sepa listas

/*
DIFICULTAD EXTRA (opcional):
Crea un programa que analice dos palabras diferentes y realice comprobaciones
 * para descubrir si son:
 * - Palíndromos: se lee igual de izquierda a derecha
 * - Anagramas: cambios en el orden de las letras
 * - Isogramas: no contiene letreas repetidas
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        //variables
        String palabra1, palabra2;
        boolean rpalindromo1, rpalindromo2, ranagrama, risograma1, risograma2;
        Scanner scan = new Scanner(System.in);

        //Comandos por consola
        System.out.print("Escribe la palabra1: ");
        palabra1 = scan.nextLine();
        System.out.print("Escribe la palabra2: ");
        palabra2 = scan.nextLine();

        //Proceso
        rpalindromo1 = palindromo(palabra1);
        rpalindromo2 = palindromo(palabra2);
        ranagrama = anagrama(palabra1, palabra2);
        risograma1 = isograma(palabra1);
        risograma2 = isograma(palabra2);


        //Resultado
        System.out.println(palabra1 + " y " + palabra2 + ":");
        System.out.println("\non palindromos: \nPalabra1: " + rpalindromo1 + "\nPalabra2: " + rpalindromo2);
        System.out.println("\nSon anagramas: " + ranagrama);
        System.out.println("\nSon isogramas: \nPalabra1: " + risograma1 + "\nPalabra2: " + risograma2);


    }

    public static boolean palindromo(String palabra1) {
        boolean resultado;
        List<Character> lista = new ArrayList<>();
        List<Character> lista2 = new ArrayList<>();
        int f;

        for (int i = 0; i < palabra1.length(); i++) {
            f = palabra1.length() - (i + 1);
            lista.add(palabra1.charAt(i));
            lista2.add(palabra1.charAt(f));
        }
        resultado = lista.equals(lista2);

        return resultado;

    }

    public static boolean anagrama(String palabra1, String palabra2) {
        boolean resultado;
        List<Character> lista = new ArrayList<>();
        List<Character> lista2 = new ArrayList<>();
        for (int i = 0; i < palabra1.length(); i++) {
            lista.add(palabra1.charAt(i));
        }
        for (int i = 0; i < palabra2.length(); i++) {
            lista2.add(palabra2.charAt(i));
        }
        Collections.sort(lista);
        Collections.sort(lista2);
        resultado = lista.equals(lista2);
        return resultado;
    }

    public static boolean isograma(String palabra1) {
        boolean resultado = true;
        List<Character> lista = new ArrayList<>();
        for (int i = 0; i < palabra1.length(); i++) {
            lista.add(palabra1.charAt(i));
        }
        Collections.sort(lista);
        for (int i = 0; i < (lista.size() - 1); i++) {
            if(lista.get(i) == lista.get(i+1)) {
                resultado = false;
            }
        }
            return resultado;
        }


    }



