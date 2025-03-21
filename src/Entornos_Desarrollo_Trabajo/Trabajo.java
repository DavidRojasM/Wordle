package Entornos_Desarrollo_Trabajo;
// @Author Antonio "El crack"

import java.util.Arrays;
import java.util.Scanner;

public class Trabajo {

    /*
    Programa que recibe 10 números enteros por teclado,
    los ordena de menor a mayor mostrando número de pares e impares
     */
    public static void main(String[] args) {

        // Declaración de variables
        int numPares = 0;
        int numImpares = 0;
        int [] numeros = new int[10];
        Scanner sn1 = new Scanner (System.in);


        // Pedir numeros
        for (int i = 0; i < 10; i++){
            System.out.println("Introduce número natural:");
            numeros[i] = sn1.nextInt();
        }

        // Calcular pares
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i]%2 ==0)
                numPares += 1;
            else
                numImpares+=1;
        }

        // Ordenar numeros
        Arrays.sort(numeros);

        // Mostrar numeros por pantalla
        for (int i : numeros) System.out.println(i);

        // Indicar numero de pares e impares
        System.out.println("En los números introducidos hay: " + numPares + " números pares");
        System.out.println("En los números introducidos hay: " + numImpares + " números impares");

    }
}
