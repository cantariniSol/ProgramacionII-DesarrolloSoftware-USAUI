public class Colectivo extends Vehiculo{
    private int cdadAsientos;

    public Colectivo(){
        super();
        this.cdadAsientos = 0;
    }
    public Colectivo(String color, String marca, int modelo, int cdadAsientos){
        super(color, marca, modelo);
        this.cdadAsientos = cdadAsientos;
    }

    public int getCdadAsientos(){return cdadAsientos;};
    public void setCdadAsientos(int cdadAsientos){this.cdadAsientos = cdadAsientos;};
    
    public String getInfo(){
        String mensaje = super.getInfo() + "\n>Cantidad de asientos: " + getCdadAsientos();
        return mensaje;
    }
}