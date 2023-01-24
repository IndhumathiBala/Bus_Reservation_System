package busReser;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//defining different object for busses is hectic
		//so defining object of array
		/***  Bus buses[]=new Bus[50];//inefficient  ***/
		/*ArrayList<Bus>buses = new ArrayList<Bus>();
		*ArrayList<Booking>bookings=new ArrayList<Booking>();
		
		*buses.add(new Bus(1,true,1));
		*buses.add(new Bus(2,false,50));
		*buses.add(new Bus(3,true,48));
		*/

		
		
		BusDAO busdao=new BusDAO();
		try {
			busdao.displayBusInfo();
			int userOption = 1;
			Scanner scanner=new Scanner(System.in);
			
		while(userOption==1)
		{
			System.out.println("Enter 1 to Book and 2 to Exit");
			userOption=scanner.nextInt();
			if(userOption==1)
			{
					Booking booking=new Booking();
					if(booking.isAvailable())
					{
						BookingDAO bookingdao = new BookingDAO();
						bookingdao.addBooking(booking);
						System.out.println("Booking confirmed");
					}
					else
					{
						System.out.println("Sorry... Booking failed ..Try another bus or date...");
					}
				
			}
		}
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
