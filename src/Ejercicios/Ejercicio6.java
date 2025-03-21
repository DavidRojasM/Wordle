package Ejercicios;

import java.util.Scanner;

/*
Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
 * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
 *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
 *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
 *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
 *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int resultado;
        String cadena1, cadena2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce cadena1: ");
        cadena1 = scan.nextLine();
        System.out.println("Introduce cadena2: ");

        cadena2 = scan.nextLine();
        resultado = lista(cadena1, cadena2);
        System.out.println("El resultado es: " + resultado);
    }

    public static int lista(String cadena1, String cadena2){
        int resultado = 0;
        for(int i = 0; i<100; i++){
            if(i%3 ==0 && i%5 ==0){
                System.out.println(cadena1 + " " + cadena2);
            }else if (i%5 ==0){
                System.out.println(cadena2);
            }else if (i%3 ==0){
                System.out.println(cadena1);
            }else{
                System.out.println(i);
                resultado += 1;
            }
        }
        return resultado;
    }
}
