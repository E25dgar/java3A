
package operacionesaritmeticas;

import java.util.Scanner;


public class Operacionesaritmeticas {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        
        int respuesta;
        int num1;
        int num2;
        
        float resultado;
        
        System.out.println("dame el 1er numero");
        num1=entrada.nextInt();
        System.out.println("dame el 2do numero");
        num2=entrada.nextInt();
        
        
        
        System.out.println("menu de opciones");
        System.out.println("1.suma");
        System.out.println("2.resta");
        System.out.println("3.division");
        System.out.println("4.multiplicacion"); 
        
        respuesta=entrada.nextInt();
        
        switch (respuesta){
            case 1: 
                resultado=num1+num2;
                
                System.out.println("el resultado de la suma es:"+resultado);
                
                
                break;
                
            case 2:
                 resultado=num1-num2;
                
                System.out.println("el resultado de la resta es:"+resultado);
         
                break;  
            case 3;
                 resultado=num1/num2;
                
                System.out.println("el resultado de la division es:"+resultado);
                
            
                 break;
     
            case 4;
                 resultado=num1*num2;
                
                System.out.println("el resultado de la multiplicacion es:"+resultado);
                
                break;
                
                default;
                  System.out.println("esta no es una opcion");
                break;
               
        }
          
    }
    
}
