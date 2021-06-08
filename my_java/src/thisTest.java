import java.util.Scanner;

public class thisTest {
	int a, b; // 인스턴스 필드
	
	public thisTest(int a, int b) { // 생성자(필드 초기화)
		this.a = a; this.b = b;
	}
	
	public void add(){ // 인스턴스 메소드
		System.out.println(a+b); 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2개의 정수를 입력");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		thisTest im = new thisTest(num1, num2); // 인스턴스 생성 및 생성자 호출
		im.add(); // 인스턴스 메소드 호출
	}
}
