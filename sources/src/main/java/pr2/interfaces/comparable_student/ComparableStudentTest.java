package pr2.interfaces.comparable_student;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ComparableStudentTest {

    @Test
    void testCompare() {
        final Student s1 = new Student("Andreas", "Herrmann", 12348);
        final Student s2 = new Student("Frank", "Herrmann", 22348);
        final Student s3 = new Student("Alfons", "Meier", 12345);
        final Student s4 = new Student("Alfons", "Meier", 12346);
        final Student s5 = new Student("Andreas", "Muster", 12347);

        Student[] a = { s1, s2, s3, s4, s5 };
        Student[] expected = a.clone();

        Arrays.sort(a);
        assertArrayEquals(expected, a);
    }
}
