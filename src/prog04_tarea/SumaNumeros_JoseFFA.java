/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog04_tarea;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class SumaNumeros_JoseFFA {
    
    
    public static void main(String[] args){ 
        try{
                Scanner sc = new Scanner( System.in);
                int n = sc.nextInt();
            
                for( int i = n ; i >= -1 ; i-- ){
          
                    if(i != -1 )
                    System.out.println( "Resultado: "+ n +" + "+ i +" = "+(i+n));
                    else
                    System.out.println( "Fin: "+ i);
                
          }
          
        }catch(InputMismatchException err){
            System.out.println( "Dato introducido invalido");
            
        }
    }
    
}
