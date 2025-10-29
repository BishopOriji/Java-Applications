public class OperatorsPart2{
	public static void main(String[] args){
		int num1 = 15;
	    int num2 = 25;
		int num3 = 17;
	
	boolean result = (num1 > num2) && (num1 > num3);
	System.out.printf("The result is %b%n",result);
	
	//OR LOGICAL OPERATOR
	boolean result2 = (num1 > num2) || (num1 > num3);
	System.out.printf("The result is %b%n",result2);
	
	//not logical operator
	boolean result3 = !(num1 > num2) && (num1 > num3);
	System.out.printf("The result is %b%n",result3);
	
	//UNARY OPERATORS - PRE & POST INCREMENT
	int num4 = 10;
	//num4++;
	//++num4;
	
	System.out.printf("%d%n",num4);
	System.out.printf("%d%n%n",++num4);
	
	int num5 = 10;
	System.out.printf("%d%n",num5);
	System.out.printf("%d%n",num5++);
	System.out.printf("%d%n%n",num5);
	
	//-- PRE & POST DECREMENT
	
	//num4--;
	//--num4;
	
	System.out.printf("%d%n",num4);
	System.out.printf("%d%n%n",--num4);
	
	System.out.printf("%d%n",num5);
	System.out.printf("%d%n",num5--);
	System.out.printf("%d%n",num5);
	
	}
	
}