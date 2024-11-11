package pr2.interfaces.comparable_student;

public class Student implements Comparable { 

    private final String vorname;
    private final String nachname;
    private final int matrikelNr;

    public Student(String vorname, String nachname,
                                int matrikelNr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.matrikelNr = matrikelNr;
    }

    @Override
    public String toString() {
        return String.format("%s, %s (%d)", nachname, vorname,
                matrikelNr);
    }

    @Override
    public int compareTo(Object o) {

        Student other = (Student) o;

        if (nachname.compareTo(other.nachname) == 0) {
            if (vorname.compareTo(other.vorname) == 0) {
                if (matrikelNr == other.matrikelNr) {
                    return 0;
                }
                else {
                    return (matrikelNr > other.matrikelNr) ? 1 : -1;
                }
            }

            return vorname.compareTo(other.vorname);
        }

        return nachname.compareTo(other.nachname);
    }
}
