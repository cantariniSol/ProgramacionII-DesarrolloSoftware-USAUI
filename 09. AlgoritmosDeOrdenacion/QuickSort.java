public class QuickSort { //Se utiliza un pivote para hacer las comparaciones.
    //Divide y vencerás.
    //Utiliza recursividad.

    /* Ejemplo:
    int arr[] = {11, 12, 3, 15, 5 }
    int p = 11
  
   
    11  12  3   15  5
    p

    5   3   11  12  15 ----> Primera Iteración.

    3   5   11  12  15 ----> Segunra Iteración.

    3   5   11  12  15 ----> Tercera Iteración.

    3   5   11  12  15 ----> Cuarta Iteración. */
    
    public void mostrarArreglo(int arr[]){
        int i;
        int n = arr.length;
        System.out.println("----->>> QUICK SORT <<<----- ");
        for(i = 0; i < n; i++){
         System.out.print(arr[i] + " - ");
        }
        System.out.println();
        System.out.println("-------------->>><><<<---------------\n");
    }

    public void ordenamientoRapido( int arr[], int desde, int hasta){
        
        if(desde < hasta) { // desde  = 0 ; hasta = 4

            int pivote = particionar(arr, desde, hasta);

            ordenamientoRapido(arr, desde, pivote - 1); //RECURSIVIDAD
            ordenamientoRapido(arr, pivote + 1, hasta); //RECURSIVIDAD.
        }
       
    }

    public int particionar(int arr[], int desde, int hasta){
        int pivote = arr[desde]; 
        //1° Ciclo) pivote = primer elemento del arreglo = 11.
        int primeroMayor = desde + 1; 
        // 1° Ciclo) primeroMayor = indice 1 (valor 12)

        for(int i = desde + 1; i <= hasta; i++){
            // 1° Ciclo) Comenzamos en el indice 1 (valor 12)
            if(arr[i] < pivote){
                // 1° Ciclo)  Si 12 < 11 ---> No, sale del if
                int aux = arr[i];
                arr[i] = arr[primeroMayor];
                arr[primeroMayor] = aux;
                primeroMayor++;
            }
        }

        int aux = arr[primeroMayor - 1]; 
        //1° Ciclo) aux = 11
        arr[primeroMayor - 1] = arr[desde]; 
        ////1° Ciclo) arr[primerMayor - 1] (valor 12) asiganmos arr[desde] 11.
        arr[desde] = aux;
        
        return primeroMayor - 1;
    }
    
 
}
