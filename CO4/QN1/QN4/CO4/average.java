package CO4;
import java.util.*;

public class average {
	public static void main(String args[]) {
		double sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int N = sc.nextInt();
		int [] num = new int[N];
		System.out.println("Enter the numbers : ");
		for(int i =0;i<N;i++) {
			num[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			try {
				if(num[i]>=0) {
					sum+= num[i];
				}else {
					throw new negexception("Negative number");
				}
			}catch(negexception e) {
				System.out.println(e.getMessage());;
			}
		}
		double avg = sum/N;
		System.out.println("Average : "+avg);
	}
}