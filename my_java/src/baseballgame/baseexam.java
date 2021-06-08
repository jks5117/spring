package baseballgame;

import java.util.Random;

import java.util.Scanner;
public class baseexam {
	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		Random r = new Random();
		int[] com = new int[3]; // 컴퓨터 1차 배열
		int[] user = new int[3]; // 유저 1차 배열
		int strike = 0; // strike 값을 0으로 초기화
		int ball = 0; // ball 값을 0으로 초기화
		
		com[0]=r.nextInt(9)+1; // com[] 자리에 1~9까지의 각각의 랜덤수를 투입
		com[1]=r.nextInt(9)+1;
		
		while(com[0]==com[1]) // 랜덤 수가 같으면 수를 다시 뽑는다
		{
			com[1]=r.nextInt(9)+1;
		}
		com[2]=r.nextInt(9)+1;
		while(com[0]==com[2] || com[1]==com[2]) // 랜덤 수가 같으면 수를 다시 뽑는다
		{
			com[2]=r.nextInt(9)+1;
		}
		for (int x: com) // 확정된 for문! 원래대로라면 for(i=0; i&lt;3; i++) System.out.println(com[i])
		{
			System.out.println(x);
		}
		System.out.println();
		
		
		while(true)
		{
			strike =0; // strike 값을 초기화
			ball =0; // ball 값을 초기화
			
			for (int i=0; i<3; i++)
			{
				System.out.print((i+1)+"번째 수를 입력하세요: "); // 편의를 위해 i+1로 입력
				user[i]=v.nextInt();
			}
			if (user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) // user 중복값 확인
			{
				System.out.println("똑같은 입력이 있습니다.");
				continue;
			}
			for (int i=0; i<3; i++) {
				for (int j=0; j<3; j++) {
					if (com[j]==user[i]) {
						if (i==j) // 똑같은 자릿수에 있는 숫자가 같으므로 스트라이크
						strike ++;
					else
						ball++; // 아니라면 볼
					}
				}
			}
			if (strike==3)
				{System.out.println("홈런입니다.");
				break;
			}else if(strike ==0 && ball ==0) {
				System.out.println("Out입니다.");
			} else {
				System.out.println("Strike: " + strike +" ," + "Ball :" + ball + "입니다");
			}
		}
	}
}
 