package pr2.enums.eigene;

public enum WuerfelTyp {
    D2(2), D4(4), D6(6), D8(8), D10(10), D12(12), D(20);
    int seitenAnzahl;
    private WuerfelTyp(int seitenAnzahl){
        this.seitenAnzahl = seitenAnzahl;
    }
    public double average() {
        return ((double)this.seitenAnzahl + 1)/2;
    }
}
