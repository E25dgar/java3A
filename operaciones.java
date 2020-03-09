import java.util.Scanner;
 
class operaciones {
 
    public static void main( String args[] ) {
 
        Scanner teclado;
        int primerNumero, segundoNumero;
 
        teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer número: " );
        primerNumero = teclado.nextInt();
        System.out.print( "Introduzca el segundo número: " );
        segundoNumero = teclado.nextInt();
 
        System.out.print( "Su suma es: " );
        System.out.println( primerNumero+segundoNumero );
        
         System.out.print( "la resta  es: " );
        System.out.println( primerNumero-segundoNumero );
        
         System.out.print( "Su division es: " );
        System.out.println( primerNumero/segundoNumero );
        
         System.out.print( "la multiplicacion es: " );
        System.out.println( primerNumero*segundoNumero );
    }
}