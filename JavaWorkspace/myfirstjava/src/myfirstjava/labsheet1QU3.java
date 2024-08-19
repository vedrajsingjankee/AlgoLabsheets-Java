package myfirstjava;
import java.util.Scanner;
public class labsheet1QU3 {

	public static void main(String[] args) {
		int num,sum=0;
		Scanner scanIn= new Scanner(System.in);
		System.out.print("Please enter a positive number: ");
		num=scanIn.nextInt();
		while(num<=0) {
			System.out.print("Invalid number, enter a positive one: ");
			num=scanIn.nextInt();
		}
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.print("Sum is "+sum);
		scanIn.close();
	}

}
