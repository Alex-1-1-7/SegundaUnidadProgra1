/*
llenar un vector y decir cuales numeros son primos, mostrar el numero que es primo 
*/
package cuantosSonPrimos;
import java.util.Scanner;
public class CuantosSonPrimos {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int longitud;
        System.out.print("Indique la longitud del vector:");
        longitud = entrada.nextInt();
        int [] vector = new int [longitud];
        
        System.out.println("Llene el vector.");
        for (int i = 0; i < vector.length; i++){
            System.out.print("Ingrese un numero en la posicion "+(i+1)+" :");
            vector[i] = entrada.nextInt();
        }
        //numeros primos: 2,3,5,7,11,13,17,19,23
        //Los únicos números pares que son primos son el 2. Todos los demás 
        //números primos son impares. Esto se debe a que un número primo sólo 
        //es divisible por 1 y por sí mismo. Para que un número sea par tiene 
        //que ser divisible por 2, pero si un número es divisible por otro número 
        //además de 1 y de sí mismo, entonces no es primo. Por esta razón, 
        //el 2 es el único número primo par.
        /* for (int i = 0; i < vector.length; i++) {
            int contador = 0;
            for (int j = 2; j < vector[i]; j++) {
                if (vector[i] % j == 0) {
                    contador++;
                    break;
                }
            }
            if (contador == 0 && vector[i] > 1) {
                System.out.println("El numero: " + vector[i] + " es Primo");
            } else {
                System.out.println("El numero: " + vector[i] + " NO es Primo");
            }
        }*/
        // otra forma
        for (int i = 0; i < vector.length; i++) {
            int contador = 0;
            for (int j = 1; j <= vector[i]; j++) {
                if (vector[i] % j == 0) {
                    contador++;
                   
                }
            }
            if (contador == 2) {
                System.out.println("El numero: " + vector[i] + " SI es Primo");
            } else {
                System.out.println("El numero: " + vector[i] + " NO es Primo");
            }
        }
    }
    
}
