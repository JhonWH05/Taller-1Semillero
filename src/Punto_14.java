import java.util.Scanner;

// Escribe un programa que solicite al usuario un número entero positivo y verifique si es un número perfecto. 
// Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo al propio número) 
// es igual al número.

public class Punto_14 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int numero;

        System.out.println("INGRESE UN NUMERO ENTERO POSITIVO: ");
        numero = leer.nextInt();

        if(esNumeroPerfecto(numero)){
            System.out.println(numero + " Es un numero perfecto");

        }else{
            System.out.println(numero + " NO es un numero Perfecto");

        }
        leer.close();
    }
    public static boolean esNumeroPerfecto(int numero){
        if (numero <= 0){
            return false;
        }

        int sumaDivisores = 0;
        for(int i = 1; i <= numero/2; i++){
            if(numero % i == 0){
                sumaDivisores += i;
            }
        }
        return sumaDivisores == numero;
    }
}
