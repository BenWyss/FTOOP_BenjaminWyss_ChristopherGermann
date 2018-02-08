import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dame");

        BoardSetup bs = new BoardSetup();

        frame.setBackground(Color.WHITE);
        frame.setResizable(false);
        frame.setSize(805, 805);
        frame.add(bs.getBoard());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
