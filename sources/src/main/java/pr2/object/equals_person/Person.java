package pr2.object.equals_person;

import java.util.Objects;

public class Person {

    private String vorname = "Marc";
    private String nachname = "Siegburg";
    private int alter = 40;

    public Person(String vorname, String nachname, int alter) {
        this.alter = alter;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(alter, nachname, vorname);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return alter == other.alter && Objects.equals(nachname, other.nachname)
                && Objects.equals(vorname, other.vorname);
    }
    
}
