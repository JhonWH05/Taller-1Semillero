import java.util.Scanner;

public class Punto_20 {
    
    // Realiza un programa que solicite al usuario una cadena y luego invierta su orden 

    public static void main(String[] args) throws Exception {
      Scanner leer = new Scanner(System.in);
      String cadena;

      System.out.println("Ingrese una cadena de caracteres: ");
      cadena = leer.nextLine();

      String invertirCadena = new StringBuilder(cadena).reverse().toString();

      System.out.println("Palabra invertida: " + invertirCadena);

      leer.close();
    }
}
