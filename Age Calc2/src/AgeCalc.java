
import java.text.ParseException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AgeCalc {
	
	public static void main(String[] args) {
	}
	private static void calculateAge() {
		
		int years = 0;
		int months = 0;
		int days = 0;
		Scanner input = new Scanner(System.in);

		
	   String birthDate = JOptionPane.showInputDialog("Please enter date of birth (MM/DD/YYYY: ");
	   int birthYear = 2001;
	   int birthMonth = 10;
	   int birthDay = 10;
	   String birthdate = "October 10 2001";
	   birthdate = birthdate.substring(0);
	   long dateOfBirth = Long.parseLong(birthDate);
	   
	   String currentDate = JOptionPane.showInputDialog("Please enter the current date (MM/DD/YYYY): ");
	   int currentYear = 2015;
	   int currentMonth = 7;
	   int currentDay = 8;
	   String currentdate = "July 8 2015";
	   currentdate = currentdate.substring(0);
	   long today = Long.parseLong(currentDate);
	 
	
	//if the difference in months is negative then subtract one from years
	 if (months < 0) {
		 years--;
		 months = 12 - birthMonth + currentMonth;	 
		 }
	 //calculate the difference in days
	 if (currentDay > birthDay) {
		 days = currentDay - birthDay;
	 }else
		days = birthDay - currentDay;
		 
		System.out.println("You are " + years + " years, " + months +" months, and " + days +" days old");

	}
	
	

	}

