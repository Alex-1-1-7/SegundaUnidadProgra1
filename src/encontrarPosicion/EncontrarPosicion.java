/*
crear un vector y llenarlo, luego pedir un numero
y buscarlo en el vector, si esta en el vector se debe indicar en que posicion
esta dicho numero y si no decir que el numero no se encuentra
*/
package encontrarPosicion;

import java.util.Scanner;
public class EncontrarPosicion {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int longitud,numero;
        System.out.print("Ingrese la longitud del vector: ");
        longitud = entrada.nextInt();
        while (longitud<=0){
            System.out.print("ERROR. Debe ingresar un numero mayor a cero:");
            longitud = entrada.nextInt();
        }
        int numeros [] = new int [longitud];
        
        System.out.println("Ingrese los valores al arreglo");
        for (int i=0;i<numeros.length;i++){
            System.out.print((i+1)+". Ingrese un numero:");
            numeros [i] = entrada.nextInt();
        }
        boolean seEncuentra = true;
        System.out.print("Ingrese un numero para saber si se encuentra en el arreglo");
        numero = entrada.nextInt();
        for (int i = 0;i<numeros.length;i++){
            if (numeros[i]==numero){
                System.out.print("El numero: "+numero+" esta en la posicion: "+(i+1));
                seEncuentra = false;
                break;
            }
        }
        if (seEncuentra){
            System.out.print("El numero: "+numero+" no se encuentra en el arreglo. ");
        }
    }
}
