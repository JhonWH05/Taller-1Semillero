import java.util.HashMap;
import java.util.Map;

public class Punto_33 {

    // Frecuencia de elementos: 
    // Escribe un programa que cuente la frecuencia de cada elemento en un arreglo.

    public static void main(String[] args) throws Exception {

        int arreglo[] = {2,5,2,85,32,2,5,5,5,32};

        System.out.println();
        System.out.println(" Arreglo Original: ");
        mostrarArreglo(arreglo);

         System.out.println();
         System.out.println("FRECUENCIA DE ELEMENTOS");
         System.out.println();
        Map<Integer, Integer> frecuencia = contadorFrecuencia(arreglo);
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            int elemento = entry.getKey();
            int frecuenciaElementos = entry.getValue();
            
            System.out.println("El elemento " + elemento + " Aparece " + frecuenciaElementos + " veces");
        }
        System.out.println();
    }

        static void  mostrarArreglo (int arreglo[]){
            for (int i = 0; i < arreglo.length; i++) {
                System.out.print(String.format("%4d", arreglo[i]));
            }
            System.out.println();
        }

        public static Map<Integer, Integer> contadorFrecuencia(int arreglo[]){
            Map<Integer, Integer> frecuencia = new HashMap<>();

            for (int elemento : arreglo) {
                frecuencia.put(elemento,frecuencia.getOrDefault(elemento,0)+1);
            }
            return frecuencia;
        }
}
