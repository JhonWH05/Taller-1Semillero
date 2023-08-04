import java.util.Scanner;

public class Punto_5 {
    // Realiza un programa que solicite 
    // al usuario dos números enteros y determine cuál es el mayor de ellos.
    public static void main(String[] args) throws Exception {
        int numero1;
        int numero2;
        int numeroMayor;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        numero1= leer.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        numero2 = leer.nextInt();

        
        if (numero1 > numero2){
           numeroMayor = numero1;
        }else{
            numeroMayor = numero2;
        }

        System.out.println("El numero mayor es: " + numeroMayor);
        leer.close();
    }
}
