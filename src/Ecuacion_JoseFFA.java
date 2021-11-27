
import java.util.InputMismatchException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zero
 */
public class Ecuacion_JoseFFA {
    
    Ecuacion_JoseFFA(){
    
         a = 0;
         b = 0;
         c = 0;
    }
    
    Ecuacion_JoseFFA(int a , int b , int c){
    
         a = a;
         b = b;
         c = c;
    }
    
    int a ;
    int b ;
    int c ;
    
    
   int consultaA() {
        return this.a;
    }
   int consultaC() {
        return this.b;
    }
   int consultaB() {
        return this.c;
    }
   
   
     void cambiaA(int a) {
        this.a = a;
    }

    void cambiaB(int b) {
        this.b = b;
    }

    void cambiaC(int c) {
        this.c = c;
    }
    
    
    double calcularX1(int a, int b, int c) throws ExcepcionDiscriminanteNegativo{
        
      double discriminante = comprobarDiscriminante(a,b,c);
   
        discriminante = Math.sqrt(discriminante) ;
        double numerador = -(b) + discriminante;
        
        double denominador = 2 * a;
        
        double x= numerador/denominador;
                
        System.out.println("Resolucion positiva: "+x);
        
        return 0;
    }
    
    double calcularX2(int a, int b, int c) throws ExcepcionDiscriminanteNegativo{
   
      double discriminante = comprobarDiscriminante(a,b,c);
  
     
      discriminante = Math.sqrt(discriminante) ;
        
        
      double numerador = -(b) - discriminante;
        
      double denominador = 2 * a;
        
      double x= numerador/denominador;
                
      System.out.println("Resolucion negativa: "+x);
        
      return 0;
        
        
    }
    
    int comprobarDiscriminante(int a,int b, int c) throws ExcepcionDiscriminanteNegativo{
       
        
        double potencia = b;
                
        double bb = (int) Math.pow(potencia,2);
        
        double discriminante = bb-(4*(a*c));  
        
          
        if((discriminante < 0 )){
            
   
            throw new ExcepcionDiscriminanteNegativo("El discriminante es negativo no hay soluciones reales");
            
           
        }
        return (int) discriminante;
        
    }
    
    
    
    
    
    public static void main(String[] args) throws ExcepcionDiscriminanteNegativo{ 
       
     
        

        try{
         
            Ecuacion_JoseFFA miEcuacion = new Ecuacion_JoseFFA(3,2,-5);
            
            
            double x1 = miEcuacion.calcularX1(3,2,+5); 
            double x2 = miEcuacion.calcularX2(3,2,+5); 
       
        }catch(InputMismatchException err){
            System.out.println(err.getMessage());
            
        }catch(ExcepcionDiscriminanteNegativo err){
            System.out.println(err.getMessage());
        }
    }
}
