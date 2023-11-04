/*
declarar 2 vectores y rellenarlos, luego de llenarlos 
intermabiar los valores de los vectores, los valores del vector uno pasan a ser
del vector 2 y viceversa.
*/
package intercambioDeValores;

import java.util.Scanner;


public class IntercambioDeVaores {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
        int longitud;
        System.out.println("Ingrese la longitud del vector: ");
        longitud = entrada.nextInt();
        int [] vectorA = new int [longitud];  
        int [] vectorB = new int [longitud];
        System.out.println("Llene el vector A.");
        for (int i = 0; i < vectorA.length; i++){
            System.out.print("Ingrese un numero en la posicion "+(i+1)+" :");
            vectorA[i] = entrada.nextInt();
        }
        System.out.println("Llene el vector B.");
        for (int j = 0; j < vectorA.length; j++){
            System.out.print("Ingrese un numero en la posicion "+(j+1)+" :");
            vectorB[j] = entrada.nextInt();
        }
        //intercambiar los valores 
        int aux;
        System.out.println("Los valores del vector A ahora son:");
        for (int i = 0; i < vectorA.length; i++){
            aux = vectorA[i];
            vectorA [i] = vectorB[i];
            vectorB[i] = aux;
            System.out.println("El vector A ahora tiene los valores: "+vectorA[i]);
        }
        System.out.println("Los valores del vector B ahora son:");
        for (int i = 0; i < vectorA.length; i++){
            System.out.println("El vectro B ahora tiene los valores: "+vectorB[i]);
        }
    }
    
}
