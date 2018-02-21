import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack implements Queue {

    private int stackSize = 10;
    public int[] stack = new int[stackSize];
    private int nextIndex = 0;

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

    @Override
    public void removeElement() {
        //TODO
    }

    @Override
    public boolean isEmpty() {
        //TODO
        return true;
    }
}
