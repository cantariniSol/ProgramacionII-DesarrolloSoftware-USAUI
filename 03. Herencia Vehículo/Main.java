public class Main{
    public static void main(String[] args) {
        Auto a1 = new Auto("Blanco", "Ford", 2001, 4);
        a1.getInfo();
        a1.setColor("Azul");
        a1.setMarca("FIAT");
        a1.setModelo(2010);
        a1.setCdadPuertas(4);
        a1.getInfo();

        Camion cn = new Camion("Gris", "WV",2019, 3600);
        cn.getInfo();
        cn.setModelo(2018);

        Colectivo co = new Colectivo("Amarillo", "Mercedez", 2014, 30);
        co.getInfo();

    }
}