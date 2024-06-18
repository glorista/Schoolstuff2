package Programmieren2.HansiBeispiel;

public class MoonBoot implements NFCTicket{
    protected String owner;
    protected boolean color;
    protected String secretcode;

    public MoonBoot(String owner, boolean color) {
        this.owner = owner;
        this.color = color;
        secretcode = TicketFraudSystem.createNewTicket("moonboot");
    }

    @Override
    public String getTicketOwner() {
        return owner;
    }

    @Override
    public double getProfit() {
        if(color){ //color == true
            return 250;
        }else{
            return 200;
        }
    }

    @Override
    public int getCategory() {
        if(color){
            return 1;
        }
        return 2;
    }

    @Override
    public String getSecret() {
        return secretcode;
    }
}
