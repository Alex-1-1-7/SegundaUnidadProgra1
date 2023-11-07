/*
 llenas un vector y decir si esos numeros son palindromos 
*/
package esPalidromo;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class EsPalindromo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int longitud;
        String palindromo;
        longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del vector(mayor que cero)"));
        while (longitud<=0){
            longitud = Integer.parseInt(JOptionPane.showInputDialog("ERROR. Ingrese la longitud del vector (mayor que cero)"));
        }
        int [] vector = new int [longitud];
        System.out.println("Ingrese numeros enteros positivos para saber si son palindromos o no.");
        for (int i = 0; i < vector.length; i++){
            System.out.print("Ingrese un numero positivo en la posicion "+(i+1)+" : ");
            vector[i] = entrada.nextInt();
            while (vector[i] <= 0){
                System.out.print("ERROR. Ingrese un numero positivo en la posicion "+(i+1)+" : ");
                vector [i] = entrada.nextInt();
            }
        }
        for (int i = 0; i < vector.length; i++){
            palindromo = String.valueOf(vector[i]);
            boolean siEs = true;
            for (int j = 0; j < palindromo.length(); j++){
                if (palindromo.charAt(j) != palindromo.charAt(palindromo.length()-1-j)){
                    siEs = false;
                    break;
                }
            }
            if (siEs){
                System.out.println("El numero "+vector[i]+" SI es palindromo");
            }else {
                System.out.println("El numero "+vector[i]+" NO es palindromo");
            }
            
        }
        
    }
}
