import javax.swing.*;
import java.awt.*;

public class BoardSetup {

    private JPanel board = new JPanel(new GridLayout(8,8));
    private JButton[][] boardSquares = new JButton[8][8];

    public BoardSetup() {
        initializeBoard();
        initializeBoardSquares();
    }

    public JPanel getBoard() {
        return board;
    }

    public JButton[][] getBoardSquares() {
        return boardSquares;
    }

    private void initializeBoard() {
        board.setOpaque(true);
    }

    private Color blackOrWhite(int i, int j) {
        return (i + j) % 2 == 0 ? Color.WHITE : Color.BLACK;
    }

    private ImageIcon redOrBlack(int j, JButton button) {
        if (j < 3 && button.getBackground() == Color.BLACK) {
            return new ImageIcon("BlackFigureIcon.png");
        }
        if (j > 4 && button.getBackground() == Color.BLACK) {
            return new ImageIcon("RedFigureIcon.png");
        }
        return null;
    }

    private void initializeBoardSquares() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JButton b = new JButton();
                b.setOpaque(true);
                b.setBackground(blackOrWhite(i, j));
                b.setIcon(redOrBlack(j, b));
                b.setBorder(null);
                boardSquares[i][j] = b;
            }
        }
        for (int ii = 0; ii < 8; ii++) {
            for (int jj = 0; jj < 8; jj++) {
                board.add(boardSquares[jj][ii]);
            }
        }
    }
}
