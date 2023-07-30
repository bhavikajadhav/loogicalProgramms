
package Programms;
import java.util.Scanner;

public class CountDigit {
	public static int digit(int n) {
		int count = 0;
		while(n>0) {
			n= n/10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		CountDigit d = new CountDigit();
		System.out.println(d.digit(n));
	}

}
