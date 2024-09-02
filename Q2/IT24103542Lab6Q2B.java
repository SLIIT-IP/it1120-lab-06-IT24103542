import java.util.Scanner;
public class IT24103542Lab6Q2B{
	public static void main(String[] args){
	int count=1;
	String no;
	String no_list="";
	
	Scanner input = new Scanner(System.in);
	while (count<=10){
		System.out.print("Enter number "+count+": ");
		no = input.next();
			if(count==1){
				no_list = no_list + no;
			}
			else{
				no_list = no_list +" "+ no;
			}
		count = count + 1;
	}
	System.out.println("The numbers you entered are:");
	System.out.println(no_list);
	}
}