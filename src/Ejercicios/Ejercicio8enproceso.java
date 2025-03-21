package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/*
Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.
Example 1:

Input: matrix =
[
  [0,1,1,1],
  [1,1,1,1],
  [0,1,1,1]
]
Output: 15
Explanation:
There are 10 squares of side 1.
There are 4 squares of side 2.
There is  1 square of side 3.
Total number of squares = 10 + 4 + 1 = 15.

public class Ejercicio8 {

    public static void main(String[] args) {
        int m, n;
        Scanner scanint = new Scanner(System.in);
        System.out.println("Número de columnas?");
        m = scanint.nextInt();
        System.out.println("Número de filas?");
        n = scanint.nextInt();
        matriz(m, n);
    }
    public static void matriz(int columnas, int filas){

        int [][] matrix = new int[columnas][filas];
        for (int i =0;i < columnas; i++)
            for (int j =0; j<filas;j++)
                matrix[i][j] = (int)(Math.random()*10)%2;



        System.out.println(Arrays.deepToString(matrix));

    }
    public static void barcos(int[][] matrix){
        int barcos = 0;

        for (int i =0;i < matrix.length; i++) {             //Aumenta la X
            int contadorx =0;
            int contadory =0;
            int xtemp = 0;
            int ytemp = 0;
            for (int j = 0; j < matrix[0].length; j++) {    //Aumenta la Y
                do {                                        //Aumenta la x en el contador
                    do {                                    //Aumenta la y en el contador
                        if (matrix[i + contadorx][j + contadory] == 1) { // comprueba si es barco
                            contadory++;
                        }
                    }while (matrix[i + contadorx][j + contadory] == 1 || matrix[i + contadorx][j +contadory]< matrix[0].length) ;
                    ytemp = contadory;
                    contadory = 0;
                    do {
                        if (matrix[i + contadorx][j + contadory] == 1) {
                            contadorx++;
                        }
                    }while (matrix[i+][j] ==1);
                }while (matrix[i + contadorx][j + contadory] ==1);

                //     if (matrix[i][j] == 1 && matrix[i][j + 1] == 1 && matrix[i + 1][j] == 1){

            }
        }


    }

}
*/