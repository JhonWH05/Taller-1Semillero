import java.util.Scanner;

public class Punto_11 {

    // Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón. 
    // El usuario debe ingresar las longitudes de los tres lados.

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
       double longitudLado1;
       double longitudLado2;
       double longitudLado3;

        System.out.println("Ingresa la Longitud del Lado #1: ");
        longitudLado1 = leer.nextDouble();

        System.out.println("Ingrese la longitud del lado #2: ");
        longitudLado2 = leer.nextDouble();

        System.out.println("Ingrese la longitud del lado #3: ");
        longitudLado3 = leer.nextDouble();

        double semiPerimetro;
        semiPerimetro = (longitudLado1 + longitudLado2 + longitudLado3)/2;

        double area = Math.sqrt(semiPerimetro * (semiPerimetro - longitudLado1)*(semiPerimetro - longitudLado2)*(semiPerimetro - longitudLado3));

        System.out.println("El area del perimetro es: " + area);

        leer.close();
        
    }
}
