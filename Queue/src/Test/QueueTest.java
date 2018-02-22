package src.Test;

import org.junit.Before;
import org.junit.Test;
import src.Main.Queue;

import static org.junit.Assert.*;

public class QueueTest {
    Queue q = new Queue();


    @Before
    public void resetQueue(){
        Queue q = new Queue();
    }

    @Test
    public void addingElements(){

        //Adding Elements
        q.addElement(10);
        q.addElement(20);
        q.addElement(30);

        //Positive Test
        assertEquals(q.toString(),"10,20,30,0,");

        //Negative Test
        assertNotEquals(q.toString(),"10,20,30,");
    }


    @Test
    public void removingElements(){

        //Adding Elements
        q.addElement(10);
        q.addElement(20);
        q.addElement(30);

        //remove one element after the other
        int pop1 = q.removeElement();

        assertEquals(q.toString(),"20,30,0,0,");
        int pop2 = q.removeElement();

        assertEquals(q.toString(),"30,0,0,0,");
        int pop3 = q.removeElement();

        assertEquals(q.toString(),"0,0,0,0,");
        int pop4 = q.removeElement();

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
        q.addElement(1212);

        //Element should not be empty
        assertNotEquals(q.isEmpty(),true);
        assertEquals(q.isEmpty(),false);

        //Remove element and check again if empty
        int a = q.removeElement();

        assertEquals(q.isEmpty(),true);

    }

}