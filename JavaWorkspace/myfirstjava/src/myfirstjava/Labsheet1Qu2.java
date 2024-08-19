package myfirstjava;

import java.util.Scanner;

public class Labsheet1Qu2 {

    public static void main(String[] args) {
       
        int num1, num2, num3;
        int hyp=0,opp=0,adj=0,sq=0;
        
        Scanner scanIn = new Scanner(System.in);
         
        	
		System.out.print("Please enter number: ");
		num1=scanIn.nextInt();
		
		System.out.print("Please enter number: ");
		num2=scanIn.nextInt();
		
		System.out.print("Please enter number: ");
		num3=scanIn.nextInt();
		
        hyp=Math.max(num1, Math.max(num2, num3));
        
        if(hyp!=num1) {
        	opp=num1;
        }
        if(hyp!=num2) {
        	adj=num2;
        }
        if(hyp!=num3) {
        	adj=num3;
        }
        sq=hyp*hyp;
        if(sq==(opp*opp)+(adj*adj)) {
        	System.out.print("The sides constitute the lengths of a right angle triangle");
        }
        else {
        	System.out.print("The sides do not constitute the lengths of a right angle triangle");
        }
		scanIn.close();

    }
}