package Domaci2112.Sportista;

public class Sportista {

    private String imeIPrezime;
    private String sport;
    private String klub;
    private int brojNaDresu;

    public Sportista(String imeIPrezime, String sport, String klub, int brojNaDresu) {
        this.imeIPrezime = imeIPrezime;
        this.sport = sport;
        this.klub = klub;
        this.brojNaDresu = brojNaDresu;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public String getSport() {
        return sport;
    }

    public String getKlub() {
        return klub;
    }

    public int getBrojNaDresu() {
        return brojNaDresu;
    }

    public void setBrojNaDresu(int brojNaDresu) {
        this.brojNaDresu = brojNaDresu;
    }

    public void changeClub(String noviClub){
        this.klub = noviClub;
    }
    public void changeNumber(int broj){
        this.brojNaDresu = broj;
    }


}
