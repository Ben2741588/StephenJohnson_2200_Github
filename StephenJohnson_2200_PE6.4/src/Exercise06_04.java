/*******************************************************************************
 * 
 * @author Stephen Johnson
 * Date: 12/15/2022
 *
 */
import java.util.Scanner;
public class Exercise06_04 {
	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		reverse(number);
		input.close();
	}
	
	public static void reverse(int n) {
		if( n == 0) {
			System.out.print(n);
		}
		while( n != 0) {
			int remainder = n % 10;
			System.out.print(remainder);
			n = n / 10;
		}
	}
}