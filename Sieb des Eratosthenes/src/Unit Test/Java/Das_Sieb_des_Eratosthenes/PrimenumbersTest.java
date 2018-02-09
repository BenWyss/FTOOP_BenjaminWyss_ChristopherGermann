package Das_Sieb_des_Eratosthenes;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class PrimenumbersTest extends TestCase {

    private ArrayList<Integer> actualList = new ArrayList<Integer>() {{
        add(2);
        add(3);
        add(5);
        add(7);
        add(11);
        add(13);
        add(17);
        add(19);
        add(23);
        add(29);
        add(31);
        add(37);
        add(41);
        add(43);
        add(47);
        add(53);
        add(59);
        add(61);
        add(67);
        add(71);
        add(73);
        add(79);
        add(83);
        add(89);
        add(97);
    }};

    @Test
    public void testPrintPrimenumbers() throws Exception {
        assertEquals(Primenumbers.printPrimenumbers(), actualList);
    }
}