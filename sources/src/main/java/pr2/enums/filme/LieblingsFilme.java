package pr2.enums.filme;

public enum LieblingsFilme {
    FILM_A("Pulb Fiction", "Someone", 7),
    FILM_B("Some title", "Some regiseur", 6),
    FILM_C("title title", "regi regi", 10); 
    String titel;
    String regisseur;
    int bewertung;
    private LieblingsFilme(String titel, String regisseur, int bewertung) {
        this.titel = titel;
        this.regisseur = regisseur;
        this.bewertung = bewertung;
    }
    
    public String toString() {
        return "Titel: " + this.titel + "\nRegisseur: " + this.regisseur 
                + "\nBewertung: " + this.bewertung;
    }
    
    public String getTitel() {
        return this.titel;
    }
}
