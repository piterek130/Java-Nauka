import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double suma = 0;
        double liczba = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Podaj liczbe");
            liczba = scan.nextDouble();
            if (liczba < 100){
                suma = suma + liczba;
            }
        }while(liczba < 100);

        if (suma%2 == 0){
            System.out.println("Suma wszystkich podanych liczb: "+ suma);
            System.out.println("Suma wszystkich podanych jest parzysta");
        }else{
            System.out.println("Suma wszystkich podanych liczb: "+ suma);
            System.out.println("Suma wszystkich podanych jest nieparzysta");
        }
    }
}