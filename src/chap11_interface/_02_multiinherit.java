package chap11_interface;

import chap11_interface.multiinherit.MultiflexStadium;
import chap11_interface.multiinherit.SeoulNultiflexStadium;
import chap11_interface.multiinherit.Stadium;

public class _02_multiinherit {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Stadium ms = new SeoulNultiflexStadium();

        ms.getSportsSchedule(3);
        int sportsTicket =
                ms.getSportsTicketPrice(2);
        ms.getSupportersItem(2);

//		ms.getRemainSeat();
//		int concertTicket =
//				ms.getTicketPrice(5);
//
//		ms.playSportsAndConcert();
    }
}
