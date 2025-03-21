package Ejercicios;
/*
 * EJERCICIO:
 * Entiende el concepto de recursividad creando una función recursiva que imprima
 * números del 100 al 0.
 *
 * DIFICULTAD EXTRA (opcional):
 * Utiliza el concepto de recursividad para:
 * - Calcular el factorial de un número concreto (la función recibe ese número).
 * - Calcular el valor de un elemento concreto (según su posición) en la
 *   sucesión de Fibonacci (la función recibe la posición).
 */

public class Ejercicio11 {
    public static void main(String[] args) {
       // contar(0);
        int resultado =1;
        System.out.println(factorial(11));

    }
    public static int factorial (int a){

        if (a<0){
            System.out.println("El numero debe ser mayor que 0.");
            return 0;

        }else if (a ==1)
            return 1;
        else {

            return a * factorial(a -1);
        }


    }
    public static void contar(int a){
       if (a < 101){
           System.out.println(a);
           a++;
           contar(a);

        }



    }
}
