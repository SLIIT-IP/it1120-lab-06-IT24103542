import java.util.Scanner;
import java.lang.Math;
public class IT24103542Lab6Q3{
	public static void main(String[] args){
	int no=0;
	int count=0;
	Double sum_of_squares=0.0;
	Double rms=0.0;
	
	Scanner input = new Scanner(System.in);
	
	while (no!=-99){
			System.out.print("Enter a number: ");
			no = input.nextInt();
			
			if(no<0 && no!=-99){
				System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
			}
			else if(no==-99){
				break;
			}
			else{
				sum_of_squares = sum_of_squares + Math.pow(no,2);	
				count = count + 1;
			}

	}
	rms = Math.sqrt(sum_of_squares / count);
	System.out.println("");
	System.out.println("The Root Mean Square (RMS) is: "+rms);
	}
}