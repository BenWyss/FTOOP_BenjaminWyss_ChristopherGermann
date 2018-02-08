import javax.swing.*;
import java.awt.*;

public class BoardSetup {

    private JPanel board = new JPanel(new GridLayout(8,8));
    private JButton[][] boardSquares = new JButton[8][8];

    public BoardSetup() {
        initializeBoard();
        initializeSquares();
    }

    public JPanel getBoard() {
        return board;
    }

    private void initializeBoard() {
        board.setOpaque(true);
    }

    private void initializeSquares() {
        for (int i = 0; i < 8; i++) {
            if (i%2==0) {
                for (int j = 0; j < 8; j++) {
                    JButton b = new JButton();
                    b.setOpaque(true);
                    if (j%2==0) {
                        if (j <= 2) {
                            b.setIcon(new ImageIcon("RedFigureIcon.png"));
                        }
                        if (j >= 5) {
                            b.setIcon(new ImageIcon("BlackFigureIcon.png"));

                        }
                        b.setBackground(Color.BLACK);
                    }
                    else {
                        b.setBackground(Color.WHITE);
                    }
                    b.setBorder(null);
                    boardSquares[i][j] = b;
                }
            }
            else {
                for (int j = 0; j < 8; j++) {
                    JButton b = new JButton();
                    b.setOpaque(true);
                    if (j%2==0) {
                        b.setBackground(Color.WHITE);
                    }
                    else {
                        if (j <= 2) {
                            b.setIcon(new ImageIcon("RedFigureIcon.png"));
                        }
                        if (j >= 5) {
                            b.setIcon(new ImageIcon("BlackFigureIcon.png"));
                        }
                        b.setBackground(Color.BLACK);
                    }
                    b.setBorder(null);
                    boardSquares[i][j] = b;
                }
            }
        }
        for (int ii = 0; ii < 8; ii++) {
            for (int jj = 0; jj < 8; jj++) {
                board.add(boardSquares[jj][ii]);
            }
        }
    }
}
