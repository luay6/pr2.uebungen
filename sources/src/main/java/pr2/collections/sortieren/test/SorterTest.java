package pr2.collections.sortieren.test;

import org.junit.jupiter.api.Test;
import pr2.collections.sortieren.Sorter;
import pr2.collections.sortieren.Sorter.SortOrder;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


/**
 * Test für die Sortierung.
 */
public class SorterTest {

    private static final String[] DATA =
            {"aaron", "ALFONS", "bond", "BerND", "henry", "Hugo"};

    /**
     * Testet die Sortierung: aufsteigend.
     */
    @Test
    void testAscendingSorting() {

        String[] asc = DATA.clone();

        Sorter.sort(asc, SortOrder.ASCENDING);

        assertArrayEquals(
                new String[] {"ALFONS", "BerND", "Hugo", "aaron", "bond",
                        "henry"}, asc);
    }

    /**
     * Testet die Sortierung: Absteigend.
     */
    @Test
    void testDescendingSorting() {

        String[] desc = DATA.clone();
        Sorter.sort(desc, SortOrder.DESCENDING);

        assertArrayEquals(
                new String[] {"henry", "bond", "aaron", "Hugo", "BerND",
                        "ALFONS"}, desc);
    }

    /**
     * Testet die Sortierung: Aufsteigend, CI.
     */
    @Test
    void testAscendingCISorting() {

        String[] ascCI = DATA.clone();
        Sorter.sort(ascCI, SortOrder.ASCENDING_CASE_INSENSITIVE);

        assertArrayEquals(
                new String[] {"aaron", "ALFONS", "BerND", "bond", "henry",
                        "Hugo"}, ascCI);
    }

    /**
     * Testet die Sortierung: Absteigend, CI.
     */
    @Test
    void testDescendingCISorting() {

        String[] descCI = DATA.clone();

        Sorter.sort(descCI, SortOrder.DESCENDING_CASE_INSENSITIVE);

        assertArrayEquals(
                new String[] {"Hugo", "henry", "bond", "BerND", "ALFONS",
                        "aaron"}, descCI);
    }
}
