
package clases;

import java.util.Scanner; 


public class sumapar {
    
      

    public static void main(String[] args) {
        
        sumapar cn = new sumapar();
        cn.mostrar();
      
     
    }

    private void mostrar() {
        Scanner leer=new Scanner(System.in);
        int numero;
        int mayor=0;
         int menor=1000000;
        
        
        for (int i=1; i<=4; i++){
            System.out.println("ingrese un numero:");
            
            numero=leer.nextInt();
            
            if(mayor<numero){
                mayor=numero;
             
            }
             if (menor>numero){
                 menor=numero;
                 
                 
             }
            
            
        }
        System.err.println("numero mayor :"+mayor);
        System.out.println("numero menor:"+menor);
        
        
        
    }
    
    
    
    
    
}
