package AlgoLab2;
import java.util.Scanner;
public class CMYKtoRGB {

	public static void main(String[] args) {
		double R,G,B;
		double C,M,Y,K,white;
		
		Scanner scanIn=new Scanner(System.in);
		
		System.out.print("Please enter level of cyan: ");
		C=scanIn.nextDouble();
		
		System.out.print("Please enter level of magenta: ");
		M=scanIn.nextDouble();
		
		System.out.print("Please enter level of yellow: ");
		Y=scanIn.nextDouble();
		
		System.out.print("Please enter level of black: ");
		K=scanIn.nextDouble();

		white=(1-K);
		R=Math.round(255*white*(1-C));
		G=Math.round(255*white*(1-M));
		B=Math.round(255*white*(1-Y));
		
		System.out.print("R= "+R+", G= "+G+", B= "+B);
		
		scanIn.close();
	}

}
