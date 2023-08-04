import java.util.Scanner;

public class Punto_4 {
    // Pide al usuario su edad y muestra un mensaje indicando 
    // si es mayor de edad o menor de edad.
    public static void main(String[] args) throws Exception {
      int edad;
      Scanner leer = new Scanner(System.in);

      System.out.println("Ingrese Su EDAD por favor: ");
      edad = leer.nextInt();
        
      if (edad >=18){
        System.out.println("Usted es mayor de edad");
      }else{
        System.out.println("Usted es menor de edad");
      }

      leer.close();
    }
}
