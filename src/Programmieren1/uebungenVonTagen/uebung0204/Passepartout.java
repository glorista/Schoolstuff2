package Programmieren1.uebungenVonTagen.uebung0204;

public class Passepartout {
    private BoardWeigth boardWeigth;
    private PositionCutOut positionCutOut;
    private Color color;
    private boolean angledCut;
    private double cutOutHeigth;
    private double cutOutWidth;

    public Passepartout(BoardWeigth boardWeigth, PositionCutOut positionCutOut, Color color, boolean angledCut, double cutOutHeigth, double cutOutWidth) {
        this.boardWeigth = boardWeigth;
        this.positionCutOut = positionCutOut;
        this.color = color;
        this.angledCut = angledCut;
        this.cutOutHeigth = cutOutHeigth;
        this.cutOutWidth = cutOutWidth;
    }

    public BoardWeigth getBoardWeigth() {
        return boardWeigth;
    }

    public void setBoardWeigth(BoardWeigth boardWeigth) {
        this.boardWeigth = boardWeigth;
    }

    public PositionCutOut getPositionCutOut() {
        return positionCutOut;
    }

    public void setPositionCutOut(PositionCutOut positionCutOut) {
        this.positionCutOut = positionCutOut;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isAngledCut() {
        return angledCut;
    }

    public void setAngledCut(boolean angledCut) {
        this.angledCut = angledCut;
    }

    public double getCutOutHeigth() {
        return cutOutHeigth;
    }

    public void setCutOutHeigth(double cutOutHeigth) {
        this.cutOutHeigth = cutOutHeigth;
    }

    public double getCutOutWidth() {
        return cutOutWidth;
    }

    public void setCutOutWidth(double cutOutWidth) {
        this.cutOutWidth = cutOutWidth;
    }
}
