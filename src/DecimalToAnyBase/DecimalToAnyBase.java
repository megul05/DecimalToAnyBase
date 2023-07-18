package DecimalToAnyBase;

import java.util.Scanner;

public class DecimalToAnyBase {
	
	public static String base(int number,int index)
	{
		String result="";
		while(number > 0)
		{
			result += number%index;
			number = number/index;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int index = scan.nextInt();
		String result = base(number,index);
		System.out.println(result);
		

	}

}
