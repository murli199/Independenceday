import java.time.LocalDate;
import java.time.Month;

public class Main {
	public static void main(String[] args) {
		int independencedate= 15;
		int iyear= 1947;
		Month indMonth= Month.AUGUST;
		LocalDate currentDate= LocalDate.now();
		System.out.println("Today's Date:" +currentDate);
		int date= currentDate.getDayOfMonth();
		Month month= currentDate.getMonth();
		int y= currentDate.getYear();
		int z= y-iyear+1;
		
		if(date== independencedate && month == indMonth ) {
			System.out.println("Happy "+z+"th Independence Day");
		}
	}

}
