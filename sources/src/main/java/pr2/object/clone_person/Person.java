package pr2.object.clone_person;

import java.util.Date;

public class Person implements Cloneable{

    private final String vorname = "Vorname";
    private final String nachname = "Nachname";
    public Date geburtsdatum = new Date();

    protected Object clone() throws CloneNotSupportedException {
        Person kopie = (Person) super.clone();
        kopie.geburtsdatum = (Date) geburtsdatum.clone();
        return kopie;
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
