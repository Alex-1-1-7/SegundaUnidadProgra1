/*
crear un arreglo y llenarlo, luego buscar el segundo numero mayor de ese
arreglo
*/
package encontrarSegundoMayor;


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
  }
    
}
