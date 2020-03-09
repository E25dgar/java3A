import java.util.Scanner;
 
public class RangoNumeros {
   
    Scanner teclado = new Scanner(System.in);
   
    int inicio, fin;
   
    public void entradatos() {
        System.out.println("Por favor ingrese los valores aleatorios");
        System.out.print("Ingrese el valor rango inferior: ");
        inicio = teclado.nextInt();
        System.out.print("Ingrese el valor rango superior: ");
        fin = teclado.nextInt();       
    }
   
    public void proceso() {
        for(int x = inicio; x <= fin; x++) {
            System.out.println(x);
        }
    }
 
    public static void main(String[] args) {
        RangoNumeros fc = new RangoNumeros();
        fc.entradatos();
        fc.proceso();
    }
    
    
    
    
    
}