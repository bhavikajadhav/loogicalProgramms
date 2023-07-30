package Programms;

public class XylemPhleom {
	public static String isXylemPhleom(int n){
		int temp =n;
		int count1 = 0;
		int count2 = 0;
		int sum1 = 0;
		int sum2 = 0;
		//count the number of digits
		while(n > 0) {
			n = n/10;
			count1++;
		}
		//to perform sum operation
		while(temp>0) {
			int lastdigit = temp%10;
			count2++;
			if(count2 == 1 || count2 == count1) {
				sum1 = sum1 +lastdigit;
			}
			else {
				sum2 =sum2 + lastdigit;
			}
			temp =temp/10;
		}
		
		if(sum1 == sum2) {
			return "It is Xylem Number";
		}
		else {
			return "It is Pholem Number";
		}
		
	}
	public static void main(String[] args) {
		System.out.println(isXylemPhleom(1245));
		System.out.println(isXylemPhleom(1338));

		
	}

}
