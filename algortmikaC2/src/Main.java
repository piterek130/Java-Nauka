import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int multi = 1;
        int next;
        int indeks = 0;
        Scanner scan = new Scanner(System.in);//obieranie informacji

        while (indeks < 5){
            System.out.println("Podaj liczbe");
            next = scan.nextInt();
            multi = multi * next;
            indeks++;
        }
        if (multi >= 0){
            System.out.println("Liczba nieujemna");
        }else {
            System.out.println("Liczba ujemna");
        }
    }
}