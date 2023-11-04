/*
crear un arreglo y llenarlo, luego buscar el segundo numero mayor de ese
arreglo
*/
package encontrarSegundoMayor;

//ABAJO ESTA UN CODIGO MAS CHINGON 
public class EncontrarSegundoMayor {
    public static void main(String[] args){
    int [] arreglo = {1,2,3,4,5,6,89,78};
    int mayor=0,segundo=0;
    
    for (int i = 0;i<arreglo.length;i++){
        if (mayor<arreglo[i]){
        mayor = arreglo[i];
        }
    }
    System.out.println("EL NUMERO MAYOR ES: "+mayor);
        
    for (int j = 0;j<arreglo.length;j++){
        if (arreglo[j] < mayor ){
            // tambien funciona asi: arreglo[j] < mayor && segundo <mayor
        segundo = arreglo[j];
        }
    }
        System.out.println("EL SEGUNDO NUMERO MAYOR ES: "+segundo);
    /*codigo mas vergon
        Scanner entrada = new Scanner(System.in);
        int longitud,mayor=0,segundo=0,posicionM=0,posicionS=0;
        System.out.println("Ingrese la longitu del vector.");
        longitud = entrada.nextInt();
        int [] array = new int [longitud];
        System.out.println("Debes llenar el vector ");
        for (int i = 0; i < array.length; i++){
            System.out.println("Ingrese un numero en la posicion: "+(i+1));
            array [i] = entrada.nextInt();
        }
        // mayor
        for (int i = 0; i < array.length; i++){
            if (array[i]>mayor){
            mayor = array[i];
                if (mayor == array[i]){
                posicionM = (i+1);
                }
            }
        }
        System.out.println("El numero mayor es: "+mayor+" y la posicion es: "+posicionM);
        //segundo
        for (int i = 0; i < array.length; i++){
            if (array[i]<mayor&&array[i]>segundo){
            segundo = array[i];
                if (segundo == array[i]){
                posicionS = (i+1);
                }
            }
        }
        System.out.println("El segundo mayor es: "+segundo+" y la posicion es: "+posicionS);
        
        int suma,promedio;
        suma = mayor+segundo;
        System.out.println("La suma de ambos numeros es: "+suma);
        promedio = suma/2;
        System.out.println("El promedio es: "+promedio);
        */    
        
        
        
  }
    
}
