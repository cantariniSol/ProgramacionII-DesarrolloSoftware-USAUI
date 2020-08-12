import java.util.ArrayList;
public interface InterfazGestionAlumnos {

    
     
    /*1. Listar todos los alumnos: el método no recibe ningún parámetro y devuelve un listado con todos los alumnos. */
    ArrayList<Alumno>listadoAlumnos();

    /*2. Agregar alumnos: el método no devuelve nada y recibe un alumno a ser agregado.  */
    void agregarAlumno(Alumno a);

    /*3. Buscar un alumno por id: recibe por parámetro el id de alumno, buscar el alumno y si lo encuentra devuelve el objeto, si no lo encuentra devuelve null*/
     Alumno buscarAlumnoPorId(int id);

     /*4. Buscar un alumno por con nombre */
     Alumno buscarAlumnoPorNombre(String nom);

     /*5. Buscar un alumno por username discord */
     Alumno buscarAlumnoPorUserName(String userName);

    /*6. Borrar un alumno: el método recibe un id por parámetro y borra el alumno, devuelve true si lo borró, false en caso contrario. */
    boolean borrarAlumno(int id);


  

    
}