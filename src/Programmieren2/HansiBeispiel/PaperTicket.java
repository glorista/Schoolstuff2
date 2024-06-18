package Programmieren2.HansiBeispiel;

public class PaperTicket implements NFCTicket {

    protected String owner;
    protected double price;
    protected double discount;
    protected boolean winner;
    protected String secretcode;

    public PaperTicket(String owner, double price, double discount, boolean winner) {
        this.owner = owner;
        this.price = price;
        this.discount = discount;
        this.winner = winner;
        secretcode = TicketFraudSystem.createNewTicket("paper");

    }

    @Override
    public String getTicketOwner() {
        return owner;
    }

    @Override
    public double getProfit() {
        return (price-20)-discount;
    }

    @Override
    public int getCategory() {
        int cat;
        if(price>=80){
            cat = 2;
        }else{
            cat= 3;
        }
        if(winner){
            cat= cat-1;
        }
        return cat;
    }

    @Override
    public String getSecret() {
        return secretcode;
    }

}
