/*
llenar un vector, ordenar los numerosingresados y luego decir cuales 
son los numeros multiplos de los numeros ingresados
*/
package sonMultiplos;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class SonMultiplos {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int longitud;
        longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del vector (mayor a cero)"));
        while (longitud <= 0){
            longitud = Integer.parseInt(JOptionPane.showInputDialog("ERROR. Ingrese la longitud del vector (mayor a cero)"));
        }
        int [] vector = new int [longitud];
        
        System.out.println("Llene el vector con numeros enteros para saber sus numeros multiplos");
        for (int i = 0; i < vector.length; i++){
            System.out.print("Ingrese un numero (mayor que cero) en la posicion "+(i+1)+" : ");
            vector[i] = entrada.nextInt();
            while (vector[i]<=0){
                System.out.print("ERROR. Ingrese un numero (mayor que cero) en la posicion "+(i+1)+" : ");
                vector[i] = entrada.nextInt();
            }
        }
        // ordenar los numeros ingresados 4,3
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
        // imprimir los numeros de forma creciente
        System.out.println("Los numero ordenados de forma creciente. ");
        for (int i = 0; i < vector.length; i++){
            System.out.println((i+1)+". "+vector[i]);
        }
        
        // ver numeros multiplos de cada numero ingresado
        System.out.println("");
        for (int i = 0; i < vector.length; i++){
            for (int j = 1; j <=vector[i]; j++){
                if ( vector[i] % j == 0){
                    System.out.println("EL numero "+vector[i]+" es multiplo de: "+j);
                }
            }
            System.out.println("");
        }   
    }
}
