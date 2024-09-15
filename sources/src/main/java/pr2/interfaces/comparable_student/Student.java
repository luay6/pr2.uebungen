package pr2.interfaces.comparable_student;

 public class Student {

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

}
