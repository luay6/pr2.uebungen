package pr2.interfaces.comparable_student;

public class Student implements Comparable<Student>{

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
    public int compareTo(Student other) {
        if(this.nachname.compareTo(other.nachname) == 0) {
            if(this.vorname.compareTo(other.vorname) == 0) {
                return this.matrikelNr - other.matrikelNr;
            }
            else {
                return this.vorname.compareTo(other.vorname);
            }
        }
        return this.nachname.compareTo(other.nachname);
    }

}
