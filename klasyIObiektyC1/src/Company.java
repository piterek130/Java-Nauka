public class Company {
    public static void main(String[] args) {
        Employee gosc1 = new Employee();
        gosc1.imie = "Piotr";
        gosc1.nazwisko = "Kot";
        gosc1.rokUrodzenia = 2001;
        gosc1.stazPracy = 3;
        String infog1 = "Dane 1 pracownika to:\n"+ "Imie: "+gosc1.imie+", "+"Nazwisko: "+gosc1.nazwisko+", "+"Rok urodzenia: "
                +gosc1.rokUrodzenia+", "+"Staz pracy: "+gosc1.stazPracy+".";

        Employee gosc2 = new Employee();
        gosc2.imie = "Szymon";
        gosc2.nazwisko = "Czech";
        gosc2.rokUrodzenia = 2001;
        gosc2.stazPracy = 1;
        String infog2 = "Dane 2 pracownika to:\n"+ "Imie: "+gosc2.imie+", "+"Nazwisko: "+gosc2.nazwisko+", "+"Rok urodzenia: "
                +gosc2.rokUrodzenia+", "+"Staz pracy: "+gosc2.stazPracy+".";

        Employee gosc3 = new Employee();
        gosc3.imie = "Maciej";
        gosc3.nazwisko = "Kot";
        gosc3.rokUrodzenia = 2005;
        gosc3.stazPracy = 2;
        String infog3 = "Dane 3 pracownika to:\n"+ "Imie: "+gosc3.imie+", "+"Nazwisko: "+gosc3.nazwisko+", "+"Rok urodzenia: "
                +gosc3.rokUrodzenia+", "+"Staz pracy: "+gosc3.stazPracy+".";

        System.out.println(infog1);
        System.out.println(infog2);
        System.out.println(infog3);
    }
}
