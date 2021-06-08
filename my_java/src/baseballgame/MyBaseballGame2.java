package baseballgame;

import java.util.Random;
import java.util.Scanner;

public class MyBaseballGame2{

	public static void main(String[] args) {
		int user[] = new int[3]; //유저숫자
		int com[] = new int[3]; //컴퓨터생성숫자
		int strikecnt = 0; //스트라이크 카운트
		int ballcnt = 0; //볼 카운트
		int outcnt = 0; //아웃카운트
		
		//랜덤한 숫자 세개 생성
		Random rd = new Random();//랜덤한 숫자 생성을 위해 랜덤 클래스 사용
		com[0] = rd.nextInt(9)+1;//첫번째숫자
		com[1] = rd.nextInt(9)+1;//두번째숫자
		com[2] = rd.nextInt(9)+1;//세번째숫자

		while(com[0]==com[1]) {
			com[1] = rd.nextInt(9)+1; //com[0]과 com[1]이 같을 경우 com[1] 재생성
		}
		while(com[2]==com[0] || com[2]==com[1]) {
			com[2] = rd.nextInt(9)+1;//com[0], com[1]이 com[2]와 같을 경우 com[2] 재생성
		}
		System.out.println("(컴퓨터가 생성한 숫자 : "+com[0]+com[1]+com[2]+")");
		
		
		System.out.println("********베이스볼 게임 시작********\n기회는 총 3번 (3out) 입니다."
						   + "\n*****************************");
		
		
				
		for(outcnt=1;outcnt<4;outcnt++) {//아웃카운트 3번을 위한 반복문
			strikecnt = 0; // 스트라이크와 볼을 아웃카운트때마다 초기화
			ballcnt = 0;
			
			//사용자가 입력한 숫자 출력 및 확인
			Scanner sc = new Scanner(System.in);//사용자의 입력을 위한 스캐너 클래스 사용
			System.out.print("첫번째 숫자를 입력하세요 : ");
			user[0] = sc.nextInt();
			System.out.print("두번째 숫자를 입력하세요 : ");
			user[1] = sc.nextInt();
			System.out.print("세번째 숫자를 입력하세요 : ");
			user[2] = sc.nextInt();
			System.out.println(" ");//콘솔창 공백 처리
			System.out.println("사용자가 입력한 숫자는 ["+user[0]+user[1]+user[2]+"]입니다.");
			
			
			//볼카운트 계산
			for (int i=0; i<3; i++) {//유저숫자
				for (int j=0; j<3; j++) {//컴퓨터숫자
					if (com[j]==user[i]) {//컴퓨터와 유저의 숫자 볼카운트 계산
						if (i==j)
						strikecnt++;
					else
						ballcnt++;
					}
				}
			}
			
			
			if (strikecnt==3) {//스트라이크가 3번일경우
				System.out.println("축하합니다. 홈런입니다.");
		break;
			}else if(strikecnt==0 && ballcnt==0) {
				System.out.println("중복되는 숫자가 없습니다. 처음부터 다시시도하세요.");
				outcnt = 0;
		continue;
			}else {
				System.out.println(strikecnt + "strike\n" + ballcnt + "ball\n" + outcnt + "out");
				System.out.println("*****************************");
			}
			if (outcnt==3) {//아웃카운트가 3번이면 게임오버
				System.out.println("**********게임 오버 입니다********\n"
						         + "*****************************");
		break;
			}
		}
	}	

}
