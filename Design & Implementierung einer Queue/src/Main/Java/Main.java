public class Main {

    public static void main(String[] args) {
        Stack s = new Stack();

        for (int i = 0; i <= 10; i++) {
            s.addElement(i);
        }

        for (int j = 0; j <= s.stack.length -1; j++) {
            System.out.println(s.stack[j]);
        }
    }
}
