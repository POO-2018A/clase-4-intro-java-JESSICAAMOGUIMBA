
 
package temperatura;

import java.util.Scanner;


public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        System.out.println("\tCONVERSOR DE GRADOS");
        
        do{
            System.out.println("Ingrese grados en Fahrenheit de 0 a 100");
           fahrenheit = scan.nextDouble();
        if (fahrenheit<100 && fahrenheit>0){
            fahrenheit=(((fahrenheit- 32)*5)/9);
            celsius = fahrenheit ;
        System.out.println("Temperatura en Celsius es: "+celsius);
        }else{
            System.out.println("error");
        }
        
        }while(fahrenheit<100 && fahrenheit>0);
        
        
        
        
        
        
        /*
        System.out.println("\tCONVERSOR DE GRADOS");
        System.out.println("Ingrese grados en Fahrenheit de 0 a 100");
        double fahrenheit = scan.nextDouble();
          
        if(fahrenheit<100 && fahrenheit>0){
         fahrenheit=(((fahrenheit- 32)*5)/9);
        double celsius = fahrenheit ;
        System.out.println("Temperatura en Celsius es: "+celsius);
         }else {
             System.out.println("Error dato ingresado fuera de rango");
         }*/
        
        
    }
    
}
