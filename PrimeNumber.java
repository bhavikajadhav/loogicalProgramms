package Programms;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean isPrimeNumber(int n) {
		int count = 0;
		for(int i=1; i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count == 2) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		boolean result= isPrimeNumber(n);
		System.out.println(result);
		
	}

}
