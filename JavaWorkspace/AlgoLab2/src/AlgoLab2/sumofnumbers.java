package AlgoLab2;
import java.util.Scanner;
public class sumofnumbers {

	static int sum(String num) {
		char x;
		int sum=0;
		int y;
		for(int i=0;i<num.length();i++) {
			x=num.charAt(i);
			 y= Integer.parseInt(String.valueOf(x));
			 sum+=y;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scanIn=new Scanner(System.in);
		String num;
		int result;
		System.out.print("Enter a number: ");
		num=scanIn.next();
		result=sum(num);
		System.out.print("Sum of all digits in the integer value is "+result);
        scanIn.close();
	}

}
