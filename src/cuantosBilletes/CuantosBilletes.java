/*
crear un arreglo, llenarlo y ordenarlo de manera creciente
y luego decir cuantos billetes de cada denomicacion (100, 50, 20, 10, 5, 1) 
necesita cada cifra ingresada
*/
package cuantosBilletes;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class CuantosBilletes {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int longitud;
        longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del vector (mayor a cero)"));
        while (longitud <=0){
            longitud = Integer.parseInt(JOptionPane.showInputDialog("ERROR. Ingrese la longitud del vector (mayor a cero)"));
        }
        int [] vector = new int [longitud];
        
        System.out.println("Llene el vector con numero positivos ");
        for (int i = 0; i < vector.length; i++){
            System.out.print("Ingrese un numero mayor a cero en la posicion "+(i+1)+" : ");
            vector [i] = entrada.nextInt();
            while (vector[i] <= 0){
                System.out.print("ERROR. Ingrese un numero mayor que cero en la posicion "+(i+1)+" : ");
                vector [i] = entrada.nextInt();
            }
        }
        // ordenar el arreglo de manera creciente  4,3
        int aux;
        for (int i = 0; i < vector.length-1; i++){
            for (int j = 0; j < vector.length-1; j++){
                if (vector[j]> vector[j+1]){
                    aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
            }
        }
        System.out.println("Vector ordenado crecientemente");
        for (int i = 0; i < vector.length; i++){
            System.out.println((i+1)+". "+vector[i]);
        }
        
        // cuantos billetes de cada denominacion necesita cada cifra 
        int cien, cincuenta, veinte, diez, cinco, uno;
        for (int i = 0; i < vector.length; i++){
            cien = vector[i] / 100;
            cincuenta = (vector[i] % 100) / 50;
            veinte = (vector[i] % 100 % 50) / 20;
            diez = (vector [i] % 100 % 50 % 20) / 10;
            cinco = (vector[i] % 100 % 50 % 20 % 10) / 5;
            uno = (vector[i] % 100 % 50 % 20 % 10 % 5) / 1;
            System.out.println("La cifra: "+vector[i]+" tiene "+cien+" biiletes de $100, "
            +cincuenta+" de $50, "+veinte+" de $20, "+diez+" de $10, "+cinco+" de $5 y "+uno+" de $1");
            
        }
        
        
        
    }
    
}
