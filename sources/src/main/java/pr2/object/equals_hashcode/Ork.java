package pr2.object.equals_hashcode;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(boese);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ork other = (Ork) obj;
        return boese == other.boese;
    }
    


}
