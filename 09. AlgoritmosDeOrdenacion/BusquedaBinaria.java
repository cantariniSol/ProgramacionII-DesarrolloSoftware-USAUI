public class BusquedaBinaria { // Trabaja con arreglos ya ordenados.
 /*    Ejemplo:

    int array[] = {3, 5, 6, 8, 11, 12, 14, 15, 17, 18 }
    int numeroBuscado = 6

    3   5   6   8   11  12  14  15  17  18
                    i (nos paramos en el medio del arreglo) 
    Preguntamos si 11 es el número que estamos buscando, como no es, entonces 
    preguntamos si es mayor, y como no es mayor.           
    Descartamos 12 - 14-  15-  17- 18, porque son más grande al número buscado
    Luego preguntamos si es menor, Si es menor y nos movemos al 8

    3   5   6   8   11  
                i 
                8 es el numero buscado? --> NO, Es mayor? NO, es menor? Si entonces nos movemos a la izquierda.
    3   5   6   8   11      
            i es el número buscado? Si. Entonces encontramos el número buscado. */

    public void busquedaBinaria(int array[], int numeroBuscado){
        System.out.println("----->>> BUSQUEDA BINARIA <<<----- ");

        //Ingresamos el arreglo ya ordenado  --> 3, 5, 6, 8, 11, 12, 14, 15, 17, 18
        int desde = 0; 
        int hasta = array.length - 1; // 10 - 1 = 9 ---> hasta el indice 9
        int medio; // esta definido pero no asingamos ningun valor.

        while(desde <= hasta){ 
            // 1° Ciclo) 0 <= 9 --> Si  
             // 2° Ciclo) 0 <= 3 ---> Si
             // 3° Ciclo) 2 <= 3 ---> Si
            medio = (desde + hasta) /2;  
            // 1° Ciclo) 0 + 9 = 9 / 2 = indice 4 ( valor 11) 
            // 2° Ciclo) 0 + 3 = 3 / 2 = indice 1 (valor 5)
            // 3° Ciclo) 2 + 3 = 5 / 2 = indice 2 (valor 6)
            if(array[medio] == numeroBuscado){ 
                //1° Ciclo) si 11 = 6 --> No
                // 2° Ciclo) si 5 = 6 ---> No
                // 3° Ciclo) Si 6 = 6 ---> Si
                System.out.println("El número " + numeroBuscado + " estaba en la pisición " + medio );
                break;
                
            }
            else if(array[medio] < numeroBuscado){ 
                //1° Ciclo) sino 11 < 6 ---> No
                //2° Ciclo) sino 5 < 6 ---> Si ----> desde = 1 + 1 = el indice 2
                desde = medio + 1;
            }
            else {
                hasta = medio - 1; 
                //1° Ciclo) entonces 11 > 6 --> Si ----> hasta le asginamos 4 - 1 = el indice 3
            }
        }

        System.out.println("-------------->>><><<<---------------\n");
    }
}
