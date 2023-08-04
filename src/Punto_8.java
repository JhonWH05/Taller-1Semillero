import java.util.Random;
import java.util.Scanner;

public class Punto_8 {
    // Realiza un programa que simule un juego de adivinar un número. 
    // El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo. 
    // El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar.
    public static void main(String[] args) throws Exception {
      Scanner leer = new Scanner(System.in);
      Random random = new Random();

      int numeroAleatorioAdivinar=random.nextInt(100) + 1;

      System.out.println("Bienvenido AL JUEGO ADIVINA EL NUMERO (consiste en ingresar un numero y si es igual al seleccionado por el programa ganas)");

      int numeroIntentos = 0;
      int numeroIngresado;

      do{

            System.out.println("Ingrese Un numero Entero entre 1 y 100: ");
            numeroIngresado = leer.nextInt();
            numeroIntentos++;

            if(numeroIngresado > numeroAleatorioAdivinar){
                System.out.println("El numero ingresado es mayor que el numero a adivinar");
            }else if(numeroIngresado < numeroAleatorioAdivinar){
                System.out.println("El numero ingresado es menor que el numero a adivinar ");
            } else {
                System.out.println("Felicidades ACERTASTE Realizaste " + numeroIntentos + " Intentos" );
            }

      }while (numeroIngresado != numeroAleatorioAdivinar);
      leer.close();

    }
}
