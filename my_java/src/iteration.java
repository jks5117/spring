
public class iteration {

	
	public static void main(String[] args) {
		int i = 0;

		while (i < 5) {

		    System.out.println("while 문이 " + (i + 1) + "번째 반복 실행중입니다.");

		    i++; // 이 부분을 삭제하면 무한 루프에 빠지게 됨.

		}

		System.out.println("while 문이 종료된 후 변수 i의 값은 " + i + "입니다.");
		
	}
}
