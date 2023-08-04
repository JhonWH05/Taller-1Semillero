import java.util.Arrays;
import java.util.HashSet;

public class Punto_30 {
    
    // Eliminar duplicados: Diseña un programa que elimine los elementos duplicados de un arreglo.
    public static void main(String[] args) throws Exception {
        int arreglo [] = {15,2,5,15,13,13, 25};

        System.out.println();
        System.out.println("Arreglo Original: " );
        

        HashSet<Integer> conjunto = new HashSet<>();
        for(int elemento : arreglo){
            conjunto.add(elemento);
        }
        mostrarArreglo(arreglo);

        int sinDuplicados [] = new int[conjunto.size()];
        int indice = 0;
        for (int elemento : conjunto){
            sinDuplicados[indice] = elemento;
            indice++;

        }
        System.out.println();
        System.out.println("Arreglo sin numeros duplicados: " + Arrays.toString(sinDuplicados));
        System.out.println();
     }
     static void mostrarArreglo(int arreglo []){
        for(int i = 0; i < arreglo.length; i++){
           
            System.out.print(String.format("%4d", arreglo[i]));
        }
        System.out.println();
    }
}
