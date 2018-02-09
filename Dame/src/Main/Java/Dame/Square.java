package Dame;

import javax.swing.*;

public class Square {

    private JButton button;

    private boolean isSelected;
    private boolean hasFigure;

    private ImageIcon figure;
    private Dame.FigureType figureType;

    public Square(JButton button, ImageIcon figure, Dame.FigureType figureType, boolean isSelected, boolean hasFigure) {
        this.button = button;
        this.isSelected = isSelected;
        this.hasFigure = hasFigure;
        if (!hasFigure) {
            this.figure = null;
            this.figureType = null;
        }
        else {
            this.figure = figure;
            this.figureType = figureType;
        }
    }

    //GETTERS & SETTERS -> Private Instancevariables
    public JButton getButton() {
        return button;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public boolean hasFigure() {
        return hasFigure;
    }

    public ImageIcon getFigure() {
        return figure;
    }

    public Dame.FigureType getFigureType() {
        return figureType;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public void setIsSelected(boolean selected) {
        isSelected = selected;
    }

    public void setHasFigure(boolean hasFigure) {
        this.hasFigure = hasFigure;
    }

    public void setFigure(ImageIcon figure) {
        this.figure = figure;
    }

    public void setFigureType(Dame.FigureType figureType) {
        this.figureType = figureType;
    }
}
