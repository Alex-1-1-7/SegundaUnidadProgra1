/*
histograma
*/
package unidad2arraystareas;

import java.util.Scanner;
public class Unidad2ArraysTareas {

    
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     int cantidad;
      
    System.out.println("Ingrese la longitud del vector: ");
    cantidad = entrada.nextInt();
    while (cantidad<=0){
            System.out.println("ERROR, Debe ingresar un numeromayor que cero.");
            cantidad=entrada.nextInt();
        }
    int numeros [] = new int [cantidad];
    
    System.out.println("Ingrese los numeros al arreglo");    
    for (int i=0; i<numeros.length;i++){
        System.out.println((i+1)+". Ingrese un numero:");
        numeros [i] = entrada.nextInt();
    while (numeros[i]<=0){
            System.out.println("ERROR, Debe ingresar un numeromayor que cero.");
            numeros [i] = entrada.nextInt();
        }   
    }
    for (int i=0; i<numeros.length;i++){
    String letra = "";
        // una nueva cadena vacia, similar a la que hiciste con la 
        //tienda de videojuegos, cuando reiniciaste el acumulador de la compra
        //del cliente
        for (int j = 0; j<numeros[i];j++){
        //si yo ingreso el numero 4 por ejemplo, este bloque de codigo tendra 
        //4 iteraciones, por lo canto se acumularan 4 X
        letra += "x ";
        }
    System.out.println(letra);
    }    
}
}
