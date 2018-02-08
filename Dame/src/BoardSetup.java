import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoardSetup implements ActionListener{

    private JPanel board = new JPanel(new GridLayout(8,8));
    private JButton[][] boardSquares = new JButton[8][8];

    private boolean buttonIsSelected = false;

    /**
     * For Board Grid understanding:
     * (0,0) ---------- (7,0)
     *  |                  |
     *  |                  |
     *  |                  |
     *  |                  |
     *  |                  |
     *  (0,7)---------- (7,7)
     *
     **/

    public BoardSetup() {
        initializeBoard();
        initializeBoardSquares();
    }

    public JPanel getBoard() {
        return board;
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
                if (b.getBackground() == Color.BLACK) {
                    b.addActionListener(this);
                }
                boardSquares[i][j] = b;
            }
        }
        for (int ii = 0; ii < 8; ii++) {
            for (int jj = 0; jj < 8; jj++) {
                board.add(boardSquares[jj][ii]);
            }
        }
    }

    /* BUTTONCLICK EVENT */
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (e.getSource() == boardSquares[i][j]) {
                    if (buttonIsSelected) {
                        unselectButton();
                    }
                    highlightSelectedButton(boardSquares[i][j], i, j);
                    buttonIsSelected = true;
                }
            }
        }
    }

    private void highlightSelectedButton(JButton button, int i, int j) {
        if (i != 0 && j != 0 && boardSquares[i-1][j-1].getIcon() == null && boardSquares[i][j].getIcon() != redOrBlack(j, boardSquares[i][j])) {
            button.setBackground(Color.ORANGE);
            boardSquares[i-1][j-1].setBackground(Color.PINK);
        }
        if (i != 7 && j != 0 && boardSquares[i+1][j-1].getIcon() == null && boardSquares[i][j].getIcon() != redOrBlack(j, boardSquares[i][j])) {
            button.setBackground(Color.ORANGE);
            boardSquares[i+1][j-1].setBackground(Color.PINK);
        }
        if (i != 7 && j != 7 && boardSquares[i+1][j+1].getIcon() == null && boardSquares[i][j].getIcon() != redOrBlack(j, boardSquares[i][j])) {
            button.setBackground(Color.ORANGE);
            boardSquares[i+1][j+1].setBackground(Color.PINK);
        }
        if (i != 0 && j != 7 && boardSquares[i-1][j+1].getIcon() == null && boardSquares[i][j].getIcon() != redOrBlack(j, boardSquares[i][j])) {
            button.setBackground(Color.ORANGE);
            boardSquares[i-1][j+1].setBackground(Color.PINK);
        }
    }

    private void unselectButton() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                boardSquares[i][j].setBackground(blackOrWhite(i, j));
            }
        }
    }
}
