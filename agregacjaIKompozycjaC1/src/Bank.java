public class Bank {
    public static void main(String[] args) {
        Adress adres1 = new Adress();
        adres1.miasto = "Zawiercie";
        adres1.numerDomu = "10";
        adres1.numerMieszkania = 5;
        adres1.ulica = "Reby";

        Person gosc1 = new Person();
        gosc1.firstName = "Piotr";
        gosc1.lastName = "Kot";
        gosc1.pesel = "563217946225";
        gosc1.mieszkanie = adres1;
        gosc1.zameldowanie = adres1;

        BankAccount konto1 = new BankAccount();
        konto1.balance = 6000;
        konto1.owner = gosc1;

        Credit kredyt1 = new Credit();
        kredyt1.borrower = gosc1;
        kredyt1.cashBorrowed = 4000;
        kredyt1.cashReturned = 550;
        kredyt1.interestRate = 0.15;
        kredyt1.termMonths = 24;

        Adress adres2 = new Adress();
        adres2.miasto = "Zawiercie";
        adres2.numerDomu = "10";
        adres2.numerMieszkania = 5;
        adres2.ulica = "Reby";

        Adress adres3 = new Adress();
        adres3.miasto = "Wroclaw";
        adres3.numerDomu = "2";
        adres3.numerMieszkania = 86;
        adres3.ulica = "Mikolaja Reja";

        Person gosc2 = new Person();
        gosc2.firstName = "Maciej";
        gosc2.lastName = "Kot";
        gosc2.pesel = "95185252629585";
        gosc2.mieszkanie = adres2;
        gosc2.zameldowanie = adres3;

        BankAccount konto2 = new BankAccount();
        konto2.balance = 9000;
        konto2.owner = gosc2;

        Credit kredyt2 = new Credit();
        kredyt2.borrower = gosc2;
        kredyt2.cashBorrowed = 7000;
        kredyt2.cashReturned = 1050;
        kredyt2.interestRate = 0.17;
        kredyt2.termMonths = 20;

        System.out.println("Osoba1: \n"+"mieszka w "+gosc1.mieszkanie.miasto+" zameldowany jest w "+gosc1.zameldowanie.miasto+
                " posiada konto bankowe z kwota "+konto1.balance);
        System.out.println("Osoba2: \n"+"mieszka w "+gosc2.mieszkanie.miasto+" zameldowany jest w "+gosc2.zameldowanie.miasto+
                " posiada konto bankowe z kwota "+konto2.balance);
    }
}
