public class Main{
    public static void main(String[] args) {

        Vozilo[] vozilo = new Vozilo[4];

        vozilo[0] = new Automobil("Renault Clio",120,5);
        vozilo[1] = new Automobil("Renault Kadjar",160,5);

        vozilo[2] = new Bicikl("Trek",30,12);
        vozilo[3] = new Bicikl("Kilimandjaro",40,16);

        for (int i = 0; i < vozilo.length; i++) {

            vozilo[i].pokreni();
            vozilo[i].ispisiPodatke();
            vozilo[i].servisiraj();
        }
    }


}
