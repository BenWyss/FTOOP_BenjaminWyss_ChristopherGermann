/**
 * The Stack class simulates a FIFO Stack. You can push as many elements on the stack as you want.
 * The Stack will resize automatically, if more space is needed. When you remove/pop the queue, you will
 * get the first value you entered. You can pop till the stack is empty. An empty stack will return the default value 999999999.
 *
 * @author Benjamin Wyss & Christopher Germann
 * @version 1.00
 * @see Stack
 **/

public class Stack implements Queue {

    //Membervariables
    private int[] queue = new int[1];
    private int position = -1;          // position = -1 means the queue is empty


    /**
     * Constructor
     */
    public Stack(){};

    /**
     * The resizeQueue function doubles the size of the actuall queue.
     */
    private void resizeQueue(){

        // create temp variable to store values
        int[] temp = new int[queue.length *2];

        //copy array values
        for(int i = 0; i < this.queue.length;i ++){
            temp[i] = this.queue[i];
        }

        //reset and remap the queue
        this.queue = null;
        this.queue = temp;
    }


    /**
     * Add an element to the queue. Also resize the queue if it is to short
     * @param number will be added to the queue
     */
    public void addElement(int number){
        if(this.position + 2 > this.queue.length)
            resizeQueue();
        this.position++;
        this.queue[this.position] = number;
    }


    /**
     * Pops the first Element in the Queue and deletes it from the Queue
     * @return gives the first value in the Queue
     */
    public int removeElement(){

        //Check if there are any more elements to remove
        if(this.position == -1){
            System.out.println("The queue is already empty");
            return 999999999;
        }

        //get the first element of the Queue
        int popValue = this.queue[0];
        int[] temp = new int[this.queue.length];

        //remap the queue
        for(int i = 0; i < this.queue.length-1;i++){
            temp[i] = this.queue[i+1];
        }

        //reassigne the queue and decrement the position
        this.queue = null;
        this.queue = temp;
        this.position--;

        return popValue;
    }

    /**
     * Checks if the Queue is empty or not. If it is empty the position is equals to -1, otherwise it would be bigger
     */
    public boolean isEmpty(){
        if(this.position == -1)
            return true;
        return false;

    }


    /**
     * To String output, helps with the Testing.
     * toString logs the elements in the queue at this moment.
     * @return
     */
    @Override
    public String toString(){
        String output = "";

        for(int i = 0; i < this.queue.length; i++){
            output+= this.queue[i];
            output+= ",";
        }
        return output;
    }
}
