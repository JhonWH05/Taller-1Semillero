import java.util.Scanner;

public class Punto_1 {
    // Realiza un programa que solicite al usuario dos números enteros 
    // y muestre su suma, resta, multiplicación y división

    public static void main(String[] args) throws Exception {
        int numero1;
        int numero2;
        Scanner leer = new Scanner(System.in);
        System.out.println();

        System.out.println("Ingrese el primer numero (Entero): ");
        
         numero1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero (Entero):");
        numero2 = leer.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicación = numero1 * numero2;
        
        double division = 0;
        if (numero2 !=0){
            division = (double) numero1 / numero2;
        } else {
            System.out.println("No se puede dividir entre 0");
            leer.close();
            System.exit(0);
        }

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("multilicacion: " + multiplicación);
        System.out.println("Division: " + division);

        leer.close();
    }

}
