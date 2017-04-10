package uk.ac.qub.UpdatedCalculator;


/**
 * This class is for the different methods that will be invoked in the CalculatorFactory class. 
 * It will include addition, subtraction, division, multiplication, finding the square root, and adding and clearing a number from memory.
 * @author Becca
 *
 */
public class CalculatorMethods extends CalculatorFactory {
	
	private int memory;
	
	/**
	 * This method is to add two numbers together and return the result.
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int addMe(int num1,int  num2){
		System.out.println("Adding the two numbers...."); //Telling the user what is going on...
		return num1 + num2; //Return statement
	}
	
	/**
	 * This method is to add three numbers together and return the result.
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public int addMeThree(int num1, int num2, int num3){
		System.out.println("Adding the three numbers...."); //Telling the user what is going on...
		return num1 + num2 + num3; //Return statement
	}
	
	/**
	 * This method is to subtract two numbers and return the result.
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int subtractMe(int num1, int num2){
		System.out.println("Subtracting....");
		return num1-num2;
	}
	
	/**
	 * This method is to subtract three numbers and return the result.
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public int subtractMeThree(int num1, int num2, int num3){
		System.out.println("Subtracting....");
		return num1 - num2 - num3;
	}
	
	/**
	 * This method is to multiply two numbers and return the result.
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int multiplyMe(int num1, int num2){
		System.out.println("Multiplying....");
		return num1*num2;
	}
	
	
	/**
	 * This method is to divide two numbers and return the result.
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int divideMe(int num1, int num2){
		System.out.println("Dividing....");
		return num1/num2;
	}

	/**
	 * This method will get the memory var from the user input
	 * @return
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * This method will set the memory var from the user input
	 * @param memory
	 * @return 
	 */
	public int setMemory(int memory) {
		return this.memory = memory;
	}
	
	/**
	 * This method will take a number from user input and add it to the current memory value.
	 * @param memory
	 * @param num1
	 * @return
	 */
	
	public int addToMemory(int num1, int memory){
		System.out.println("Adding to current memory value...");
		return num1 + memory;
	}
	/**
	 * This method will recall the current memory value
	 * @param memory
	 * @return
	 */
	public void recallMemory(){
		System.out.println("Returning memory value..." + memory);
		
	}
	/**
	 * This method will clear the current memory value.
	 * @param memory
	 * @return
	 */
	public int clearMemory(int memory){
		System.out.println("Clearing memory...");
		this.memory = 0;
		return 0;
	}
	
	/**
	 * This method will return the square root of a number.
	 * @param num1
	 * @return
	 */
	public int findSquareRoot(int num1){
		System.out.println("Finding square root...");
		return(int) Math.sqrt(num1);
	}


	
	
	

}
