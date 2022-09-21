package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a value for n:");
		int n = in.nextInt();
		int[] numbers = new int [n];
		int x= 0;
		
		for (int i=1; i<=n; i++) {
			numbers[i-1] = i;
		}
		
		for (int i=1; i<n; i++) {
			if (numbers [i] != 0) {
				x = numbers [i];
			
	
			
				for (int k=x-1; k<n; k=k+x) {
				
					numbers[k] = 0;
					
				
				}
			}
			
		
		}
		for (int j=1; j<n; j++) {
			if (numbers [j] != 0) {
				System.out.println(numbers [j]);
			}
		}

}
}