public class BubbleSort {
    /* Ejemplo:
    int arr[] = {12, 5, 3, 15, 11}

    12  5   3   15  11
    5   3   12  11  15 ---> Primer recorrido (n = 0)
    3   5   11  12  15 ----> Segundo recorrido( n = 1) */
    public void mostrarArreglo(int arr[]){
        int i;
        int n = arr.length;
        for(i = 0; i < n; i++){
         System.out.print(arr[i] + " - ");
        }
        System.out.println();
    }

    public void ordenamientoPorBurbuja(int arr[]){
        System.out.println("----->>> BUBBLE SORT <<<----- ");
        int n = arr.length;

        for(int i = 0; i  < n - 1;i++ ){
            for(int j = 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int aux = arr[j];
                    arr[j] = arr[ j+1];
                    arr[j+1] = aux; 
                }   
            }
        }
        mostrarArreglo(arr); 
        System.out.println("-------------->>><><<<---------------\n");
    }
}
