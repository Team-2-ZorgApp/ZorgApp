public class Profile {
    String naam;
    String achterNaam;
    int leeftijd;
    double gewicht;
    double lengte;

    public Profile() {

    }

    public Profile(String naam, String achternaam) {
        this.naam = naam;
        this.achterNaam = achternaam;
    }

    public Profile(String naam, String achternaam, int leeftijd, double gewicht, double lengte) {
        this.naam = naam;
        this.achterNaam = achternaam;
        this.leeftijd = leeftijd;
        this.gewicht = gewicht;
        this.lengte = lengte;

    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAchternaam() {
        return achterNaam;
    }

    public void setAchternaam(String achternaam) {
        this.achterNaam = achterNaam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void getBmi(String bmi) {

    }
}
