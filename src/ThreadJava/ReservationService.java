package ThreadJava;
/**
 * importing classes which belongs, from java.util.package..
 */
import java.util.Scanner;
/**
 * 
 * @author creating a ReservationService and extending with thread..
 *
 */
public class ReservationService extends Thread {	
	// in here using run method	
	public void run(){
	//declared varibles
	int bookingTickets;
	String []Passenger_Names;
	//in here taking inpute from user
	Scanner sc = new Scanner(System.in);
	//so in here I'm using synchronized block
	synchronized(this){
	//window console for asking for booking of tickets
	System.out.print("Enter the No of tickets you want to book : ");
	bookingTickets = sc.nextInt();
	/**
	 * in here storing passenger name by initializing the name of array..
	 * and then runing a loop for passenger names...
	 */
	Passenger_Names=new String[bookingTickets];
	for(int i=0;i<bookingTickets;i++)
	{
	System.out.print("Name of "+(i+1)+" passenger is : ");
	Passenger_Names[i]=sc.next();
	}
	//as mentioned in question printing the report here..
	System.out.println(Thread.currentThread().getName() +bookingTickets+" Ticket(s).");
	for(int i=0;i<bookingTickets;i++)
	{
		//pring the passanger names
	System.out.println((i+1)+" Passenger is : "+Passenger_Names[i]);
	}
	}
	}
	//now exeucuting the main method...
	public static void main(String[] args) {
		/**
		 * 1.this is welcome window console..
		 * 2.and creating the thread..
		 * 3.naming the thread.. 
		 * 4.and finali starting the thread
		 * 
		 */
		//1.
	System.out.println("\n\t\tWelcome to Vishwas Travels Pvt.Lmt.\n\t\t    Now Book Your seats Online\n\n");
	//2.
	ReservationService thread  = new ReservationService();
	//3.
	thread.setName("Thread 1");
	//4.
	thread.start();
	}
	}



