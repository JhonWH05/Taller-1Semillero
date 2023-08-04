import java.util.Scanner;

public class Punto_23 {
    // Crea un programa que pida al usuario una oración y muestre cuántas palabras contiene

    public static void main(String[] args) throws Exception {
       Scanner leer = new Scanner(System.in);
       String oracion;

       System.out.println("Ingrese una oracion: ");
       oracion = leer.nextLine();

       String [] palabras = oracion.split("\\s+");

       int cantidadDePalabras = palabras.length;

       System.out.println("La oración tiene " + cantidadDePalabras + " Palabras");

       leer.close();
    }
}
