public class Main {
    public static void main(String[] args) {
        
        SelectionSort ordS = new SelectionSort();
        InsertionSort ordI = new InsertionSort();
        BubbleSort ordB = new BubbleSort();
        BusquedaBinaria busB = new BusquedaBinaria();
        QuickSort ordR = new QuickSort();

        int arr[] = { 12, 5, 3, 15, 11};
        int array[] = { 3, 5, 6, 8, 11, 12, 14, 15, 17, 18 };
        int arr2[] = { 11, 12, 3, 15, 5 };

        ordS.ordenamientoPorSeleccion(arr);
        ordI.ordenamientoPorInsercion(arr);
        ordB.ordenamientoPorBurbuja(arr);
        busB.busquedaBinaria(array, 6);
        ordR.ordenamientoRapido(arr2, 0, arr.length-1);
        ordR.mostrarArreglo(arr);
    }
    
}
