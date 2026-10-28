public class Bicikl extends Vozilo implements Servisabilno{

    private int brojBrzina;

    public Bicikl(String marka, int makimalnaBrzina, int brojBrzina) {
        super(marka, makimalnaBrzina);
        this.brojBrzina = brojBrzina;
    }

    public int getBrojBrzina() {
        return brojBrzina;
    }

    public void setBrojBrzina(int brojBrzina) {
        this.brojBrzina = brojBrzina;
    }


    @Override
    public void pokreni() {
        System.out.print("Bicikl je pokrenut");
    }

    @Override
    public void servisiraj() {

    }
}
