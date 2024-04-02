package uebung0204;

public class Frame {

    private double heigth;
    private double width;
    private double depth;
    private double frameWidth;
    private Material material;
    private Glass glass;
    private Color color;
    private BackBoard backBoard;
    private Passepartout passepartout;


    public Frame(double heigth, double width, double depth, double frameWidth, Material material, Glass glass, Color color, BackBoard backBoard, Passepartout passepartout) {
        this.heigth = heigth;
        this.width = width;
        this.depth = depth;
        this.frameWidth = frameWidth;
        this.material = material;
        this.glass = glass;
        this.color = color;
        this.backBoard = backBoard;
        this.passepartout = passepartout;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getFrameWidth() {
        return frameWidth;
    }

    public void setFrameWidth(double frameWidth) {
        this.frameWidth = frameWidth;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Glass getGlass() {
        return glass;
    }

    public void setGlass(Glass glass) {
        this.glass = glass;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public BackBoard getBackBoard() {
        return backBoard;
    }

    public void setBackBoard(BackBoard backBoard) {
        this.backBoard = backBoard;
    }

    public Passepartout getPassepartout() {
        return passepartout;
    }

    public void setPassepartout(Passepartout passepartout) {
        this.passepartout = passepartout;
    }

    @Override
    public String toString() {
        return "Frame:" +
                "heigth=" + heigth +
                ", width=" + width +
                ", depth=" + depth +
                ", frameWidth=" + frameWidth +
                ", material=" + material +
                ", glass=" + glass +
                ", color=" + color;
    }
}
