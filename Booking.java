package busReser;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//this class is a model of database
//view is the gui that we are developing
//controller controls the model and view
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the name of passenger:");
		passengerName=scanner.next();
		System.out.println("Enter bus No:");
		busNo=scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput=scanner.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date=dateformat.parse(dateInput);
		} 
		catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public boolean isAvailable() throws SQLException
	{
		BusDAO busdao=new BusDAO();
		BookingDAO bookingdao = new BookingDAO();
		
		int capacity= busdao.getCapacity(busNo);
		int booked = bookingdao.getBookedCount(busNo,date);
		
		return booked<capacity;
	}

}
