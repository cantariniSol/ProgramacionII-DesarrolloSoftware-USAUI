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
    
        public void getInfo(){
            super.getInfo();
            System.out.println(">Cantidad de Ejes:  " + getCdadEjes());
        }
    }
