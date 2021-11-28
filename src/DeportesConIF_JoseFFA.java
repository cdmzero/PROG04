/*
 Realizar una clase llamada DeportesConIF_Nombre (Nombre es vuestro nombre), 
que llevará un método main(), en el que se implementará un algoritmo 
que lea por teclado la temperatura y escriba en la salida cuál es el 
deporte apropiado para practicar según los siguientes datos 
(no se puede utilizar switch case):
 */



import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jose Funez
 */
public class DeportesConIF_JoseFFA {
    
    
    
    
    public static void main (String[] args) {
   
            try{
                
            Scanner sc = new Scanner( System.in );
            System.out.println("Introduce la temperatura");
            int temp = sc.nextInt();
            
                
             if( temp > 30 )
             System.out.println("Natacion");
             
             else if( temp > 15 && temp <= 30 )
             System.out.println("Golf");
             
             
             else if( temp > 5 && temp <= 15 )
             System.out.println("Tenis");
             
             
             else if( temp > -10 && temp <= 5 )
             System.out.println("Esquí");
             
             
             else if( temp <= -10 )
             System.out.println("Damas");
             
       
                         
            } catch(InputMismatchException err){
             System.out.println("Tipo de dato invalido introducido");
            }
    }
        
    
    }
   
    
}
