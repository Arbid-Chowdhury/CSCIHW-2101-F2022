package CSC2HW;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
	{
		Appt[] appointment = new Appt[5];
		appointment[0] = new OneTime(25, 12, 2017, "Root Canal");
		appointment[1] = new Monthly(25, 12, 2017, "Teeth Cleaning");
		appointment[2] = new Daily(25, 12, 2017, "Filling");
		appointment[3] = new OneTime(13, 12, 2017, "Crown");
		appointment[4] = new Monthly(15, 12, 2017, "Dentures");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please input the day of the appointment (1-31) ");
		int day = in.nextInt();
		System.out.println("Please input the month of the appointment (1-12) ");
		int month = in.nextInt();
		System.out.println("Please input the year of the appointment ");
		int year = in.nextInt();
		System.out.println(day+" "+month+" "+year);
		
		for (int i = 0; i < 5; i++)
		{
			if ((appointment[i].occursOn(day,month,year)) == true)
			{
				System.out.println("You have a "+appointment[i].getDesc()+" appointment on: "+day+" "+month+" "+year);
			}
		in.close();
		}

	}
}
//Implement a superclass Appointment and subclasses Onetime, Daily, and Monthly. An appointment
//has a description (for example, “see the dentist”)
//and a date. Write a method occursOn(int year,
//int month, int day) that checks whether the
//appointment occurs on that date. For example, for
//a monthly appointment, you must check whether
//the day of the month matches. Then fill an array of
//Appointment objects with a mixture of appointments.
//Have the user enter a date and print out all appointments that occur on that date.