package AlgoLab2;
import java.util.Scanner;
public class Multiple {

	public static void main(String[] args) {
		int num1,num2;
		int rem;
		
		Scanner scanIn=new Scanner(System.in);
		System.out.print("Enter first number: ");
		num1=scanIn.nextInt();
		System.out.print("Enter second number: ");
		num2=scanIn.nextInt();
		rem=num1%num2;
		if(rem==0) {
			System.out.print("First number is a multiple of second number.");
		}
		else {
			System.out.print("First number is not a multiple of second number.");
		}
scanIn.close();
	}

}
