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
public class SumaNaturalesConFor_JoseFFA {
    
    public static void main(String[] args){
    
        try{
        
          Scanner sc    = new Scanner(System.in);
          int n         = sc.nextInt();
         
          
          for( int i = 0 ; i <= n ; i++ ){
          
          System.out.println( "Resultado: "+ n +" + "+ i +" = "+(i+n));
          
          }
          
            
        }catch(InputMismatchException e){
        
            System.out.println("Valor invalido");
            
        }
    
    }
    
}
