public abstract class Vozilo implements Servisabilno {
    private String marka;
    private int maksimalnaBrzina;

    public Vozilo(String marka, int maksimalnaBrzina) {
        this.marka = marka;
        this.maksimalnaBrzina = maksimalnaBrzina;
    }

    public String getMarka() {
        return marka;
    }

    public int getMaksimalnaBrzina() {
        return maksimalnaBrzina;
    }

    public abstract void pokreni();

    public void ispisiPodatke(){
        System.out.println("Marka vozila : " + marka + "\nMaksimalna Brzina : " + maksimalnaBrzina);
    }

    public void servisiraj() {
    }
}
