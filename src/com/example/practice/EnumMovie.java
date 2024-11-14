package com.example.practice;


enum TicketType{
	REGULAR,
	VIP,
	STUDENT,
	SENIOR
}
class MovieTicket{
	private static final double BASE_PRICE=10.0;
	private TicketType ticketType;
	
	public MovieTicket(TicketType ticketType) {
		this.ticketType=ticketType;
	}
	public double getTicketPrice() {
		double price=BASE_PRICE;
		switch (ticketType) {
        case VIP:
            price += 5.0;  // Additional charge for VIP tickets
            break;
        case STUDENT:
            price *= 0.8;  // 20% discount for student tickets
            break;
        case SENIOR:
            price *= 0.7;  // 30% discount for senior tickets
            break;
        default:
            // Regular ticket price remains as BASE_PRICE
            break;
    }
    return price;
}

@Override
public String toString() {
    return "Ticket Type: " + ticketType + ", Price: $" + getTicketPrice();
}
	}


public class EnumMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieTicket regularTicket = new MovieTicket(TicketType.REGULAR);
        MovieTicket vipTicket = new MovieTicket(TicketType.VIP);
        MovieTicket studentTicket = new MovieTicket(TicketType.STUDENT);
        MovieTicket seniorTicket = new MovieTicket(TicketType.SENIOR);

        System.out.println(regularTicket);
        System.out.println(vipTicket);
        System.out.println(studentTicket);
        System.out.println(seniorTicket);

	}

}
