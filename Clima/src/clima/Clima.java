
package clima;

import java.util.Scanner;

public class Clima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
    boolean estaNevando = false;
    boolean estaLloviendo = true;
    double temperaturaAmbiente;
        System.out.println("Ingrese la temperatura ");
        temperaturaAmbiente = scan.nextDouble();
       if(temperaturaAmbiente>10 ){
        System.out.println("Vamos afuera!");
    }else if (temperaturaAmbiente<10||estaLloviendo||estaNevando){
     System.out.println("Nos quedamos en casa!");
    }
            
            
            
            
        
     
        
    
    
    
    
    
    
    }
    
}
