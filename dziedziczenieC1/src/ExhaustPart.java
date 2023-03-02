public class ExhaustPart extends Part{
    private boolean isOk;

    public ExhaustPart(String id, String producent, String model, int seria, boolean isOk) {
        setId(id);
        setProducent(producent);
        setModel(model);
        setSeria(seria);
        this.isOk = isOk;
    }

    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean ok) {
        isOk = ok;
    }
    void printInfo(){
        System.out.println(getId()+' '+getModel()+' '+getProducent()+' ' + getSeria()+' '+isOk);
    }

}
