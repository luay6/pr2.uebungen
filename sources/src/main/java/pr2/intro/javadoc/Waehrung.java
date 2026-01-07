package pr2.intro.javadoc;
/**
 * Eine Klasse, die die Währung rechnet.
 */
public class Waehrung {

    private static final long TEILER = 10000;

    private final int kurs;

    private final String name;

    private final String kuerzel;
/**
 * Konstruktur
 * @param name, Name die Währung
 * @param kuerzel, Kurzname
 * @param kurs
 */
    public Waehrung(String name, String kuerzel, double kurs) {
        this.kurs = (int) (kurs * TEILER);
        this.name = name;
        this.kuerzel = kuerzel;
    }
/**
 * Methode umrechnen, rechnet einen Betrag um
 * @param betrag
 * @param toWaehrung
 * @return
 */
    public long umrechnen(long betrag, Waehrung toWaehrung) {
        return betrag * kurs / toWaehrung.kurs;
    }

    public int getKurs() {
        return kurs;
    }

    public String getName() {
        return name;
    }

    public String getKuerzel() {
        return kuerzel;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [%s] 1 %s = %.4f %s", name, kuerzel, "$",
                kurs / (double) TEILER, kuerzel);
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + kurs;
        result = prime * result + ((kuerzel == null) ? 0 : kuerzel.hashCode());
        return result;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Waehrung other = (Waehrung) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!name.equals(other.name)) {
            return false;
        }
        if (kurs != other.kurs) {
            return false;
        }
        if (kuerzel == null) {
            return other.kuerzel == null;
        }
        else {
            return kuerzel.equals(other.kuerzel);
        }
    }
}
