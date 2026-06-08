//Multiplication Table 
import java.util.Scanner;
public class Multiplication {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			int result= n*i;
			System.out.print(n+ "X" +i+"=" +result+"\n") ;
		}
		
	}
}
 