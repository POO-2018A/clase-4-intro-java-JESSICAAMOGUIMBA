
package numeros;

import java.util.Scanner;

public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.println("\t\t ADIVIDAR SI EL NÚMERO INGRESADO ES PAR O IMPAR");
        
        int numero;
       
    do{
    System.out.println("Ingrese un número");
     numero=scan.nextInt();
     if(numero % 2 == 0){
        System.out.println("El número  " + numero +" ingresado es par");
    }else{
        System.out.println("El número " + numero +" ingresado es impar");
     }
        
    }while(numero!=0);   
    }
    
}
