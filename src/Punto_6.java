import java.util.Scanner;

public class Punto_6 {
    // Escribe un programa que pida al usuario un número y 
    // verifique si es positivo, negativo o cero.

    public static void main(String[] args) throws Exception {
        int numero;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        numero = leer.nextInt();

        if(numero > 0){
            System.out.println("EL NUMERO ES POSITIVO");
        }else if(numero < 0){
            System.out.println("el numero es NEGATIVO");
        }else{
            System.out.println("el numero es 0");
        }
        leer.close();
    }
}
