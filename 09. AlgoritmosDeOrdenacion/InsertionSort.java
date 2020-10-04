public class InsertionSort { //Se suele usar para ordenar maso de cartas.

   /*  Ejemplo:
    int arr[] = {12, 5, 3, 15, 11 }

    12  5   3   15  11 ---> Primer recorrrido (i = 0)
    i 
    12  5   3   15  11 ---> Primer recorrrido (i = 1)
        i 
    5   12  3   15  11  ---> Primer recorrrido (i = 2)
            i 
    3   5   12  15  11 ---> Primer recorrrido (i = 3)
                i 
    3   5   12  15  11 ----> Primer recorrrido (i = 4)
                    i 
    3   5   11  12  15  */
    public void mostrarArreglo(int arr[]){
        int i;
        int n = arr.length;
        for(i = 0; i < n; i++){
         System.out.print(arr[i] + " - ");
        }
        System.out.println();
    }

    public void ordenamientoPorInsercion(int arr []){
        System.out.println("----->>> INSERTION SORT <<<----- ");
         
        int n = arr.length;
         for(int i = 1; i < n; i++){ // Va recorriendo el arreglo 
             int posicion = i - 1; // posición que va ir recorriendo el arreglo --> hace de flecha
             int valor = arr[i]; // elemento que vamos comprobando (número acutal)

             while(posicion >= 0 && arr[posicion] > valor){ 
                 arr[posicion + 1] = arr[posicion]; //Insertamos el arreglo donde corresponde
                 posicion--; //comprobando con los números a la izquierda hasta llega a la posición 0.  
            }
             arr[posicion + 1] = valor; // refrescamo el número acutal
             
         }
         mostrarArreglo(arr);
         System.out.println("-------------->>><><<<---------------\n");
    }

   


}
