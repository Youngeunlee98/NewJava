package homework._0405.clazz;

import chap_20_lambda.clazz.Calculator;

public class Card {
    //String cardName; int validYear; 멤버변수를 생성하고
    // getter/setter 및 유효기간을 연장하는 void validEnlong을 만듭니다.

    private String cardName; //카드네임
    private int validYear; //유효기간

    public Card(String cardName, int validYear) {
        this.cardName = cardName;
        this.validYear = validYear;
    }

    public String getCardName() {
        return cardName;
    }

    public int getValidYear() {
        return validYear;
    }

    public void setValidYear(int validYear) {
        this.validYear = validYear;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    @Override
    public String toString() {
        return "Card [cardName=" + cardName + ", vaildYear=" +  validYear + "]";
    }
    public void validEnlong(int year, CardVali cardVali) {
        this.validYear += year;
        cardVali.enlong(year);
    }
}
