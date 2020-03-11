
package numeromayor;

import java.util.Scanner;

public class Numeromayor {

    public static void main(String[] args) {
        
        Scanner entrada=new entrada(System.in);
        
        int n1, n2, n3, n4;
        
        System.out.print("digite el 1er numero:");
        n1=entrada.nextInt();
        
        
        System.out.print("digite el 2do numero:");
        n2=entrada.nextInt();
        
        
        System.out.print("digite el 3er numero:");
        n3=entrada.nextInt();
        
        
        System.out.print("digite el 4to numero:");
        n4=entrada.nextInt();
        
        if(n1==n2 && n2==n3 && n3==n4){
            System.out.println("los tres numeros son iguales:");
            
           
        
        }else if(n1>n2 && n1>n3 && n1>n4){
            System.out.println("el numero mayor es:"+n1);
            
            
        
        }else if(n2>n1 && n2>n2 && n2>n3 && n3>n4){
            System.out.print("el numero mayos es :"+n2);
            
            
            
        }else if (n3>n1 && n3>n2 && n3>n3 && n3>n4){
            System.out.print("el numero mayos es :"+n3);     
            
        }else{
            System.out.println("el numero mayor es:"+n4);
            
        }
        
 
        
    }
    
}
