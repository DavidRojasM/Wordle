package Ejercicios;

import java.util.*;

public class Pruebas {
    public static void main(String[] args) {

        System.out.println(romano(16549));


    }
    public static String romano(int numero){
        String roman[] = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int numeros[] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String temporal = "";
        for (int i = roman.length - 1; i >= 0; i--) {
            for (int j = 1; j <= (numero / numeros[i]); j++)
                temporal = temporal + roman[i];
            numero = numero % numeros[i];
        }
        return temporal;
    }

}

