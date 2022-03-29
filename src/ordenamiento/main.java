/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import java.util.Random;

/**
 *
 * @author User
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = llenarArrayAleatorio(0, 300, 10000);
        //System.out.println(arreglo[9]);
        burbujaSimple(arreglo);
    }

    public static void burbujaSimple(int[] arreglo) {
        int temp = 0;
        boolean ban = true;
        while (ban == true) {
            ban=false;
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    ban=true;
                    temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
    public static int [] llenarArrayAleatorio(int desde, int hasta, int tam){
        int[] numeros = new int[tam];                                                                             
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++) {
             numeros[i] = rnd.nextInt(hasta - desde + 1) + desde;                                                 
        }
        return numeros;
}
    
   

}
