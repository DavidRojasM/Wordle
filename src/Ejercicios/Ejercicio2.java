package Ejercicios;

/*
Escribe un programa en Java que pida al usuario el día y el mes de su nacimiento y le diga su
signo del zodíaco.
• Aries: 21/03 – 20/04
• Tauro: 21/04 – 21/05
• Géminis: 22/05 – 21/06
• Cáncer: 21/06 – 23/07
• Leo: 24/07 – 23/08
• Virgo: 24/08 – 23/09
• Libra: 24/09 – 23/10
• Escorpio: 24/10 – 22/11
• Sagitario: 23/11 – 21/12
• Capricornio: 22/12 – 20/01
• Acuario: 21/01 – 19/02
• Piscis: 20/02 – 20/03

*/

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia;
        int mes;
        System.out.println("¿En que mes naciste?");
        mes = scanner.nextInt();
        System.out.println("¿Y que día del mes?");
        dia = scanner.nextInt();
        if (mes == 1){
            if (dia <21){
                System.out.println("Eres Caprinornio.");
            }else{
                System.out.println("Eres Acuario");
            }

        }else if (mes == 2){
            if (dia <20){
                System.out.println("Eres Acuario.");
            }else {
                System.out.println("Eres Piscis");
            }

        }else if (mes ==3){
            if (dia <21){
                System.out.println("Eres Piscis.");
            }else{
                System.out.println("Eres Aries");
            }
        }else if (mes ==4){
                if (dia <21){
                    System.out.println("Eres Aries.");
                }else{
                    System.out.println("Eres Tauro");
            }

        }else if (mes ==5){
                if (dia <22){
                    System.out.println("Eres Tauro.");
                }else{
                    System.out.println("Eres Geminis");
            }

        }else if (mes ==6){
                if (dia <21){
                    System.out.println("Eres Geminis.");
                }else{
                    System.out.println("Eres Cancer");
            }

        }else if (mes ==7){
                if (dia <24){
                    System.out.println("Eres Cancer.");
                }else{
                    System.out.println("Eres Leo");
            }

        }else if (mes ==8){
                if (dia <24){
                    System.out.println("Eres Leo.");
                }else{
                    System.out.println("Eres Virgo");
            }

        }else if (mes ==9){
                if (dia <24){
                    System.out.println("Eres Virgo.");
                }else{
                    System.out.println("Eres Libra");
            }

        }else if (mes ==10){
                if (dia <24){
                    System.out.println("Eres Libra.");
                }else{
                    System.out.println("Eres Escorpio");
            }

        }else if (mes ==11){
                if (dia <23){
                    System.out.println("Eres Escorpio.");
                }else{
                    System.out.println("Eres Sagitario");
            }

        }else if (mes ==12){
                if (dia <22){
                    System.out.println("Eres Sagitario.");
                }else{
                    System.out.println("Eres Caprinornio");
            }

        }









    }





}
