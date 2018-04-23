
package mesesdelanio;

import java.util.Scanner;

public class MesesDelAnio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
        System.out.println("\t\t CALCULO DEL MES POR INGRESO DE UN NÚMERO");
        System.out.println("Ingrese un número");
       int mes;
       mes=scan.nextInt();
       
       switch(mes){
           case 1:
            System.out.println("Número  "+ mes+" Corresponde a: ENERO");
            break;
           case 2:
               System.out.println("Número  "+ mes+" Corresponde a: FEBRERO");
               break;
            case 3:
            System.out.println("Número  "+ mes+" Corresponde a: MARZO");
            break;
           case 4:
               System.out.println("Número  "+ mes+" Corresponde a: ABRIL");
               break;
           case 5:
            System.out.println("Número  "+ mes+" Corresponde a: MAYO");
            break;
           case 6:
               System.out.println("Número  "+ mes+" Corresponde a: JUNIO");
               break;
            case 7:
            System.out.println("Número  "+ mes+" Corresponde a: JULIO");
            break;
           case 8:
               System.out.println("Número  "+ mes+" Corresponde a: AGOSTO");
               break;   
            case 9:
            System.out.println("Número  "+ mes+" Corresponde a: SEPTIEMBRE");
            break;
           case 10:
               System.out.println("Número  "+ mes+" Corresponde a: OCTUBRE");
               break;   
            case 11:
            System.out.println("Número  "+ mes+" Corresponde a: NOVIEMBRE");
            break;
           case 12:
               System.out.println("Número  "+ mes+" Corresponde a: DICIEMBRE");
               break;   
           default:System.out.println("Error intente nuevamente");
           break;
       } 
    }
    
}
