package number;

import java.util.Scanner;
public class table{
	public static void main(String[] args){
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		multi obj1 = new multi();
		obj1.start();
		prime obj2 = new prime(number);
		obj2.start();
	}
}