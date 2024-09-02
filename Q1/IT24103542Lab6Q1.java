import java.util.Scanner;
import java.lang.Math;
public class IT24103542Lab6Q1{
	public static void main(String[] args){
	Double no;
	Double square;
	Double square_root;
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number: ");
	no = sc.nextDouble();
	System.out.println("");

	square = Math.pow(no,2);
	square_root = Math.sqrt(no);
		
	System.out.println("The square of "+no+" is: "+square);
	System.out.println("The square root of "+no+" is: "+square_root);	
	
	}
}