public class Alumno{

    private int id;
    private String nombre;
    private String userName;

    public Alumno(int id, String nombre, String userName){
        this.id = id;
        this.nombre = nombre;
        this.userName = userName;
    }

    public Alumno(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public Alumno(){
        this.id = 0;
        this.nombre = " ";
        this.userName= " ";
    }

    public int getId(){ return id;}
    public void setId(int id){ this.id = id; }
    public String getNombre(){ return nombre;}
    public void setNombre(String nombre ) { this.nombre = nombre;}
    public String getUserName(){return userName;}
    public void setUserName(String userName){ this.userName = userName;}

    public String toString(){
        return  "\n*ID: " + getId() + "\n*NOMBRE: " + getNombre() + "\n*USER NAME: " + getUserName()+"\n=============================";

    }
       
}