public class Tire extends Part{
    private double rozmiar;
    private double szerokosc;

    public Tire(String id, String producent, String model, int seria, double rozmiar, double szerokosc) {
        setId(id);
        setProducent(producent);
        setModel(model);
        setSeria(seria);
        this.rozmiar = rozmiar;
        this.szerokosc = szerokosc;
    }

    public double getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(double rozmiar) {
        this.rozmiar = rozmiar;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }
    void printInfo(){
        System.out.println(getId()+' '+getModel()+' '+getProducent()+' ' + getSeria()+' '+rozmiar+' '+szerokosc);
    }
}