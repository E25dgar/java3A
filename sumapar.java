
package clases;

import java.util.Scanner; 


public class sumapar {
    
      

    public static void main(String[] args) {
      
        Scanner leer=new Scanner(System.in);
        int numero;
        int mayor=0;
        int menor=1000000;
        int contP=0;
        int acumP=0;
        int contI=0;
        int acumI=0;
        int i=0
        
        for (i=1; i<=4; i++){
            System.out.println("ingrese un numero:");
            
            numero=leer.nextInt();
            
            if(mayor<numero){
                mayor=numero;
             
            }
             if (menor>numero){
                 menor=numero;
                 
                 
             }
              if (i % 2 == 0){
                 contP=contP+1;
        
                acumP=acumP+i;
        
        
              }else{
        
                 contI ++;
        
                acumI=acumI+i;
          
               }
            
            
        }
        System.err.println("numero mayor :"+mayor);
        System.out.println("numero menor:"+menor);
        System.out.println("suma  de pares :"+acumP);
        System.out.println("suma  de impares :"+acumI);
        
        
    }
    
    
    
   }  
    
}
