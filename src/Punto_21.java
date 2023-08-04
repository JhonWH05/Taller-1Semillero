import java.util.Scanner;

public class Punto_21 {
    // Pide al usuario una cadena y muestra cuántas veces aparece una letra específica en ella 

    public static void main(String[] args) throws Exception {
     Scanner leer = new Scanner (System.in);
     String cadena;

     System.out.println("Ingrese una palabra o una cadena de caracteres: ");
     cadena = leer.nextLine();

     System.out.println("Que letra desea ingresar para saber cuantas veces aparece en la palabra ingresada: ");
     char letra = leer.nextLine().charAt(0);
     
     int contador = 0;
     for(int i = 0; i< cadena.length(); i++){
        if(cadena.charAt(i) == letra){
            contador++;
        }

     }
     System.out.println("la letra " + letra + " aparece " + contador + " veces");
        leer.close();
    }
    
}
