package Programming2.UebungsbspVererbung.Land;

public class Bundesland extends Land{

    protected double bruttoSozialProduct;

    public Bundesland(double bruttoSozialProduct) {
        this.bruttoSozialProduct = bruttoSozialProduct;
    }

    @Override
    protected double getBruttoSozialProduct() {
        return bruttoSozialProduct;
    }


}
