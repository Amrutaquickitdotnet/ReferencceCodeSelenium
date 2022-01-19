package date;

import java.text.SimpleDateFormat;
import java.util.Date;

	public class DateFormat {

	public static void main(String[] args) {
		// Date Picker

		//DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 
		 //get current date time with Date()
		 Date TodayDate = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(TodayDate);
		 
		 // Print the Date
		 System.out.println(date1);
	}
}
		


	







