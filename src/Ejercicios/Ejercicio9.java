package Ejercicios;
/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
 */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        int numero = 0;
        char letras[] = {'I', 'V', 'X', 'L','C', 'D', 'M'};
        String numeroRoman = "";

        String numeroRomano = "";

        //Pedir usuario
            System.out.print("introduce tu numero: ");
            numeroRomano = scan.nextLine();
        // Comprobar si es numero romano o entero
        if (isRoman(numeroRomano)){
            numero = romanToEntero(numeroRomano);

            System.out.println("El numero Romano: " + numeroRomano + "\nEs igual al numero entero: " + numero);

        }else if (isEntero(numeroRomano)){
            numeroRoman = enteroToRoman(numeroRomano);
            System.out.println("El numero Entero: " + numeroRomano + "\nEs igual al número Romano: " + numeroRoman);
        }else {
            System.out.println("Lo lamento, eres tan inutil que no sabes escribir bien. \nNos vemos.");
        }



    }

    public static int romanToEntero(String numeroRomano) {
        int resultado = 0;
        char previo = ' ';
        for (int i = 0; i < numeroRomano.length(); i++) {

            if (numeroRomano.charAt(i) == 'I') {
                resultado += 1;
            } else if (numeroRomano.charAt(i) == 'V') {
                if (previo == 'I') {
                    resultado += 4;
                }else {
                    resultado += 5;
                }
            } else if (numeroRomano.charAt(i) == 'X') {
                if (previo == 'I') {
                    resultado += 9;
                }else {
                    resultado += 10;}


            } else if (numeroRomano.charAt(i) == 'L') {
                    if (previo == 'X') {
                        resultado += 40;
                    }else {
                        resultado += 50;}

            } else if (numeroRomano.charAt(i) == 'C') {
                        if (previo == 'X') {
                            resultado += 90;
                        }else {
                            resultado += 100;
                        }

            } else if (numeroRomano.charAt(i) == 'D') {
                            if (previo == 'C') {
                                resultado += 400;
                            }else {
                                resultado += 500;
                        }

            } else if (numeroRomano.charAt(i) == 'M') {
                            if (previo == 'C') {
                                resultado += 900;
                            }else {
                                resultado += 1000;
                        }


            }
            previo = numeroRomano.charAt(i);
        }
        return resultado;
    } // Funciona +-
    public static String enteroToRoman(String numero){
        String resultado = "";
        return resultado;
    } // Falta por hacer
    public static boolean isRoman(String numero){
        boolean resultado = false;
        char caracteres[] = numero.toCharArray();
        char letras[] = {'I', 'V', 'X', 'L','C', 'D', 'M'};
        char letrasusuario[] = new char[numero.length()];
        for (int i =0;i< caracteres.length;i++){
           if(Character.isAlphabetic(caracteres[i])){
               letrasusuario[i] = caracteres[i];
               if ( new String(letras).contains(String.valueOf(letrasusuario[i]))){
                   resultado = true;
               }else {
                   resultado = false;
                   break;
               }
           }else {
               resultado = false;
               break;
           }
        }

        return resultado;

    } // Precioso, faltan cosas
    public static boolean isEntero (String numero){
        boolean resultado = false;
        char caracteres[] = numero.toCharArray();
        for (int i =0; i< caracteres.length; i++){
            if(Character.isDigit(caracteres[i])){
                resultado = true;
            }else resultado=false;
        }

        return resultado;
    } // Menos precioso pero funciona
}
























