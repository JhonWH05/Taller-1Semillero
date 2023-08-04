import java.util.Scanner;

public class Punto_19 {
    
    // Escribe un programa que solicite al usuario su nombre y luego lo imprima en mayúsculas y minúsculas 
    public static void main(String[] args) throws Exception {
       Scanner leer = new Scanner(System.in);
       String nombre;

       System.out.println(" Escriba Su nombre: " );
       nombre = leer.nextLine();

       String mayuscula = nombre.toUpperCase();
       System.out.println("Nombre en mayuscula: " + mayuscula);

       String minuscula =  nombre.toLowerCase();
       System.out.println(" Nombre en minuscula: " + minuscula);
    
       leer.close();
    }
    
}
