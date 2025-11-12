public class HelloWorld{
	public static void main(String[] agrgs){
		int num = 50;
		String name = "Jack";
		Float deci = 9.99999F;
		boolean isFun = true;
		char symbol = '$';;
		String response = "very much";

		System.out.println("Hello World, This is my First Java Program");
		System.out.println("Learning java is fun");
		
		//using print method
		System.out.print("The print method should be used to accept input | ");
		System.out.println("Another Print Method ");
		
		//using printf method
		System.out.printf("I bought %d loaves of bread%n",num);
		System.out.printf("My name is %s%n",name);
		System.out.printf("Your balance is %c%.2f%n",symbol,deci);
		System.out.printf("Is Java Fun? %b%n",isFun);
		System.out.println("Do you enjoy learning Java?");
		System.out.printf("I enjoy learning Java %s%n",response);
		System.out.printf("%s%s",  "Welcome to ",   "Java Programming");
	}
	
}

