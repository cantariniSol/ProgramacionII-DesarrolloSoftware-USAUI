/* Ejemplo:

int arr [] = {12, 5, 3, 15, 11}

12  5   3   15  11     
3   5   12  15  11 ---> Primer recorrido (n=0)
3   5   12  15  11 ---> Segundo recorrido (n=1)
3   5   11  15  12 ---> Tercero recorrido (n=2)
3   5   11  12  15 ---> Cuarto recorrido
 */

 public class SelectionSort {
   
    public void ordenamientoPorSeleccion(int arr []){
        System.out.println("----->>> SELECTION SORT <<<----- ");
        for(int n = 0; n < arr.length-1; n++){  //Primer for determina las posiciones del arreglo
            int minimo = n; // Actualiza dónde esta el número más pequeño.
            // 12 5 3 15 11
            // n = 0(12), luego n = 1 (5) y finalmente n = 2 (3)
           System.out.println("Iteración: "+ minimo);
            for(int m = n +1; m < arr.length; m++){ //Inicializa en el segundo elemento del arreglo y va comparando los valores del arrelgo para ver cuál es el menor y actualizar la posición minima.
                if(arr[m] < arr[minimo]){ //la posicón actual es menor a la posición que se encuentra en la posicón minimo. 
                    minimo = m; // cambio de la variable de minima, minimo se encuentra en la posición m.
                }
                
            } 
            //Cambio de valores
            int aux = arr[n]; //guardamos el valor que se encuentra en la posición de la izquiera 
            arr[n] = arr[minimo]; // en esa posición guardamos el minimo.
            arr[minimo] = aux; //y en donde estaba en el valor minimo guardamos el valor cambiado que se encotraba a la izquierda.
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[j] + " - ");
            }
            System.out.println();
         }
         System.out.println("-------------->>><><<<---------------\n");
    }
        
 }