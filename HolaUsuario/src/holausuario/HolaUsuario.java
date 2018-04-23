
package holausuario;

import java.util.Scanner;


public class HolaUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);  
        System.out.println("\t\tIngrese su Nombre: ");
      String usuario= scan.nextLine();
        System.out.println("Hola "+ usuario);
    }
    
}
