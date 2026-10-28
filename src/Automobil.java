public class Automobil extends Vozilo implements Servisabilno{

    private int brojVrata;

    public Automobil(String marka, int makimalnaBrzina, int brojVrate) {
        super(marka, makimalnaBrzina);
        this.brojVrata = brojVrate;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }



    @Override
    public void pokreni() {
        System.out.println("Automobil je pokrenut");
    }

    @Override
    public void servisiraj() {
        System.out.println("Treba zamjena guma");
    }
}
