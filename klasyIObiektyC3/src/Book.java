public class Book {
    public static void main(String[] args) {
        Plant badyl1 = new Plant();
        badyl1.nazwa = "Krokus";
        badyl1.dziennaWoda = 0.3;
        double tygodniowaWod1 = (badyl1.dziennaWoda*7);
        double rocznaWoda1 = (badyl1.dziennaWoda*365);
        Plant badyl2 = new Plant();
        badyl2.nazwa = "Przebiśnieg";
        badyl2.dziennaWoda = 0.125;
        double tygodniowaWoda2 = (badyl2.dziennaWoda*7);
        double rocznaWoda2 = (badyl2.dziennaWoda*365);
        Plant badyl3 = new Plant();
        badyl3.nazwa = "Tulipan";
        badyl3.dziennaWoda = 0.328;
        double tygodniowaWoda3 = (badyl3.dziennaWoda*7);
        double rocznaWoda3 = (badyl3.dziennaWoda*365);

        System.out.println(badyl1.nazwa+"potrzebuje dziennie "+badyl1.dziennaWoda+"l, "+"tygodniowo "+tygodniowaWod1+"l, oraz rocznie "+rocznaWoda1+'l'+'.');
        System.out.println(badyl2.nazwa+"potrzebuje dziennie "+badyl2.dziennaWoda+"l, "+"tygodniowo "+tygodniowaWoda2+"l, oraz rocznie "+rocznaWoda2+'l'+'.');
        System.out.println(badyl3.nazwa+"potrzebuje dziennie "+badyl3.dziennaWoda+"l, "+"tygodniowo "+tygodniowaWoda3+"l, oraz rocznie "+rocznaWoda3+'l'+'.');
    }
}
