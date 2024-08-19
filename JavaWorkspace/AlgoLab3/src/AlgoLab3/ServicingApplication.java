package AlgoLab3;
import java.util.Scanner;
public class ServicingApplication {

	public static void main(String[] args) {
		int choice;
		int count=1;
		double sum=0;
		int index=0;
		int servicingNum;
		String registrationNum;
		String ownerName;
		double charge;
		Servicing car[]=new Servicing[20];
		Scanner scanIn = new Scanner(System.in);
		do {
		System.out.println("1.Create a new servicing object");
		System.out.println("2.Enter a servicing number and will displays all information for the corresponding servicing object.");
		System.out.println("3.Display of the average charge for servicing objects in the array.");
		System.out.println("4.Exit");
		System.out.println("Enter choice: ");
		
		choice=scanIn.nextInt();
		if(choice==1) {
			car[count]=new Servicing();
			System.out.println("Enter servicing number: ");
			servicingNum=scanIn.nextInt();
			System.out.println("Enter registration number: ");
			registrationNum=scanIn.next();
			System.out.println("Enter owner name: ");
			ownerName=scanIn.next();
			System.out.println("Enter charge: ");
			charge=scanIn.nextDouble();
			car[count].setservicingNum(servicingNum);
			car[count].setregistrationNum(registrationNum);
			car[count].setownerName(ownerName);
			car[count].setcharge(charge);
			count++;
		}
		if(choice==2) {
			System.out.println("Enter servicing number: ");
			servicingNum=scanIn.nextInt();
			for(int i=1;i<=20;i++) {
				if(car[i].getservicingNum()==servicingNum) {
					index=i;
					break;
				}
			}
			car[index].getservicingNum();
			car[index].getregistrationNum();
			car[index].getownerName();
			car[index].getcharge();
		}
		if(choice==3) {
			for(int i=1;i<=count;i++) {
				sum=sum+car[i].getcharge();
			}
				System.out.println("Average charge is "+(sum/count));
		}
		
       
	
	}while(choice!=4);
     scanIn.close();
	}
}
