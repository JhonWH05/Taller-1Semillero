import java.util.Scanner;

public class Punto_34 {
    // Rotación de elementos: Implementa un programa que rote los elementos de 
    // un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones.
    
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);

        int arreglo [] = {2, 4, 6, 2};

        int rotacion;
        do {
            System.out.print("Ingrese 1 para rotar a la derecha o 2 para rotar a la izquierda: ");
            rotacion = leer.nextInt();
        } while (rotacion != 1 && rotacion != 2);

        
        int rotaciones;
        do {
            System.out.print("Ingrese la cantidad de rotaciones (mayor a 0): ");
            rotaciones = leer.nextInt();
        } while (rotaciones <= 0);

        
        System.out.println("\nArreglo original:");
        mostrarArreglo(arreglo);

        
        if (rotacion == 1) {
            rotarDerecha(arreglo, rotaciones);
            System.out.println("\nVector rotado a la derecha:");
        } else if (rotacion == 2) {
            rotarIzquierda(arreglo, rotaciones);
            System.out.println("\nVector rotado a la izquierda:");
        }

       
        mostrarArreglo(arreglo);

        leer.close();
    }

    static void mostrarArreglo(int arreglo []) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(String.format("%4d", arreglo[i]));
        }
        System.out.println();
    }

    static void rotarDerecha(int arreglo [], int repeticiones) {
        int n = arreglo.length;
        int auxiliar [] = new int[n];
        for (int i = 0; i < n; i++) {
            auxiliar[(i + repeticiones) % n] = arreglo[i];
        }
        System.arraycopy(auxiliar, 0, arreglo, 0, n);
    }

    static void rotarIzquierda(int arreglo [], int repeticiones) {
        int n = arreglo.length;
        int auxiliar [] = new int[n];
        for (int i = 0; i < n; i++) {
            auxiliar[i] = arreglo[(i + n - repeticiones) % n];
        }
        System.arraycopy(auxiliar, 0, arreglo, 0, n);
        
    }
}

