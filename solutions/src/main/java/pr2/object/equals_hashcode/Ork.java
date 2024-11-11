package pr2.object.equals_hashcode;

/**
 * Ork.
 */
public class Ork extends Wesen {

    /**
     * Stärke der Orks.
     */
    private static final int ORK_STAERKE = 17;

    /**
     * Zeigt an, ob der Ork gut oder böse ist.
     */
    private final boolean boese;

    /**
     * Legt einen neuen Ork an.
     *
     * @param name  Name des Orks.
     * @param boese zeigt an, ob der Ork gut oder böse ist
     */
    public Ork(String name, boolean boese) {
        super(name, ORK_STAERKE);
        this.boese = boese;
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (boese ? 1231 : 1237);
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
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Ork other = (Ork) obj;
        return boese == other.boese;
    }
}
