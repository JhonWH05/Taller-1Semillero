import java.util.Scanner;

public class Punto_3 {

// Crea un programa que calcule y muestre el área y el perímetro de un círculo. 
// El usuario debe proporcionar el radio del círculo.

    public static void main(String[] args) throws Exception {
       double radio;
        Scanner leer = new Scanner(System.in);

       System.out.println("Ingrese el radio del circulo: ");
       radio = leer.nextDouble();

       double area = Math.PI * Math.pow(radio, 2);
       double perimetro = 2 * Math.PI * radio;

       System.out.println("Area del circulo: " + area);
       System.out.println("Perimetro del circulo " + perimetro);

       leer.close();
    }
}
