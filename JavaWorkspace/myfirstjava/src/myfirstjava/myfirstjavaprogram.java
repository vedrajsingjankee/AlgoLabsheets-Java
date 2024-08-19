package myfirstjava;
import java.util.Scanner;
public class myfirstjavaprogram {

	public static void main(String[] args) {
		int num1, num2, num3, sum, prod, small, large;
		float avg;
		Scanner scanIn = new Scanner(System.in);
		
		System.out.print("Please enter 1st number: ");
		num1 = scanIn.nextInt();
		
		System.out.print("Please enter 2nd number: ");
		num2 = scanIn.nextInt();
		
		System.out.print("Please enter 3rd number: ");
		num3 = scanIn.nextInt();
		
		sum = num1+num2+num3;
		avg = sum/3;
		prod = num1*num2*num3;
		large=Math.max(num1,Math.max(num2, num3));
		small=Math.min(num1,Math.min(num2, num3));
		
		System.out.println("Sum is "+sum+", average is "+avg+", product is "+prod+", largest is "+large+" and smallest is "+small);
		scanIn.close();

	}

}
