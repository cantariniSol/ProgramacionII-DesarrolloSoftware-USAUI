import java.util.Scanner;
import java.util.Locale;
public class App{


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int opcion;
        int salir = -1;
        boolean notasCargadas = false;
        int fila;
        int columna;
        RegistroNotas r = new RegistroNotas();

        System.out.print(">> Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = Integer.parseInt(sc.nextLine());
        String listaNombreAlumnos[] = new String[cantidadAlumnos];
        
        for(int n = 0; n < listaNombreAlumnos.length; n++){
            System.out.print(">> Ingrese el nombre del alumno "+ n + " ---> " );
            String nombreAlumno = sc.nextLine();
            listaNombreAlumnos[n] = nombreAlumno;
        }

        double matrizNotas [][] = new double[cantidadAlumnos][4];
        do{
            r.mostrarManu();
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("------>>> INGRESO DE NOTAS <<<------");
                    System.out.println("");
                    r.ingresarNota(sc, matrizNotas, listaNombreAlumnos);
                    notasCargadas = true;
                    break;

                case 2:
                    if(notasCargadas){
                    System.out.println("------>>> LISTA DE NOTAS <<<------");
                    System.out.println("");
                    r.notasDeEstudiantes(matrizNotas, listaNombreAlumnos);  
                }
                    else{
                    System.out.println("¡¡ NO HAY NOTAS CARGADAS !!");
                    }
                    break;

                case 3:
                    System.out.println("------>>> PROMEDIO POR ALUMNO <<<------");
                    System.out.println("");
                    if(notasCargadas){
                     do {
                            System.out.print("Eliga el numero de un alumno: ");
                            fila = sc.nextInt();

                        } 
                        while (!(fila >= 0 && fila < matrizNotas.length));{
 
                        System.out.println(">> Promedio del alumno " + fila + " es: " + r.notaFinalDeEstudiante( matrizNotas,  fila));
                        }
                    } 
                    else {
                        System.out.println("¡¡NO HAY NOTAS CARGADAS !!");
                    }
 
                break;
                case 4:
                     System.out.println("------>>> CANTIDAD DE ALUMNOS REPROBADOS <<<------");
                     System.out.println("");
                if(notasCargadas){
                    do {  
                           System.out.print("Eliga el numero de examen: ");
                           columna = sc.nextInt();

                       } 
                       while (!(columna >= 0 && columna < matrizNotas[0].length));{

                       System.out.println(">> Cantidad de alumnos repobrados en el examen " + columna + ": " + r.alumnosDesaprobados(matrizNotas, columna));
                       }
                   } 
                   else {
                       System.out.println("¡¡NO HAY NOTAS CARGADAS !!");
                   }
                   break;
                   case 5:
                   
                   System.out.println("------>>> LISTA DE ALUMNOS APROBADOS <<<------");
                   System.out.println("");
                   r.listaAlumnosAprobados(listaNombreAlumnos, matrizNotas);
                   break;

                   case 6:
                   System.out.println("------>>> LISTA DE ALUMNOS REPROBADOS <<<------");
                   System.out.println("");
                   r.listaAlumnosReprobados(listaNombreAlumnos, matrizNotas);
                   break;
                }
            }
                
                while(opcion != salir );
                {
                   System.out.println("--->>>> HASTA LUEGO <<<<---");
                   sc.close();
               }      
     }  
      
    
             
}
 
        
    
    
            
        

  
    



