package javaprograms;


// This program illustrate Arithmatic operator
public class Example_012_if_elseif_else {

	public static void main(String[] args)// Static method
	{
		String dayName = "Monday";// ch c = 'j' sequence of characters
		int noofDays = 1;
		if (dayName.equalsIgnoreCase("Sunday")) {

			System.out.println("Today is Sunday");
		} else if (dayName.equals("Saturday")) {
			System.out.println("Today is not Saturday");
		}

		else {
			System.out.println("Today is Weekday");
		}
		if (noofDays == 7) {
			System.out.println("Today is Sunday");
		} else if (noofDays == 6) {
			System.out.println("Today is  Saturday");
		} else {
			System.out.println("Today is Weekday");
		}
	}
}
