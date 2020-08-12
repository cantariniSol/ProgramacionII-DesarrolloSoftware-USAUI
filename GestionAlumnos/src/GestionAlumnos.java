import java.util.ArrayList;

public class GestionAlumnos implements InterfazGestionAlumnos {

    ArrayList<Alumno>alumnos;

    public GestionAlumnos(){
        alumnos = new ArrayList<>(); //Creamos el objeto de tipo ArraysList.
        
        alumnos.add(new Alumno(1, "Alan", "#2122"));
		alumnos.add(new Alumno(2, "Fabrizio", "#4474"));
		alumnos.add(new Alumno(3, "Germán", "#7751"));
		alumnos.add(new Alumno(4, "Luciano", "luciano"));
		alumnos.add(new Alumno(5, "Emiliano", "#4568"));
		alumnos.add(new Alumno(6, "Lautaro", "#1348"));
		alumnos.add(new Alumno(7, "Franco M.", "#1652"));
		alumnos.add(new Alumno(8, "César", "#9951"));
		alumnos.add(new Alumno(9, "Franco O.", "francoo"));
		alumnos.add(new Alumno(10, "Ramiro", "#4392"));
		alumnos.add(new Alumno(11, "Franciso", "#5910"));
        alumnos.add(new Alumno(12, "Sol", "#0446"));

        Alumno a1 = new Alumno(13, "Celeste", "#0551");
        alumnos.add(a1);
    }
/*1. Listar todos los alumnos: el método no recibe ningún parámetro y devuelve un listado con todos los alumnos. */
    @Override
     public ArrayList<Alumno>listadoAlumnos(){
            return alumnos;
        }
    
        
 /*2. Agregar alumnos: el método no devuelve nada y recibe un alumno a ser agregado.  */
    @Override
    public void agregarAlumno(Alumno a){
         alumnos.add(a);
    }

/*3. Buscar un alumno por id: recibe por parámetro el id de alumno, buscar el alumno y si lo encuentra devuelve el objeto, si no lo encuentra devuelve null*/
    public Alumno buscarAlumnoPorId(int id){
        Alumno aux = null;
        for(Alumno a: alumnos){
            if(id == a.getId()){
                aux = a;
            }
        }
         return aux;
    }

    
/*4. Buscar un alumno por con nombre */
    @Override
    public Alumno buscarAlumnoPorNombre(String nom){
        for(Alumno a: alumnos){
            if(a.getNombre().equalsIgnoreCase(nom)){
                return a;
            }
        }
        return null;
    }

/*5. Buscar un alumno por username discord */
     @Override
    public Alumno buscarAlumnoPorUserName(String user){
        for(Alumno a: alumnos){
            if(a.getUserName().equalsIgnoreCase(user)){
                return a;
            }
        }
        return null;
    }

/*6. Borrar un alumno: el método recibe un id por parámetro y borra el alumno, devuelve true si lo borró, false en caso contrario. */
public boolean borrarAlumno(int id){
    Alumno aux = buscarAlumnoPorId(id);
        if(aux != null){
            alumnos.remove(aux);
            System.out.println("Se borró el alumno correctamente:");
            return true;
        }
        else{
            System.out.println("Se borró el alumno correctamente:");
            return false;
        }
    }
}
