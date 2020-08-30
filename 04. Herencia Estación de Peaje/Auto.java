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

    @Override
    public String getInfo(){
        String mensaje = super.getInfo() + "\n>Número de puertas: " + getCdadPuertas();
        return mensaje;
    }
}