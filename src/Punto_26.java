import java.util.Scanner;

public class Punto_26 {
    // Escribe un programa que pida al usuario una cadena y 
    // muestre cuántos caracteres tiene sin contar los espacios en blanco 

    public static void main(String[] args) throws Exception {
      Scanner leer = new Scanner(System.in);
      String cadena;
      String cadenaSinEspacios;
      int contadorCaracteres;

      System.out.println("Ingrese una cadena de texto: ");
      cadena = leer.nextLine();


      cadenaSinEspacios = cadena.replace(" ", "");

      contadorCaracteres = cadenaSinEspacios.length();

      System.out.println("La cadena tiene " + contadorCaracteres + "    Caracteres -  Sin contar los espacios");

      leer.close();
    }
}
