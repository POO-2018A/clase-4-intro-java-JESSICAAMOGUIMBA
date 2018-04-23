
package edad;

import java.util.Scanner;


public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
        int edad ;
        
        do{
            System.out.println("Ingrese su edad.");
            edad = scan.nextInt();
        if (edad >= 18){
            System.out.println("Es mayor de edad");
        }else if(edad<0){
        System.out.println("Error edad invalida");
        }else{
            System.out.println("Es menor de edad");
        }
        
        }while(edad!=0);
         
    }
    
}
