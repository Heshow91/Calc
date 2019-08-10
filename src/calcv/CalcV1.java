package calcv;
import java.util.Scanner;
public class CalcV1 {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nameOfSlave;
		double hoursWorked;
		double hourlyPay;
		double grossPay;
		
		
		System.out.println("Welcome to Hisham's Calculations");
		System.out.println("Dont be a fool, Read the message");
		
		
		scanner = new Scanner(System.in);
		
		
		System.out.println("Please enter Name of slave : ");
		
		nameOfSlave = scanner .nextLine();
		
		System.out.println("Please Enter the Number of Total Hours Slave Worked");
		
		hoursWorked = scanner.nextDouble();
		
		System.out.println("Please Enter the hourly Pay Rate assigned for this Slave");
		
		hourlyPay = scanner .nextDouble();
		
		grossPay = hourlyPay*hoursWorked;
		
		
		System.out.println("==================SlaveSlip============================");
		System.out.println("Slave Name                              :"+ nameOfSlave);
		System.out.println("Number of hours Worked                  :"+ hoursWorked);
		System.out.println("Hourly Payment Rate of Slave            :"+ hourlyPay);
		System.out.println("The total Payment for Slave is          :"+ grossPay);
		System.out.println("=====================Laterz============================");
	}
}
