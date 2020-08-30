
public class Main {
    public static void main(String[] args) { 
        Auto a1  = new Auto("Blanco", "Ford", 2018);
        a1.getInfo();
        
        Auto a2 = new Auto("Azul", "Audi", 2020);
        a2.getInfo();
        a2.setColor("Negro");
        a2.setMarca("Fiat");
        a2.setModelo(2010);
        a2.getInfo();

        Auto a3 = new Auto();
        a3.getInfo();
        a3.setColor("Rojo");
        a3.setMarca("WV");
        a3.setModelo(2019);
        a3.getInfo();
  }
}