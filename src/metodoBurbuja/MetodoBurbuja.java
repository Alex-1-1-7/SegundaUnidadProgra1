/*
metodo de ordenamiento burbuja, es un sencillo algoritmo de ordenamiento, funciona 
revisando cada elemento de la lista que va a ser ordenada con el siguiente,
intercambiandolos de posicion si estan en el orden equivocado. Es necesario 
revisar varias veces toda la laista hasta que no se necesiten mas intercambios,
lo cual significa que la lista esta ordenada.
*/
package metodoBurbuja;

import java.util.Scanner;

public class MetodoBurbuja {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        //int numeros [] = {5, 7, 3, 4, 6, 2, 3};
        int longitud, aux;
        System.out.print("Ingrese la logitud del vector");
        longitud = entrada.nextInt();
        int numeros [] = new int [longitud];
        System.out.println("Llene el vector");
        for (int i = 0; i< numeros.length; i++){
            System.out.print("Ingrese un numero en la posicion "+(i+1)+" :");
            numeros [i] = entrada.nextInt();
        }
        
        for (int i = 0; i< (numeros.length-1); i++){
            for (int j = 0; j < (numeros.length-1);j++){
                if (numeros[j] > numeros[j+1]){
                aux = numeros[j];
                numeros [j] = numeros [j+1];
                numeros [j+1]= aux;
                }
            }
        }
        System.out.println("El vector ordenado de forma creciente");
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        System.out.println("El vector ordenado de forma decreciente");
        for (int i = (numeros.length-1); i >=0; i--){
            System.out.println(numeros[i]);
        }
    }
    
}
