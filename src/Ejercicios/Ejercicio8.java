package Ejercicios;

import java.util.Arrays;

public class Ejercicio8 {
    public int maxAscendingSum(int[] nums) {
      int resultado =0;
      int numax = 0;
      int suma = 0;

        // buscar numero mas alto
        for (int i =0;i<nums.length;i++){
            if (nums[i] > numax){
            numax = nums[i];
            }
        }

        // Array mas largo
        for (int i = 0; i < (nums.length); i++){ //[12,17,15,13,10,11,12]
            if (i < (nums.length -1)) {

                if (nums[i] < nums[i + 1]) {
                    suma += nums[i];
                }
                if(suma !=0){
                    suma += nums[i];
                }
                if (resultado > suma) {
                    suma = 0;
                } else {
                    resultado = suma;
                    suma = 0;
                }
            }else{
                suma += nums[i];
                resultado = suma;

            }

        }

        //mas alto
        if (numax<resultado){
            return resultado;
        }else {
            return numax;
        }


    }
}


