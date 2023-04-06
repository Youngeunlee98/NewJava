package chap_21_stream.clazz;

public class CreaitCard {
    private  String company;
    private String cardName;
    private int limitMoney;

public CreaitCard(String company, String cardName , int limitMoney){
    this.cardName = cardName;
    this.company = company;
    this.limitMoney = limitMoney;
}
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getLimitMoney() {
        return limitMoney;
    }

    public void setLimitMoney(int limitMoney) {
        this.limitMoney = limitMoney;
    }

    @Override
    public String toString() {
        return "CreditCard [company=" + company + ", cardName=" + cardName + ", limitMoney=" + limitMoney + "]";
    }

}
