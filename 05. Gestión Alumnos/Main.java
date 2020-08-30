public class Main{

 public static void main(String[] args) {
        GestionAlumnos g1 = new GestionAlumnos();
        System.out.println("_________Listados de Alumnos_____________");
        System.out.println(g1.listaDeAlumnos());
        Alumnos a123 = new Alumnos(123, "Marcos", "Marcos_123");
        g1.agregarAlumno(a123);
        System.out.println(g1.listaDeAlumnos());
        
        System.out.println("Alumno buscado por ID: " + g1.buscarAlumnoPorId(12));
        System.out.println("Alumno buscado por NOMBRE: "+ g1.buscarAlumnoPorNombre("Marcos"));
        System.out.println("Alumno buscado por USERNAME: " + g1.buscarAlumnoPorUserName("Rami_10"));
        System.out.println("Borrar alumno: 8 ---->" + g1.borrarAlumno(8));
        System.out.println(g1.listaDeAlumnos());
    }
}