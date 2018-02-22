package Main;

public class Main {

    public static void main(String[] args){

        //Generate a new Queue
        Queue q = new Queue();


        //Add some elements to the Queue
        q.addElement(1);
        q.addElement(0);
        q.addElement(2);

        // check if it is empty
        System.out.println(q.isEmpty());

        // check how the content of the queue looks like
        String valueBefore = q.toString();

        // remove some elements of the queue
        int a = q.removeElement();
        int b = q.removeElement();
        // recheck if it is empty => it should not be !!
        System.out.println(q.isEmpty());

        int c = q.removeElement();
        String valueAfter = q.toString();

        int d = q.removeElement();
        System.out.println(q.isEmpty());    // now it should be empty


        // create some usefull output
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(valueBefore);
        System.out.println(valueAfter);



    }
}
