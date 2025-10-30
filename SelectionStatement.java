
	//CONTROL STRUCTURE
	//Rules that control the order in which programs are executed
	//1. Selection(decision) - Single(activated when the condition is true, when false, it skips), double, multiple 2. Repetition(loop) 3. Jump

public class SelectionStatement{
	public static void main(String[] args){
		int age = 18;
		
		//Single selection statement
		if(age >= 18){
			System.out.println("Wow, you are an adult");
			System.out.println("Being an adult is fun");
		}
		
		//Double selection statement
		int num1 = 5;
		int num2 =25;
		if(num1 > num2)
			System.out.printf("%d is greater than %d%n", num1,num2);
		else
			System.out.printf("%d is greater than %d%n", num2,num1);
		
		//REPETITION - ITERATION EFFECTING A REPEAT OF A BLOCK OF CODES
		//FOR LOOP
		//DO WHILE LOOP
		//WHILE LOOP - USED AS LONG AS THE CONDITION IS TRUE, IT;S CALLED PRE-TEST LOOP BECAUSE THE CONDITION IS CHECKED BEFORE ENTERING TE LOOP BODY
		
		//JUMP 
		//BREAK
		//CONTINUE
	}
	
	
}