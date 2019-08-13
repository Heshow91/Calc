package calcv;
import java.util.Scanner;
public class CalcV2 {

	//private static Scanner scanner;

	private static Scanner scanner;

	
		
	
		static String nameOfSlave;
		static double hoursWorked;
		static double hourlyPay;
		static double grossPay;




		private static Scanner scanner2;
		
		//==Module 1
		
		public static void wellcome() 
		{
			// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Slave ratew Calculations");
		System.out.println("Dont be a fool, Read the message");
		
		}
		
		//==Module 2
		
		public static void getinput() {
			//==Contractor in my program
			
		scanner2 = new Scanner(System.in);
		
		
		System.out.println("Please enter Name of slave : ");
		
		nameOfSlave = scanner2 .nextLine();
		
		System.out.println("Please Enter the Number of Total Hours Slave Worked");
		
		hoursWorked = scanner2.nextDouble();
		
		System.out.println("Please Enter the hourly Pay Rate assigned for this Slave");
		
		hourlyPay = scanner2 .nextDouble();
		
		}
		
		//==Module 3
		
		public static void process() {
		grossPay = hourlyPay*hoursWorked;
		
		}
		
		//==Module 4
		
		public static void displayOutput() {
		System.out.println("=======================SlaveSlip============================");
		System.out.println("Slave Name                                    :"+ nameOfSlave);
		System.out.println("Number of Slave hours Worked                  :"+ hoursWorked);
		System.out.println("Hourly Payment Rate of Slave                    :"+ hourlyPay);
		System.out.println("The total Payment for Slave is                   :"+ grossPay);
		System.out.println("=========================Laterz============================");
	}
//== Special Main Module
		public static void main(String[] args) {
		wellcome();
		
		getinput();
		process();
		displayOutput();
		
		getinput();
		process();
		displayOutput();
		
		getinput();
		process();
		displayOutput();
		
		getinput();
		process();
		displayOutput();
		
		}
		
			
			
			
		}
		