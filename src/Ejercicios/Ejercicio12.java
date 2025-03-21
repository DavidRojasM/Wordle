package Ejercicios;
/*Given an array of integers arr, return the number of subarrays with an odd sum.

Since the answer can be very large, return it modulo 109 + 7.*/
//arr = [1,3,5]

public class Ejercicio12 {


    public int[][] subarrays(int array[]){
        int [][] solucion = new int[array.length][array.length];

        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array.length; j++)
            solucion[j][i] = array[i];



        }



        return solucion;
    }



}
