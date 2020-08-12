public class App {
    public static void main(String[] args) throws Exception {
        
        InterfazGestionAlumnos al = new GestionAlumnos();


/*1. Listar todos los alumnos: el método no recibe ningún parámetro y devuelve un listado con todos los alumnos. */
        System.out.println(al.listadoAlumnos());

 /*2. Agregar alumnos: el método no devuelve nada y recibe un alumno a ser agregado.  */
        al.agregarAlumno(new Alumno(14, "Sergio", "#0808"));
        Alumno a2 = new Alumno(15, "Sofi", "#0303");
        Alumno a3 = new Alumno(16, "Federico", "#1313");
        al.agregarAlumno(a2);
        al.agregarAlumno(a3);
        System.out.println(al.listadoAlumnos());
    
/*3. Buscar un alumno por id: recibe por parámetro el id de alumno, buscar el alumno y si lo encuentra devuelve el objeto, si no lo encuentra devuelve null*/ 
        System.out.println("*BUSCAR ALUMNOS POR ID: 2" + al.buscarAlumnoPorId(2));

 /*4. Buscar un alumno por con nombre */
        System.out.println(al.buscarAlumnoPorNombre("Ramiro"));
        System.out.println(al.buscarAlumnoPorNombre("Pablito"));

 /*5. Buscar un alumno por username discord */
       System.out.println(al.buscarAlumnoPorUserName("#0446"));

/*6. Borrar un alumno: el método recibe un id por parámetro y borra el alumno, devuelve true si lo borró, false en caso contrario. */
      System.out.println(al.borrarAlumno(5));
      

}

}