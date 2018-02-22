public class Main {

    public static void main(String[] args) {
        Stack s = new Stack();

        System.out.println(s.isEmpty());

        for (int i = 1; i <= 18; i++) {
            s.addElement(i);
        }

        for (int j = 0; j <= s.stack.length -1; j++) {
            System.out.println(s.stack[j]);
        }

        System.out.println("LENGTH:");
        System.out.println(s.stack.length);
        System.out.println("FINISHED \n");

        s.removeElement();

        for (int j = 0; j <= s.stack.length -1; j++) {
            System.out.println(s.stack[j]);
        }

        System.out.println("LENGTH:");
        System.out.println(s.stack.length);
        System.out.println("FINISHED \n");

        System.out.println(s.isEmpty());
    }
}
