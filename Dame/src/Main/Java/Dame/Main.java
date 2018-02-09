package Dame;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dame");

        Dame.BoardSetup bs = new Dame.BoardSetup();

        frame.setBackground(Color.WHITE);
        frame.setResizable(false);
        frame.setSize(805, 805);
        frame.add(bs.getBoard());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
