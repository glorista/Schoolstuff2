package Programmieren2.HansiBeispiel;

public class AppTicket implements NFCTicket{
    protected String owner;
    protected double price;
    protected String system;
    protected String secretcode;

    public AppTicket(String owner, double price, String system) {
        this.owner = owner;
        this.price = price;
        this.system = system;
        secretcode = TicketFraudSystem.createNewTicket("app");
    }


    @Override
    public String getTicketOwner() {
        return owner;
    }

    @Override
    public double getProfit() {
        if(system.equals("ios")){
            return price*0.7;
        }
        if(system.equals("android")){
            return price * 0.75;
        }else{
            return price * 0.8;
        }
    }

    @Override
    public int getCategory() {
        if(price>=100){
            return 1;
        }else if (price >=50 && price <100) {
            return 2;
        }
        return 3;
    }

    @Override
    public String getSecret() {
        return secretcode;
    }
}
