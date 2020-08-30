public class Alumnos {
    public int id;
    public String nombre;
    public String userName;

    public Alumnos(){
        this.id = 0;
        this.nombre = "Sin definir";
        this.userName = "Sin definir";
    }
    public Alumnos(int id, String nombre, String userName){
        this.id = id;
        this.nombre = nombre;
        this.userName = userName;
    }

    public int getId(){return id;};
    public void set(int id){this.id = id;};
    public String getNombre(){return nombre;};
    public void setNombre(String nombre){this.nombre = nombre;};
    public String getUserName(){return userName;};
    public void setUserName(String userName){this.userName = userName;};

    public String toString(){
        String mensaje = "\n>ALUMNO ID: " + getId() + "\n>NOMBRE: " + getNombre() + "\n>USERNAME: " + getUserName();
        return mensaje;
    }
}