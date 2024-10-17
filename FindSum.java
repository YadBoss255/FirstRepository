import java.util.Scanner;

public class FindSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = 0;
		
		if(num1<num2) {
			if(num2 < num3) {
				sum = num1 + num3;
			}
			
			else {
				sum = num1 + num2;
			}
		}
		
		else {
			sum = num2 + num3;
		}
		
		System.out.println("Sum of largest & smallest numbers : " + sum);
	}
}
