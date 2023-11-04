/*
el primer valor pasa a ser el ultimo, el segundo a ser el penultimo 
ejemplo: 32,24,28,17,19
ahora:   19,24,28,24,32
*/
package primerValorEsUltimo;

import java.util.Scanner;
public class PrimerValorEsUltimo {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int longitud;
        System.out.print("Ingrese la longitud del vector (entre 1-10) : ");
        longitud = entrada.nextInt();
        while (longitud <= 0 || longitud >10){
            System.out.println("ERROR. Ingrese la longitud del vector (entre 1-10)");
            longitud = entrada.nextInt();
        }
        int [] vector = new int[longitud];
        
        System.out.println("Llene el vector");
        for (int i = 0; i < vector.length; i++ ){
            System.out.print("Ingrese un numero (entre 1-100) en la posicion "+(i+1)+" :");
            vector [i] = entrada.nextInt();
             while (vector[i]<=0 || vector [i] >100){
                System.out.println("ERROR. Ingrese un numero (entre 1-100) en la posicion "+(i+1)+" : ");
                vector[i] = entrada.nextInt();
            }
        }
        //solo imprimiendolo al reves 
        System.out.println("El vetor al reves es: ");
        for (int i = longitud-1;i >=0; i--){
            System.out.print(vector[i]);  
            System.out.println(" ");
        }
        // intercambio de valores en el mismo vector
        int aux;
        for (int i = 0; i < vector.length/2; i++){
            aux = vector[i];
            vector[i] = vector[vector.length - 1 - i];
            vector[vector.length - 1 - i] = aux;    
        }
        System.out.println("El vector ahora es:");
        for (int i = 0; i < vector.length; i++){
            System.out.println(vector[i]);
        }
        
        // intercambio de valores pero creando otro vector
        int vectorB [] = new int[longitud];
        for (int i = 0; i < vector.length; i++){
            vectorB[longitud-1] = vector[i];
            longitud--;
        }
        System.out.println("El nuevo vector resultante es:");
        for (int i = 0; i < vector.length; i++){
            System.out.println("El numero en la posicion "+(i+1)+" es: "+vectorB[i]);
        }
    }
    
}
