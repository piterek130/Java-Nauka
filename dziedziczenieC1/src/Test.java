public class Test {
    public static void main(String[] args) {
        Tire tire = new Tire("tak","nie","tak",2,3,4);
        tire.printInfo();

        ExhaustPart exhaustPart = new ExhaustPart("nie","tak","nie",2,true);
        exhaustPart.printInfo();
    }
}
