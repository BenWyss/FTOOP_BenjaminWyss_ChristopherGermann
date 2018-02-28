import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    Stack s = new Stack();


    @Before
    public void resetQueue(){
        Stack s = new Stack();
    }

    @Test
    public void addingElements(){

        //Adding Elements
        s.addElement(10);
        s.addElement(20);
        s.addElement(30);

        //Positive Test
        assertEquals(s.toString(),"10,20,30,0,");

        //Negative Test
        assertNotEquals(s.toString(),"10,20,30,");
    }


    @Test
    public void removingElements(){

        //Adding Elements
        s.addElement(10);
        s.addElement(20);
        s.addElement(30);

        //remove one element after the other
        int pop1 = s.removeElement();

        assertEquals(s.toString(),"20,30,0,0,");
        int pop2 = s.removeElement();

        assertEquals(s.toString(),"30,0,0,0,");
        int pop3 = s.removeElement();

        assertEquals(s.toString(),"0,0,0,0,");
        int pop4 = s.removeElement();

        //Check the poped values:
        assertEquals(pop1,10);
        assertEquals(pop2,20);
        assertEquals(pop3,30);

        //Get the default value, when the queue is empty
        assertEquals(pop4, 999999999);


    }

    @Test
    public void checkIfEmpty(){

        //First add element
        s.addElement(1212);

        //Element should not be empty
        assertNotEquals(s.isEmpty(),true);
        assertEquals(s.isEmpty(),false);

        //Remove element and check again if empty
        int a = s.removeElement();

        assertEquals(s.isEmpty(),true);

    }
}