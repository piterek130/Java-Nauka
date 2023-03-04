public class Fruit {
    private int waga;
    private String typOwoca;

    public Fruit(int waga, String typOwoca) {
        this.waga = waga;
        this.typOwoca = typOwoca;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public String getTypOwoca() {
        return typOwoca;
    }

    public void setTypOwoca(String typOwoca) {
        this.typOwoca = typOwoca;
    }

    String printInfo (){
        return "Waga: "+waga+", typ: "+ typOwoca;
    }
}