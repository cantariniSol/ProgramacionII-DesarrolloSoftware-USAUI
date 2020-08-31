import java.util.ArrayList;
import java.util.Collections;

public class TestCollections{
    public static void main(String[] args) {
        Double nota1 = 5.0;
		Double nota2 = 5.0;
		Double nota3 = 10.0;
        Double nota4 = 8.5;
        
        ArrayList<Double> notas = new ArrayList<Double>();
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        notas.add(nota4);

        ArrayList<Double> notasCopia = new ArrayList<Double>(notas);
        System.out.println("Notas originales:  " + notas);
        System.out.println("Notas copias: "+ notasCopia);

        /* El método max () de la clase java.util.Collections se usa para devolver el elemento máximo de la colección dada, de acuerdo con el orden natural de sus elementos.  */
        Double notaMayor = Collections.max(notasCopia);
        /* El método min () de la clase java.util.Collections se usa para devolver el elemento mínimo de la colección dada, de acuerdo con el orden natural de sus elementos. */
        Double notaMenor = Collections.min(notasCopia);
        System.out.println("1.Nota Mayor: " + notaMayor);
        System.out.println("2.Nota Menor: " + notaMenor);

        /* El método java.util.Collections.sort () se utiliza para ordenar los elementos presentes en la lista especificada de Colección en orden ascendente.*/
        Collections.sort(notasCopia); 
        System.out.println("3.Notas SORTED: " + notasCopia);
        
        /* Invierte el orden de los elementos en una lista pasada como argumento. */
        Collections.reverse(notasCopia);
        System.out.println("4.Notas REVERSED: " + notasCopia);

       /*  Collections.suffle() : método usado para permutar aleatoriamente la lista especificada utilizando una fuente predeterminada de aleatoriedad. */
        Collections.shuffle(notasCopia);
        System.out.println("5.Notas SHUFFLED: " + notasCopia);

        /*Collections.frequency devolverá la frecuencia con que aparece la nota más alta. */
        System.out.println("6.Frecuencia nota mayor: " + Collections.frequency(notasCopia, notaMayor));
        System.out.println("7.Frecuencia nota menor: " + Collections.frequency(notasCopia, notaMenor));
    }
}