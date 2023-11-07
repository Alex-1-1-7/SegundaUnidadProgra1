/*
crear un vector, llenarlo de numeros enteros y ordenarlos de manera creciente
y luego a esos numeros darles la vuelta como en el parcial
podria tambien decir cuantos digitos tiene cada numero
*/
package darleVueltaAlNum;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class DarleVueltaAlNum {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int longitud;
        longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrse la longitud del vector (mayor a cero)"));
        while (longitud <= 0){
            longitud = Integer.parseInt(JOptionPane.showInputDialog("ERROR. Debe ingresar la longitud del vector (mayor a cero)"));
        }
        int [] vector = new int[longitud];
        // llenar el vector
        System.out.println("Llene el vector con numeros enteros positivos");
        for (int i = 0; i < vector.length; i++){
            System.out.print("Ingrese un numero positivo en la posicion "+(i+1)+" : ");
            vector[i] = entrada.nextInt();
            while (vector[i] <= 0){
                System.out.print("ERROR. Ingrese un numero positivo en la posicion "+(i+1)+" : ");
                vector[i] = entrada.nextInt();
            }
        }
        // ordenar los numeros ingresados de manera creciente 4,3
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
        // mostrar los numeros ingresados ya ordenados de forma creciente
        System.out.println("Ahora el vector esta ordenado de manera creciente. ");
        for (int i = 0; i < vector.length; i++){
            System.out.println((i+1)+". "+vector[i]);
        }
        // quiero saber cuantos digitos tiene cada numero ingresado
        for (int i = 0; i < vector.length; i++){
            int num = vector[i];
            int digitos=0;
            while (num > 0){
                num = num /10;
                digitos++;
            }
            System.out.println("El numero "+vector[i]+" tiene "+digitos+" digitos.");
        }
        // darle la vuelta al numero 
        for (int i = 0; i < vector.length; i++){
            int numReves=0, digito, numero=vector[i];
            //numero 1234
            while (numero > 0)/*while (numero!=0)*/{
                digito = numero % 10;
                numReves = numReves * 10 + digito;
                numero = numero / 10; //numero /= 10;
            }
            System.out.println("El numero "+vector[i]+" al reves es: "+numReves);
        
/*for (int i = 0; i < vector.length; i++){
            int numReves=0, digito, numero=vector[i];
            //numero 1234
            while (numero!=0){
                digito = numero % 10;
                       // 1234 % 10 = 4 
              //digito = 4 primera iteracion
              
                       // 123 % 10 = 3
              //digito = 3 segunda iteracion
              
                      // 12   % 10 = 2
              //digito = 2   tercera iteracion
              
                      // 1    % 10 = 1
              //digito = 1    cuarta iteracion
              
                numReves = numReves * 10 + digito;
                //4 primera iteracion
                
                       //=  4       * 10 + 3 segunda iteracion 
              //numReves = 43 segunda iteracion 
                       
                       //=  43      * 10 + 2 tercera iteracion
              //numReves = 432 tercera iteracion
                       
                       //= 432      * 10 + 1 cuarta iteracion
              //numReves = 4321 cuarta iteracion YA ESTA EL REVES
                
                numero = numero / 10; //numero /= 10;
                         //1234 / 10 = 123,4
              //numero = 123 primera iteracion
                         //123  / 10 = 12,3
              //numero = 12  segunda iteracion
                         // 12  / 10 = 1,2
              //numero = 1 tercera iteracion 
                         // 1   / 10 = 0,1 
              //numero = 0 cuarta iteracion el cero ya no entra en el bucle
            }
            System.out.println("El numero "+vector[i]+" al reves es: "+numReves);
        }*/
        }
    }
}
