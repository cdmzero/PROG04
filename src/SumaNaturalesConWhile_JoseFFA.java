/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class SumaNaturalesConWhile_JoseFFA {
    
    public static void main(String[] args){
    
        try{
        
            Scanner sc  = new Scanner( System.in );
            int n       = sc.nextInt();
            int i = 0;
            
            while( i <= n ){
                
                   System.out.println( "Resultado: "+(i+n));
                   i++;
                
            }
           
              
        }catch(InputMismatchException err){
        
            System.out.println("Tipo de dato invalido");
        }
    
    
    
    }
    
}
