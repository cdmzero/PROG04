
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Hay que realizar una clase llamada DeportesConSwitchCase_Nombre (Nombre es vuestro nombre), que llevará un método main(),
en el que se implementará un algoritmo que lea por teclado la temperatura y escriba en la salida cuál es el deporte apropiado 
para practicar según los siguientes datos (en este caso sí hay que utilizar switch case):
 */

/**
 *
 * @author zero
 */
public class DeportesConSwitchCase_JoseFFA {
    
    public static void main(String[] args){
    
        try{
         
        Scanner sc  = new Scanner( System.in);
        
        int temp    = sc.nextInt();
        
        switch(temp){

            case 16,17,18,19,20,21,22,23,24,25,26,27,28,29,30 -> System.out.println("Golf");
            
            case 6,7,8,9,10,11,12,13,14,15 -> System.out.println("Tenis");
                    
            case -4,-3,-2,-1,1,2,3,4,5 -> System.out.println("Tenis");

            case -5,-6,-7,-8,-9,-10 -> System.out.println("Esqui");
            
            default -> { 
                if(temp > 30 ){
                    System.out.println("Natacion");
                }else{
                    System.out.println("Damas");
                }
                }
        }
        
        }catch(InputMismatchException err) {
            
           System.out.println("Tipo de dato invalido introducido");

    
        }
    
   
    }
}
