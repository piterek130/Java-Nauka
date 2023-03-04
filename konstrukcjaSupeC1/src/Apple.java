public class Apple extends Fruit {
    String odmiana;

    public static final String TYPE = "jablkowate";

    public Apple(int waga, String typOwoca, String odmiana) {
        super(waga, TYPE);
        this.odmiana = odmiana;  
    }

    @Override
    String printInfo() {
        return super.printInfo() + ", odmiana: "+odmiana;
    }

    public static void main(String[] args) {
        Apple apple = new Apple(220, TYPE, "szampion");
        System.out.println(apple.printInfo());

    }
}

