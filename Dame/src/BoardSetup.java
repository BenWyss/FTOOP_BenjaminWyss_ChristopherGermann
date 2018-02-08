import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoardSetup implements ActionListener{

    private JPanel board = new JPanel(new GridLayout(8,8));
    private JButton[][] boardSquares = new JButton[8][8];
    private boolean buttonIsSelected = false;
    private int selectedRow;
    private int selectedColumn;
    private ImageIcon selectedImage;

    private ImageIcon redFigureIcon = new ImageIcon("RedFigureIcon.png");
    private ImageIcon blackFigureIcon = new ImageIcon("BlackFigureIcon.png");

    private int turn = 0;

    /**
     * For Board Grid understanding: --> It always starts top left because of GridLayout (Fills in from top to bottom)
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
                b.addActionListener(this);
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
                    if (turn%2 == 0) {
                        if (boardSquares[i][j].getBackground() == Color.BLACK && boardSquares[i][j].getIcon() == blackFigureIcon) {
                            highlightSelectedButton(boardSquares[i][j], i, j);
                            selectedRow = i;
                            selectedColumn = j;
                            selectedImage = (ImageIcon)boardSquares[i][j].getIcon(); //Upwards Cast Necessary
                        }
                    }
                    else {
                        if (boardSquares[i][j].getBackground() == Color.BLACK && boardSquares[i][j].getIcon() == redFigureIcon) {
                            highlightSelectedButton(boardSquares[i][j], i, j);
                            selectedRow = i;
                            selectedColumn = j;
                            selectedImage = (ImageIcon)boardSquares[i][j].getIcon(); //Upwards Cast Necessary
                        }
                    }


                    /*if (boardSquares[i][j].getBackground() == Color.PINK) {
                        moveFigure(i, j);
                        unselectButton();
                    }
                    if (boardSquares[i][j].getBackground() == Color.WHITE || buttonIsSelected) {
                        unselectButton();
                    }
                    if (boardSquares[i][j].getBackground() == Color.BLACK) {
                        highlightSelectedButton(boardSquares[i][j], i, j);
                        selectedRow = i;
                        selectedColumn = j;
                        selectedImage = boardSquares[i][j].getIcon();
                    }
                    buttonIsSelected = true;*/
                }
            }
        }
    }

    private void moveFigure(int i, int j) {
        boardSquares[i][j].setBackground(Color.BLACK);
        boardSquares[i][j].setIcon(selectedImage);
        boardSquares[i][j].setBorder(null);
        boardSquares[selectedRow][selectedColumn].setIcon(null);
        boardSquares[selectedRow][selectedColumn].setBorder(null);
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
