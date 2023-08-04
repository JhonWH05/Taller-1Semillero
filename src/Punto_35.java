public class Punto_35 {
    // Tabla de multiplicar: 
    // Crea un programa que imprima las tablas de multiplicar del 1 al 10. Usa para esto una matriz

    public static void main(String[] args) throws Exception {
      int tablasMultiplicar [][] = new int[10][10];
      
       System.out.println();

      for (int i = 0; i < 10; i++){
        for(int j = 0; j < 10; j++){
            tablasMultiplicar [i][j] = (i+1) * (j + 1 );
        }
      }

      for(int i = 0 ; i < 10; i++){
       
        System.out.println("Tabla de Multiplicar del " + (i+1) + ": ");

        for(int j = 0; j < 10; j++){
            System.out.println((i+1) + " X " + (j+1) + " = " + tablasMultiplicar [i] [j]);
        }
          System.out.println();
      }
    
    }

}
