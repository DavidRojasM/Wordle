package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
        Crea un programa que implemente una calculadora definiendo las operaciones de suma,
resta, multiplicación y división. El programa se desarrollará poniendo en práctica el concepto
de diseño modular y cada una de las operaciones tendrá su función propia a la que se le
pasarán dos valores enteros para realizar las operaciones.
         */

        // Variables
        char operacion;
        double numero1;
        double numero2;
        double resultado;
        Scanner scan = new Scanner(System.in);
        Scanner scanchar = new Scanner(System.in);
        //pedir numeros
        System.out.println("¿cual es el primer numero?:");
        numero1 = scan.nextInt();
        System.out.println("¿Y el segundo?:");
        numero2 = scan.nextInt();




        //bucle
        do {
            System.out.println("¿Que opración deseas realizar?(*, /, +, -)");
            operacion = scanchar.nextLine().charAt(0);
            if (operacion == '*') {

                resultado =  multiplicacion(numero1, numero2);
                System.out.println("El resultado de su multiplicación es: " + (int)resultado);


            } else if (operacion == '/') {
                resultado = division(numero1, numero2);
                System.out.println("El resultado de su división es: " + resultado);

            } else if (operacion == '-') {
                resultado = resta(numero1, numero2);
                System.out.println("El resultado de su resta es: " + (int)resultado);


            } else if (operacion == '+') {
                resultado = suma(numero1, numero2);
                System.out.println("El resultado de su suma es: " + (int)resultado);


            } else {
                System.out.println("No has indicado correctamente la operación");
            }
        }while (operacion != '/' && operacion != '*' && operacion != '+' && operacion != '-');




    }



    public static double suma(double numero, double numero2) {
        double resultado;
        resultado = numero + numero2;
        return resultado;
    }

    public static double resta(double numero, double numero2) {
        double resultado;
        resultado = numero - numero2;
        return resultado;
    }

    public static double multiplicacion(double numero, double numero2) {
        double resultado;
        resultado = numero * numero2;
        return resultado;
    }

    public static double division(double numero, double numero2) {
        double resultado;
        resultado = numero / numero2;
        return resultado;

    }
}
