
public class WhileTest {

	public static void main(String[] args) {
		
		int i = 1;
		 
		while (i < 6) {

		    System.out.println("while 문이 " + (i) + "번째 반복 실행중입니다.");

		    i++; // 이 부분을 삭제하면 무한 루프에 빠지게 됨.

		}
	}

}
