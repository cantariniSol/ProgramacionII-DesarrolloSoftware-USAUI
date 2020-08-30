import java.util.ArrayList;
public class GestionAlumnos implements InterfazGestionAlumnos{


    ArrayList<Alumnos> alumno;
    public GestionAlumnos(){
        alumno = new ArrayList<Alumnos>();
        alumno.add(new Alumnos(1, "Alan", "Alan_1"));
		alumno.add(new Alumnos(2, "Fabrizio", "Fabri_2"));
		alumno.add(new Alumnos(3, "Germán", "Ger_3"));
		alumno.add(new Alumnos(4, "Luciano", "Lucho_4"));
		alumno.add(new Alumnos(5, "Emiliano", "Emi_5"));
		alumno.add(new Alumnos(6, "Lautaro", "Lautaro_6"));
		alumno.add(new Alumnos(7, "Franco M.", "FrancoM_7"));
		alumno.add(new Alumnos(8, "César", "César_8"));
		alumno.add(new Alumnos(9, "Franco O.", "FrancoO_9"));
		alumno.add(new Alumnos(10, "Ramiro", "Rami_10"));
		alumno.add(new Alumnos(11, "Franciso", "Fran_11"));
		alumno.add(new Alumnos(12, "Sol", "Sol_12"));
    }

    public ArrayList<Alumnos> listaDeAlumnos(){
        return alumno;
    }

    public void agregarAlumno(Alumnos a){
        alumno.add(a);
    }


@Override
    public Alumnos buscarAlumnoPorId(int id){
       Alumnos aux = null;
       for(Alumnos a : alumno){
           if(id == a.id){
               aux = a;
               break;
           }
       }
       return aux;
    }

    public Alumnos buscarAlumnoPorNombre(String nombre){
        Alumnos aux = null;
        for(Alumnos a : alumno){
            if( a.nombre.equalsIgnoreCase(nombre)){
                aux = a;
                break;
            }
        }
        return aux;
    }

    public Alumnos buscarAlumnoPorUserName(String userName){
        Alumnos aux = null;
        for(Alumnos a : alumno){
            if(a.userName.equalsIgnoreCase(userName)){
                aux = a;
                break;
            }
        }
        return aux;
    }

    public boolean borrarAlumno(int id){
     Alumnos aux = buscarAlumnoPorId(id);
        if(aux != null){
            alumno.remove(aux);
            return true;
        }
        else{
            return false;
        }
    }
}