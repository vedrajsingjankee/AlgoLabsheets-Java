package AlgoLab2;
import java.util.Scanner;
public class menu {

	public static void main(String[] args) {
    Scanner scanIn=new Scanner(System.in);
    int num1,num2,num3;
    int choice;
    do {
    System.out.print("Enter num1: ");
    num1=scanIn.nextInt();
    System.out.print("Enter num2: ");
    num2=scanIn.nextInt();
    System.out.print("Enter num3: ");
    num3=scanIn.nextInt();
    
    System.out.println("1. Addition");
    System.out.println("2. Average");
    System.out.println("3. Remainder when num1 is raised to the power of num2 and then divided by num3");
    System.out.println("4. Exit");
    
    System.out.println("Enter choice: ");
    choice=scanIn.nextInt();
    
    if(choice==1) {
    	System.out.println("Addition= "+(num1+num2+num3));
    }
    if(choice==2) {
    	System.out.println("Average= "+((num1+num2+num3)/3));
    }
    if(choice==3) {
    	System.out.println("Answer= "+(Math.pow(num1, num2))%num3);
    }
    }while(choice!=4);
    
    scanIn.close();
	}

}
