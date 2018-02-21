import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Stack
 *
 * Dies ist die Hauptklasse, welche das Interface 'Queue' importiert und deren Methoden spezifiziert.
 *
 * @author Benjamin Wyss & Christopher Germann
 * @version 1.00
 * @see Queue
 **/

public class Stack implements Queue {

    private int stackSize = 10;
    public int[] stack = new int[stackSize];
    private int nextIndex = 0;

    /**
     * Methode addElement
     *
     * DESCRIPTION
     *
     * @param element = Ein Zahlenelement, welches auf den Stack gelegt werden soll.
     * @return void
     */

    @Override
    public void addElement(int element) {
        if (nextIndex >= stackSize) {
            stackSize *= 2;
            int[] stackBackup = stack;
            stack = new int[stackSize];
            System.arraycopy(stackBackup, 0, stack, 0, stackSize/2);
        }
        stack[nextIndex] = element;
        nextIndex++;
    }

    /**
     * Methode removeElement
     *
     * DESCRIPTION
     *
     * @return void
     */

    @Override
    public void removeElement() {
        //TODO
    }

    /**
     * Methode isEmpty
     *
     * DESCRIPTION
     *
     * @return Gibt zurück, ob der Stack leer ist (true or false -> Boolean).
     */

    @Override
    public boolean isEmpty() {
        //TODO
        return true;
    }
}
