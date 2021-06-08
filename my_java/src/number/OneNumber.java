package number;

import java.util.Random;
import java.util.Scanner;

public class OneNumber {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int userNumber = sc.nextInt();
		int randNumber = rd.nextInt(10);
			
		for(int i=0;i<2;i++) {
			//첫번째
			if(userNumber<randNumber) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if(userNumber>randNumber){
				System.out.println("더 작은 수를 입력하세요.");			
			} else if(userNumber==randNumber) {
				System.out.println("정답입니다.");
			}
			userNumber = sc.nextInt();
			
			
			 if(userNumber<randNumber) { System.out.println("더 큰 수를 입력하세요."); } else
			 if(userNumber>randNumber){ System.out.println("더 작은 수를 입력하세요."); } else
			 if(userNumber==randNumber) { System.out.println("정답입니다."); } userNumber =
			  sc.nextInt();
			  
			 if(userNumber==randNumber) { System.out.println("정답입니다."); } else {
			 System.out.println("탈락입니다."); }
			 
		}
	}

}
