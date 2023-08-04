import java.util.Arrays;

public class Punto_31 {
    
    // Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo, 
    // el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros de manera ascendente.
    public static void main(String[] args) throws Exception {
      int arreglo [] = { 55,66,15,20};
        System.out.println();
        System.out.println("Arreglo original: ");
        mostrarArreglo(arreglo);


        ordenarSeleccion(arreglo);
        System.out.println();
        System.out.println("Arreglo Ordenado: " + Arrays.toString(arreglo));
        System.out.println();
    }

    static void mostrarArreglo(int arreglo []){
        for(int i = 0; i < arreglo.length; i++){
           
            System.out.print(String.format("%4d", arreglo[i]));
        }
        System.out.println();
    }

    public static void ordenarSeleccion (int arreglo []){
        int n = arreglo.length;

        for(int i = 0; i < n-1; i++){
            int indiceMinimo = i;
            
            for(int j = i + 1; j < n; j++ ){
                if(arreglo[j] < arreglo[indiceMinimo]){
                    indiceMinimo = j;
                }
            }

            int auxiliar =arreglo[i];
            arreglo[i] = arreglo[indiceMinimo];
            arreglo[indiceMinimo]= auxiliar;

        }
    }
}
