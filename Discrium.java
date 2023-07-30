package Programms;


public class Discrium {
	public static boolean isDiscrium(int n){
		int count = 0;
		int temp = n;
		int sum = 0;
		while(temp>0) {
			temp = temp/10;
			count++;
		}
		temp = n;
		while(temp>0) {
			int lastdigit = temp % 10;
			int pro = 1;
			for(int i =1;i<=count; i++) {
				pro = pro * lastdigit;
			}
			count--;
			sum = sum + pro;
			temp = temp/10;
		}
		if(sum == n) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(isDiscrium(175));
	}

	
}
