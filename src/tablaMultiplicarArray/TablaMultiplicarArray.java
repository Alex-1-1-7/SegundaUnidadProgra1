/*
 crear un vector, llenarlo y ordenarlo de manera creciente,luego esos numeros
 diran que tabla de multiplicar vamos a mostrar del 1 al 10
 */
package tablaMultiplicarArray;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TablaMultiplicarArray {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int longitud;
        longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del vector (mayor a cero)"));
        while (longitud <= 0){
            longitud = Integer.parseInt(JOptionPane.showInputDialog("ERROR. Ingrese la longitud del vector (mayor a cero)"));
        }
        int [] vector = new int [longitud];
        
        System.out.println("Ingrese al vector el numero de las tabalas d multiplicar que desea ");
        for (int i = 0; i < vector.length; i++){
            System.out.print("Ingrese un numero (mayor a cero) en la posicion "+(i+1)+" : ");
            vector[i] = entrada.nextInt();
            while (vector[i]<=0){
                System.out.print("ERROR. Ingrese un numero (mayor a cero) en la posicion "+(i+1)+" : ");
                vector[i] = entrada.nextInt();
            }
        }
        //ordenar el vector 4,3
        int aux;
        for (int i = 0; i < vector.length-1; i++){
            for (int j = 0; j < vector.length-1; j++){
                if (vector[j] > vector[j+1]){
                    aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
            }
        }
        // el vector de manera ordanada
        System.out.println("EL vector de manera ordenada crecientemente ahora queda asi ");
        for (int i = 0; i < vector.length; i++){
            System.out.print(vector[i]+" - ");
        }
        System.out.println("");
        // tablas de multiplicar
        for (int i = 0; i < vector.length; i++){
            System.out.println("Tabla de multiplicar del: "+vector[i]);
            int resultado;
            for (int j = 1; j < 11; j++){
                resultado = vector[i] * j;
                System.out.println(j+" X "+vector[i]+" = "+resultado);
            }
            
        }
    }
    
}
