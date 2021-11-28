/*
Algoritmo para resolver ecuaciones de segundo grado teniendo en cuenta si el discrimante tiene soluciones reales
 */

/**
 * @author Jose Funez
 */
public class Ecuacion_JoseFFA {
    
    Ecuacion_JoseFFA(){
    a = 0;
    b = 0;
    c = 0;
    }
    
    Ecuacion_JoseFFA(int aa , int bb , int cc){
    a = aa;
    b = bb;
    c = cc;
    }
    
    int a ;
    int b ;
    int c ;
    
    
   int consultaA() {
   return this.a;
    }
   int consultaB() {
   return this.b;
    }
   int consultaC() {
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
        
        double discriminante    = comprobarDiscriminante(a,b,c);
   
        discriminante           = Math.sqrt(discriminante);
        
        double numerador        = -(b) + discriminante;
        
        double denominador      = 2 * a;
        
        double x                = numerador/denominador;
                    
        return x;
    }
    
    double calcularX2(int a, int b, int c) throws ExcepcionDiscriminanteNegativo{
   
       double discriminante     = comprobarDiscriminante(a,b,c);
  
       discriminante            = Math.sqrt(discriminante) ;
           
       double numerador         = -(b) - discriminante;
        
       double denominador       = 2 * a;
        
       double x                 = numerador/denominador;
                        
       return x;
    }
    
    int comprobarDiscriminante(int a,int b, int c) throws ExcepcionDiscriminanteNegativo{
        
        double doubleb          = b;
                
        double potenciab        = (int) Math.pow(doubleb,2);
        
        double discriminante    = potenciab - 4*a*c;
        
        if((discriminante < 0 )){
          throw new ExcepcionDiscriminanteNegativo("El discriminante es negativo no hay soluciones reales");  
        }
        
        return (int) discriminante;
        
    }
    
    
    public static void main(String[] args){
        try{
         
            Ecuacion_JoseFFA miEcuacion = new Ecuacion_JoseFFA(3,2,-5);
            
            int a           = miEcuacion.a;
            int b           = miEcuacion.b;
            int c           = miEcuacion.c;
            
            double x1       = miEcuacion.calcularX1(a,b,c); 
            double x2       = miEcuacion.calcularX2(a,b,c);
            
            System.out.println("Resolucion positiva: "+x1);
            System.out.println("Resolucion negativa: "+x2);
            
            miEcuacion.cambiaA(3); 
            miEcuacion.cambiaB(2);
            miEcuacion.cambiaC(+5);
             
            a               = miEcuacion.consultaA();
            b               = miEcuacion.consultaB();
            c               = miEcuacion.consultaC();
            
            x1              = miEcuacion.calcularX1(a,b,c); 
            x2              = miEcuacion.calcularX2(a,b,c);
            
            System.out.println("Resolucion positiva: "+x1);
            System.out.println("Resolucion negativa: "+x2);
            
        }catch(ExcepcionDiscriminanteNegativo err){
            System.out.println(err.getMessage());
        }
    }
}
