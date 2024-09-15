package pr2.object.clone_person;

import java.util.Date;

 public class Person {

    private final String vorname = "";
    private final String nachname = "";
    private Date geburtsdatum = new Date();

    // TODO: clone implementieren


    @Override
    public String toString() {
        return "Person{"
                + "vorname='" + vorname + '\''
                + ", nachname='" + nachname + '\''
                + ", geburtsdatum=" + geburtsdatum
                + '}';
    }
}
