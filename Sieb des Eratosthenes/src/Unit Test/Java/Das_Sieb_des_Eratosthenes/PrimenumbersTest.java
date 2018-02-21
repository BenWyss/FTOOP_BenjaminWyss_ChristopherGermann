package Das_Sieb_des_Eratosthenes;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class PrimenumbersTest {

    private ArrayList<Integer> expectedList = new ArrayList<Integer>() {{
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
    private ArrayList<Integer> unexpectedList = new ArrayList<Integer>() {{
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
        add(99);
    }};

    @Test
    public void testPrintPrimenumbers() throws Exception {
        //positiver Test
        assertEquals(expectedList, Primenumbers.printPrimenumbers());

        //negativer Test
        assertNotEquals(unexpectedList,Primenumbers.printPrimenumbers());
    }
}