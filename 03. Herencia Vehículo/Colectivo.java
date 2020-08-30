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
    
    public void getInfo(){
        super.getInfo();
        System.out.println(">Cantidad de asientos: " + getCdadAsientos());
    }
}
