package Main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    Queue q = new Queue();


    @Before
    public void resetQueue(){
        Queue q = new Queue();
    }

    @Test
    public void addingElements(){
        q.addElement(10);
        q.addElement(20);
        q.addElement(30);


        assertEquals(q.toString(),"10,20,30");
    }


    @Test
    public void removingElements(){

    }

    @Test
    public void checkIfEmpty(){

    }

}