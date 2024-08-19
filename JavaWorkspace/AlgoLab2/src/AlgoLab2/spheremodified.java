package AlgoLab2;

import java.util.Scanner;

public class spheremodified {

	public static void main(String[] args) {
		int radius;
		double volume,area;
		final double PI=3.142; 
		Scanner scanIn=new Scanner(System.in);
		
		System.out.print("Enter radius of sphere: ");
		radius=scanIn.nextInt();
		
		while(radius<=0) {
			System.out.print("Radius cannot be negative or zero, please enter again: ");
			radius=scanIn.nextInt();
		}
		
		volume=(4/3)*PI*(Math.pow(radius, 2));
		
		area=4*PI*radius*radius;
		
		System.out.print("Volume is "+volume+", surface area is "+area);
		scanIn.close();

	}

}
