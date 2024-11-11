package pr2.object.equals_person;

public class Person {

    private String vorname;
    private String nachname;
    private int alter;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + alter;
        result = prime * result
                + ((nachname == null) ? 0 : nachname.hashCode());
        result = prime * result
                + ((vorname == null) ? 0 : vorname.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Person other = (Person) obj;

        if (alter != other.alter) {
            return false;
        }

        if (nachname == null) {
            if (other.nachname != null) {
                return false;
            }
        }
        else if (!nachname.equals(other.nachname)) {
            return false;
        }
        if (vorname == null) {
            return other.vorname == null;
        }
        else {
            return vorname.equals(other.vorname);
        }
    }
}
