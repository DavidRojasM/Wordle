package Ejercicios;
/*
La Unión Europea ha decidido premiar al país que más toneladas de hortalizas exporte a lo
largo del año. Se dispone de un registro de transacciones comerciales en el que aparecen tres
valores en cada apunte.
El primer valor es el indicativo del país (E: España, F: Francia y A: Alemania), el segundo valor
es un indicativo de la hortaliza que se ha vendido en una transacción (T: Tomate, P: Patata, E:
        Espinaca) y el tercer valor indica las toneladas que se han vendido en esa transacción. Diseñar
un programa que lea desde el teclado este registro, el cual termina siempre al leer un país
con indicativo ’@’, y que diga qué país es el que más hortalizas exporta y las toneladas que
exporta.
        Por ejemplo, con la entrada:
E T 10 E T 4 E P 1 E P 1 E E 2 F T 15 F T 6 F P 20 A E 40 @
El país que más vende es Francia con un total de 41 toneladas.
*/

import java.util.Objects;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        //variables
        String pais;
        String hortaliza;
        int toneladasEspana = 0;
        int toneladasFrancia = 0;
        int toneladasAlemania = 0;
        String paisganador;
        int toneladasganadoras;

        //bucle
        while (true) {

            System.out.println("Introduce el Pais al que vas a hacer registro: (E: España, F: Francia y A: Alemania): ");
            pais = scan.nextLine();
            if (Objects.equals(pais, "@")) {
                break;
            } else {

                System.out.println("Introduce la hortaliza que se haya vendido: (T: Tomate, P: Patata, E:Espinaca)");
                hortaliza = scan.nextLine();

                if (Objects.equals(pais, "E")) {

                    System.out.println("Introduce las toneladas que se han vendido en esa transacción:");
                    toneladasEspana += scan2.nextInt();
                } else if (Objects.equals(pais, "F")) {
                    System.out.println("Introduce las toneladas que se han vendido en esa transacción:");
                    toneladasFrancia += scan2.nextInt();
                } else if (Objects.equals(pais, "A")) {
                    System.out.println("Introduce las toneladas que se han vendido en esa transacción:");
                    toneladasAlemania += scan2.nextInt();

                }

            }


        }
        if (toneladasEspana > toneladasAlemania && toneladasEspana> toneladasFrancia)
        {
            paisganador = "España";
            toneladasganadoras = toneladasEspana;
        }else if(toneladasAlemania > toneladasEspana && toneladasAlemania > toneladasFrancia)
        {
           paisganador = "Alemania";
           toneladasganadoras = toneladasAlemania;

        }else{
            paisganador = "Francia";
            toneladasganadoras = toneladasFrancia;
        }

        System.out.println("El pais que mas hortalizas a vendido es: " + paisganador + " con: " + toneladasganadoras + " toneladas.");
    }
}

