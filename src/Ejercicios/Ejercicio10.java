package Ejercicios;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
 * EJERCICIO:
 * - Muestra ejemplos de asignación de variables "por valor" y "por referencia", según
 *   su tipo de dato.
 * - Muestra ejemplos de funciones con variables que se les pasan "por valor" y
 *   "por referencia", y cómo se comportan en cada caso en el momento de ser modificadas.
 * (Entender estos conceptos es algo esencial en la gran mayoría de lenguajes)
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea dos programas que reciban dos parámetros (cada uno) definidos como
 * variables anteriormente.
 * - Cada programa recibe, en un caso, dos parámetros por valor, y en otro caso, por referencia.
 *   Estos parámetros los intercambia entre ellos en su interior, los retorna, y su retorno
 *   se asigna a dos variables diferentes a las originales. A continuación, imprime
 *   el valor de las variables originales y las nuevas, comprobando que se ha invertido
 *   su valor en las segundas.
 *   Comprueba también que se ha conservado el valor original en las primeras.
 */

public class Ejercicio10 {
    public static void main(String[] args) {



        String cadena1 = "hola", cadena2 = "adios", newcadena1, newcadena2;
        String []arraycadena = new String[2];


        int num1 = 12;
        int num2 = 25;
        int[] arrayint = new int[2];
        int newnum1, newnum2;

        arrayint = programa1(num1, num2);
        newnum1 = arrayint[0];
        newnum2 = arrayint[1];
        System.out.println("El antiguo num1 era: " + num1 + "\nEl nuevo num1 es: "+ newnum1);
        System.out.println("El antiguo num2 era: " + num2 + "\nEl nuevo num2 es: "+ newnum2);
        arraycadena = programa2(cadena1, cadena2);
        newcadena1 = arraycadena[0];
        newcadena2 = arraycadena[1];
        System.out.println("El antiguo Array1 era: " + cadena1 + "\nEl nuevo Array1 es: "+ newcadena1);
        System.out.println("El antiguo Array2 era: " + cadena2 + "\nEl nuevo Array2 es: "+ newcadena2);



    }
    public static int[] programa1 ( int num1, int num2){
        int array[] = new int[2];
        array[0] = num2;
        array[1] = num1;
        return array;
    }
    public static String[] programa2 (String cadena1, String cadena2){
        String array[] = new String[2];
        array[0] = cadena2;
        array[1] = cadena1;
        return array;
    };



    }



