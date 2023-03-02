public class Part {
    private String id;
    private String producent;
    private String model;
    private int seria;

//    public Part(String id, String producent, String model, int seria) {
//        this.id = id;
//        this.producent = producent;
//        this.model = model;
//        this.seria = seria;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeria() {
        return seria;
    }

    public void setSeria(int seria) {
        this.seria = seria;
    }
}
