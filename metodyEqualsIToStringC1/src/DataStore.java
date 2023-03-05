public class DataStore {
    Computer computer = new Computer();
    int maxComputer = 100;
    Computer[] computers = new Computer[maxComputer];
    int amountComputer = 0;
    void add(Computer computer){
        if(amountComputer<maxComputer){
            computers[amountComputer] = computer;
            amountComputer++;
        }else {
            System.out.println("Za duzo komputerow");
        }
    }
    void printInfo(){
        for (int i = 0; i < amountComputer; i++) {
            System.out.println(computers[i].getProducer()+' '+computers[i].getModel());
        }
    }
    int checkAvailability(Computer computer){
        if (computer == null)
            return 0;

        int count = 0;
        for (int i = 0; i < amountComputer; i++) {
            if (computer.equals(computers[i]))
                count++;
        }
        return count;
    }
}
