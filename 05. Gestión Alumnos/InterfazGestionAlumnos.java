import java.util.ArrayList;
public interface InterfazGestionAlumnos{

    ArrayList<Alumnos> listaDeAlumnos();

    void agregarAlumno(Alumnos a);

    Alumnos buscarAlumnoPorId(int id);

    Alumnos buscarAlumnoPorNombre(String nombre);

    Alumnos buscarAlumnoPorUserName(String userName);

    boolean borrarAlumno(int id);
}