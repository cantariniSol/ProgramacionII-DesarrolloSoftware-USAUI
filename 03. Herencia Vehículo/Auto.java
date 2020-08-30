public class Auto extends Vehiculo {
    
    private int cdadPuertas;

    public Auto(){
        super();
        cdadPuertas = 0;
    }
    public  Auto(String color, String marca, int modelo, int cdadPuertas){
        super(color, marca, modelo);
        this.cdadPuertas = cdadPuertas;
    }

    public int getCdadPuertas(){return cdadPuertas;};
    public void setCdadPuertas(int cdadPuertas){this.cdadPuertas = cdadPuertas;};

    public void getInfo(){
        super.getInfo();
        System.out.println(">Número de puertas: " + getCdadPuertas());
    }
}