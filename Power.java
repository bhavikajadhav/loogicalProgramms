package Programms;

public class Power {
	public static int powerofNumber(int x, int y) {
		int pro = 1;
		for(int i=1;i<=y;i++) {
			pro = pro * x;	
		}
		return pro;
	}
	public static void main(String[] args) {
		System.out.println(powerofNumber(3,4));
	}
	/*
	 * public static void main(String[]args) { int x = 2; int y = 4; int pro = 1;
	 * for(int i=1; i<=y; i++) { pro = pro * x; } System.out.println(pro); }
	 */

}
