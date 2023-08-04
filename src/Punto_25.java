import java.util.Scanner;

public class Punto_25 {
    // Pide al usuario una frase y muestra cada palabra por separado 

    public static void main(String[] args) throws Exception {
       Scanner leer = new Scanner(System.in);
       String frase;

       System.out.println(" Ingrese una frase: ");
       frase = leer.nextLine();
       System.out.println("");

       String[] palabras = frase.split("\\s+");

       for(String palabra : palabras){
        System.out.println(palabra);
        System.out.println("");
       }
       leer.close();
    }
}
