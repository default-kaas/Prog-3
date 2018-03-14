package week5ABasis;
		/*week6ABasis */
public class main {
	public static void main(String[] args) {
		TrafficTicketSystem tts = new TrafficTicketSystem();
		
		tts.addTicket("1","Te snel rijden" );
		tts.addTicket("2","Te sloom rijden");
		tts.addTicket("3","Door rood rijden");
		
		tts.showAllTickets();
		
		tts.showTicket("1");
		tts.showTicket("4");
		
		tts.payTickets("3");
		tts.showAllTickets();
	}
}
