public class Postac {
    private String nazwa;
    private int sila;
    private int atak;
    private int obrona;
    private int energia;

    public Postac(String nazwa, int sila, int atak, int obrona, int energia) {
        this.nazwa = nazwa;
        this.sila = sila;
        this.atak = atak;
        this.obrona = obrona;
        this.energia = energia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getSila() {
        return sila;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }

    public int getAtak() {
        return atak;
    }

    public void setAtak(int atak) {
        this.atak = atak;
    }

    public int getObrona() {
        return obrona;
    }

    public void setObrona(int obrona) {
        this.obrona = obrona;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}