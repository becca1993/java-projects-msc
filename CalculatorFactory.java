package uk.ac.qub.UpdatedCalculator;
import java.util.Scanner;
import java.util.Random;

public class CalculatorFactory {
	/**
	 * This class is the main class for the Calculator project.
	 * Through the main method, it will invoke methods from the CalculatorMethods class, through a switch case.
	 * It will also generate random numbers.
	 * @param args
	 */

	public static void main(String[] args) {
		CalculatorMethods cm = new CalculatorMethods(); //Creating a class instance 
		Scanner user_input = new Scanner(System.in); //Creating new Scanner object
		Random randomnum = new Random(); //Creating new Random object
		int user_choice; //Setting up int for the user to choose their action
		int num1, num2, num3, memory; //Ints for different operations.
		
		System.out.println("Welcome to Calcuator. Please enter a number to choose what action you want to do");
		System.out.println("1            :        Adding two numbers");
		System.out.println("2            :        Adding three numbers");
		System.out.println("3            :        Subtracting two numbers");
		System.out.println("4            :        Subtracting three numbers");
		System.out.println("5            :        Multiply two numbers");
		System.out.println("6            :        Divide two numbers");
		System.out.println("7            :        Find a square root of a number");
		System.out.println("8            :        Place a number in memory");
		System.out.println("9            :        Add to a number in memory");
		System.out.println("10           :        Clear current number in memory");
		System.out.println("11           :        Recall current number in memory");
		System.out.println("12           :        Generate a random number");
		user_choice = user_input.nextInt(); //Scanner set up to allow user to choose action
		
		switch(user_choice){ //Start of switch case. Switch on what int the user inputs.
		case 1: //for adding two numbers
			num1 = user_input.nextInt(); //num1 becomes user input
			num2 = user_input.nextInt(); //num2 becomes user input
			System.out.println(cm.addMe(num1, num2)); //Prints out return of method
			break; //Break out of switch case
		case 2: //for adding three numbers
			num1 = user_input.nextInt(); //num1 becomes user input
			num2 = user_input.nextInt(); //num2 becomes user input
			num3 = user_input.nextInt(); //num3 becomes user input
			System.out.println(cm.addMeThree(num1, num2, num3)); //Prints out return of method
			break; //Break out of switch case
		case 3: //for subtracting two numbers
			num1 = user_input.nextInt(); //num1 becomes user input
			num2 = user_input.nextInt(); //num2 become user input
			System.out.println(cm.subtractMe(num1, num2)); //Prints out return of method
			break; //Break out of switch case
		case 4: //for subtracting three numbers
			num1 = user_input.nextInt(); //num1 becomes user input
			num2 = user_input.nextInt(); //num2 becomes user input
			num3 = user_input.nextInt(); //num3 becomes user input
			System.out.println(cm.subtractMeThree(num1, num2, num3)); //Invokes and prints out return of method
			break; //Break out of switch case
		case 5: //Multiply two numbers
			num1 = user_input.nextInt(); //num1 becomes user input
			num2 = user_input.nextInt(); //num2 becomes user input
			System.out.println(cm.multiplyMe(num1, num2)); //Invokes and print out return of method
			break; //Break out of switch case
		case 6: //Division of two numbers
			try{ //start of try-catch block - for issues relating to division by 0.
			num1 = user_input.nextInt(); //num1 becomes user input
			num2 = user_input.nextInt(); //num2 becomes user input
			if(num1!=0 || num2!=0){ //start of if-else statement - if either num1 or num2 are not zero do this
				System.out.println(cm.divideMe(num1, num2)); //Invokes and prints out return of method
				break; //break out of switch case
			}else{ //If either number is zero...
				System.out.println("Please pick a number different than 0"); //Silly user, didn't you know? Division by zero is impossible!!
				break; //break out of switch case
			}
			}catch(ArithmeticException ae){ //Catch statement - ArithmeticException will be thrown if user enters zero
				System.out.println("Division by zero not allowed!!");
				break; //break out of switch case
			}
		case 7: //Find square root
			num1 = user_input.nextInt(); //num1 becomes user input
			System.out.println(cm.findSquareRoot(num1)); //Invokes and prints out return of method
			break; //break out of switch case
		case 8: //Setting number for memory value
			num1 = user_input.nextInt(); //num1 becomes user input
			cm.setMemory(num1); //Invokes and places user input into method
			break; //break out of switch case
		case 9: //Adding number to current memory value
			num1 = user_input.nextInt(); //num1 becomes user input
			memory = user_input.nextInt(); //memory becomes user input
			cm.setMemory(memory); //setting memory var
			System.out.println(cm.addToMemory(num1, cm.getMemory())); //Invokes and prints out return of method
			break; //break out of switch case
		case 10: //Clearing memory value 
			cm.clearMemory(1); //Invokes clearMemory method
			break; //break out of switch case
		case 11: //Recalling memory value
			cm.recallMemory(); //Invokes recallMemory method
			break; //break out of switch case
		case 12: //Generate random number
			randomnum.nextInt(100); //generates a random number between 1-100
			System.out.println("Printing random number..." + randomnum); //Prints out random number
			break; //break out of switch case
		}
		user_input.close(); //closing Scanner

	}
	
	

}
