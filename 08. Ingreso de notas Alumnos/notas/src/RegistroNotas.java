import java.util.Scanner;
public class RegistroNotas{
   
public  void mostrarManu(){
        System.out.println();
        System.out.println("------------>>> MENÚ DE OPCIONES <<<-------------");
        System.out.println();
        System.out.println(">> 1. INGRESAR NOTAS.");
        System.out.println(">> 2. LISTA DE NOTAS DE LOS ALUMNOS.");
        System.out.println(">> 3. PROMEDIO DE UN ALUMNO.");
        System.out.println(">> 4. CANTIDAD DE ALUMNOS REPROBADOS.");
        System.out.println(">> 5. LISTA DE ALUMNOS APROBADOS.");
        System.out.println(">> 6. LISTA DE ALUMNOS NO APROBADOS.");
        System.out.println();
        System.out.println("--------------------<<<<>>>>----------------------");
}

public  void ingresarNota(Scanner sc, double[][] matrizNotas, String[] listaNombreAlumnos){
    double nota = 0;
    for(int n = 0; n < matrizNotas.length; n++){
        System.out.println(">> Alumno " + n + " ---> " + listaNombreAlumnos[n] + ": ");
        for(int m = 0; m < matrizNotas[0].length; m++){
            System.out.println("Ingrese nota " + m + ": ");
            nota = sc.nextDouble();
            if(nota >= 0 && nota <= 10){
                matrizNotas[n][m] = nota;
            }
            else{
                System.out.println("¡¡ CUIDADO !! ----> La nota ingresada está fuera de rango.");
                System.out.println("Ingrese una nota entra 0 y 10: ");
                nota = sc.nextDouble();
                matrizNotas[n][m] = nota;   
            }
            
            }
        }
        System.out.println("---------->>> ¡¡NOTAS CARGADAS CON EXITO!! <<<----------");
     }
public  void notasDeEstudiantes(double[][] matrizNotas, String[] listaNombreAlumnos ){
        System.out.println("           EXAMEN N°         0°     1°      2°     3° ");
        System.out.println("");
     for(int i=0;i<matrizNotas.length;i++){
         System.out.print(">> Alumno " + i + " ---> " + listaNombreAlumnos[i] + ":    ");
         for(int j=0;j<matrizNotas[0].length;j++){
             System.out.print(matrizNotas[i][j] + "    ");
         }
         System.out.println("");
     }   
 }

public  double notaFinalDeEstudiante(double[][] matrizNotas, int fila){
     double sumaNotas = 0;
     double promedio = 0;
         for(int m = 0; m < matrizNotas[fila].length; m++){
             sumaNotas += matrizNotas[fila][m];
         }
         promedio = Math.round(sumaNotas / 4);
         return promedio;
     }
 //
 public int alumnosDesaprobados(double[][] matrizNotas, int columna){
     int sumaAlumnos = 0;
      for(int n = 0; n < matrizNotas.length; n++){
         if(matrizNotas[n][columna] < 4){
             sumaAlumnos ++;
         } 
     }                         
     return sumaAlumnos;
 }

 public void listaAlumnosAprobados(String[] listaNombreAlumnos, double[][] matrizNotas ){
     int sumaAlumnosAprobados = 0; 
     for(int n = 0; n < matrizNotas.length; n++){
        if(notaFinalDeEstudiante(matrizNotas, n) >= 4){
            sumaAlumnosAprobados ++;
            System.out.println("El alumno " + n + " ---> " + listaNombreAlumnos[n] + "\n >> Promedio: " + notaFinalDeEstudiante(matrizNotas, n));
        } 
    }  
    System.out.println(">> Cantidad de alumnos aprobados: " + sumaAlumnosAprobados);
    
 }

 public  void listaAlumnosReprobados(String[] listaNombreAlumnos, double[][] matrizNotas ){
     int sumaAlumnosAprobados = 0; 
     for(int n = 0; n < matrizNotas.length; n++){
        if(notaFinalDeEstudiante(matrizNotas, n) < 4){
            sumaAlumnosAprobados ++;
            System.out.println("El alumno " + n + " - " + listaNombreAlumnos[n] + " ---> Promedio: " + notaFinalDeEstudiante(matrizNotas, n));
        } 
    }  
    System.out.println(">> Cantidad de alumnos desaprobados: " + sumaAlumnosAprobados);
    
 }
             
}