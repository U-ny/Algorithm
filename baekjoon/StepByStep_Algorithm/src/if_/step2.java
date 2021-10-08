package if_;

import java.util.Scanner;

public class step2 {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
	
		if((100>=a)&&(a>=90)) {
			System.out.println("A");
		}else if(80<=a) {
			System.out.println('B');
		}else if(70<=a) {
			System.out.println('C');
		}else if(60<=a) {
			System.out.println('D');
		}else{
			System.out.println('F');
		}
	
	}

}

