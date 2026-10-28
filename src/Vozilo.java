public abstract class Vozilo {
    private String marka;
    private int makimalnaBrzina;

    public Vozilo(String marka, int makimalnaBrzina) {
        this.marka = marka;
        this.makimalnaBrzina = makimalnaBrzina;
    }

    public String getMarka() {
        return marka;
    }

    public int getMakimalnaBrzina() {
        return makimalnaBrzina;
    }

    public abstract void pokreni();

    public String ispisiPodatke(){
        return "Marka vozila : " + marka + "\nMaksimalna Brzina : " + makimalnaBrzina;
    }
}
