import java.util.Scanner;

public class Punto_22 {
    // Escribe un programa que solicite al usuario una frase y verifique si es un palíndromo 
    // (se lee igual de izquierda a derecha que de derecha a izquierda) 

    public static void main(String[] args) throws Exception {
       Scanner leer = new Scanner(System.in);

       System.out.println("Ingresa una frase por favor: ");
       String frase = leer.nextLine();

       String fraseSinEspacios = frase.replaceAll( "\\s+", "").toLowerCase();

       boolean esPalidromo = true;

       int longitud = fraseSinEspacios.length();
       for(int i = 0; i < longitud / 2 ; i++){

        if(fraseSinEspacios.charAt(i) != fraseSinEspacios.charAt(longitud -1 - i)){
            esPalidromo = false;
            break;
        }
       }
       if(esPalidromo){
        System.out.println("La frase es un palidromo");

       }else{
        System.out.println("la frase no es palidromo");
       }
       leer.close();
    }
}
