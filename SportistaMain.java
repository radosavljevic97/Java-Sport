package Domaci2112.Sportista;

public class SportistaMain {
    public static void main(String[] args) {
        Sportista prvi = new Sportista("Lazar Radosavljevic","Fudbal", "Partizan", 5 );
        Sportista drugi = new Sportista("Dragan Radicevic", "Kosarka", "Crvena Zvezda", 17);
        Sportista treci = new Sportista("Aleksandar Mandic", "Vaterpolo", "Radnicki Nis", 4);


        prvi.changeClub("Arsenal");
        treci.changeNumber(7);

        System.out.println("Ime i prezime prvog sportiste je: " + prvi.getImeIPrezime());
        System.out.println("Sport kojim se bavi prvi sportista je: " + prvi.getSport());
        System.out.println("Klub za koji igra prvi sportista je: " + prvi.getKlub());
        System.out.println("Broj na dresu prvog sportiste je: " + prvi.getBrojNaDresu());
        System.out.println();

        System.out.println("Ime i prezime drugog sportiste je: " + drugi.getImeIPrezime());
        System.out.println("Sport kojim se bavi drugi sportista je: " + drugi.getSport());
        System.out.println("Klub za koji igra drugi sportista je: " + drugi.getKlub());
        System.out.println("Broj na dresu drugog sportiste je: " + drugi.getBrojNaDresu());
        System.out.println();

        System.out.println("Ime i prezime treceg sportiste je: " + treci.getImeIPrezime());
        System.out.println("Sport kojim se bavi treci sportista je: " + treci.getSport());
        System.out.println("Klub za koji igra treci sportista je: " + treci.getKlub());
        System.out.println("Broj na dresu treceg sportiste je: " + treci.getBrojNaDresu());
        System.out.println();



    }
}
