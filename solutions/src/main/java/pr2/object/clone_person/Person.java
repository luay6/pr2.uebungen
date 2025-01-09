package pr2.object.clone_person;

import java.util.Date;

public class Person implements Cloneable {

    private final String vorname = "";
    private final String nachname = "";
    private Date geburtsdatum = new Date();

    @Override
    public Object clone() {
        Person clone;
        try {
            clone = (Person) super.clone();
            clone.geburtsdatum = (Date) geburtsdatum.clone();
            return clone;
        }
        catch (CloneNotSupportedException e) {
            // cannot happen
            return null;
        }
    }


    @Override
    public String toString() {
        return "Person{"
                + "vorname='" + vorname + '\''
                + ", nachname='" + nachname + '\''
                + ", geburtsdatum=" + geburtsdatum
                + '}';
    }
}
