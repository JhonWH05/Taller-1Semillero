import java.util.Arrays;
import java.util.Scanner;

public class Punto_27 {
    // Crea un programa que solicite al usuario una frase y 
    // luego muestre las palabras ordenadas alfabéticamente

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        String frase;

        System.out.println("Digite una frase por favor: ");
        frase = leer.nextLine();

        String[] palabras = frase.split("\\s+"); 

        Arrays.sort(palabras);

        System.out.println("");
        System.out.println("PALABRAS ORDENADAS ALFABETICAMENTE");
        System.out.println("");

        for(String palabra : palabras){
            System.out.println(palabra);
        }
        System.out.println("");
        leer.close();
    }
}
