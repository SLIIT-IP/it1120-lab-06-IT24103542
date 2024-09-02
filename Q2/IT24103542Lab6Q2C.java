import java.util.Scanner;
public class IT24103542Lab6Q2C{
	public static void main(String[] args){
	int count=0,sum=0;
	String no;
	String no_list="";
	int number;
	double avg;
	
	Scanner input = new Scanner(System.in);
	while (count<10){
		System.out.print("Enter number "+(count+1)+": ");
		no = input.next();
			if(count==0){
				no_list = no_list + no;
			}
			else{
				no_list = no_list +" "+ no;
			}
		count = count + 1;
		number = Integer.parseInt(no);
		sum = sum + number;
	}
	
	System.out.println(" ");

	System.out.println("The numbers you entered are:");
	System.out.println(no_list);

	System.out.println(" ");
	System.out.println("Sum of the numbers: "+sum);
	
	avg = sum / count;
	System.out.println("Average of the numbers: "+avg);
	}
}