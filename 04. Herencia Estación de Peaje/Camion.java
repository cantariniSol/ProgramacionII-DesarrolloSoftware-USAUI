public class Camion extends Vehiculo {
    private int cdadEjes;
    
        public Camion(){
            super();
            cdadEjes = 0;
        }
        public Camion(String color, String marca, int modelo, int cdadEjes){
            super(color, marca, modelo);
            this.cdadEjes = cdadEjes;
        }
    
        public int getCdadEjes(){return cdadEjes;};
        public void setCdadEjes(int cdadEjes){this.cdadEjes = cdadEjes;};
    
        @Override
        public String getInfo(){
            String mensaje = super.getInfo() + "\n>Número de Ejes: " + getCdadEjes();
            return mensaje;
        }
    
}