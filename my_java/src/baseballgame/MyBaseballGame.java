package baseballgame;

import java.util.Random;
import java.util.Scanner;

public class MyBaseballGame {

	public static void main(String[] args) {
		int com1=1, com2=1, com3=1;
		int user1=0, user2=0, user3=0;
		
		//랜덤숫자 3개 생성
		Random ra = new Random();
		com1 = ra.nextInt(9)+1;
		System.out.print(com1);
		
		Random rb = new Random();
		com2 = rb.nextInt(9)+1;
		System.out.print(com2);
		
		Random rc = new Random();			
		com3 = rc.nextInt(9)+1;
		System.out.println(com3);
		
		//중복제거
		if(com1==com2 || com1==com3 || com2==com3) {
			System.out.println("중복된 숫자 제거 실패 (게임을 다시 실행하십시오.)");
		}else {
			System.out.println("***베이스볼 게임 시작***");
			
			//사용자로부터 숫자 받기
			Scanner sc1 = new Scanner(System.in);
			System.out.println("첫번째숫자를 입력하시오");
			user1 = sc1.nextInt();
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("두번째숫자를 입력하시오");
			user2 = sc2.nextInt();
			
			Scanner sc3 = new Scanner(System.in);
			System.out.println("세번째숫자를 입력하시오");
			user3 = sc3.nextInt();
			System.out.println("사용자가 입력한 숫자는 "+user1+user2+user3+"입니다.");
			
			if(com1==user1 && com2==user2 && com3==user3) {
				System.out.println("3 Strike \n***축하합니다***");
			} else if(com1==user2 || com1==user3 || com2==user3) {
				
			}
		}
	}
}
