import java.util.Scanner;

public class Punto_15 {

    // Crea un programa que pida al usuario un número entero y determine si es un número capicúa. 
    // Un número capicúa es aquel que se lee igual de izquierda a derecha que de derecha a izquierda.
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int numero;


        System.out.println("Ingrese un numero ENTERO: ");
        numero = leer.nextInt();

        if(esCapicua(numero)){
            System.out.println(numero + " Es un numero capicua");

        }else{
            System.out.println(numero + " NO ES UN NUMERO CAPICUA");

        }

        leer.close();
    }

    public static boolean esCapicua (int numero){
        int numeroReverso = 0;
        int numeroOriginal = numero;

        while(numero != 0){
            int digito = numero % 10;
            numeroReverso = numeroReverso * 10 + digito;
            numero /= 10;

        }
        return numeroOriginal == numeroReverso;
    }
}
