
public class Test1 {
	int mm = 0;
	int yy = 0;
	
	public void aa(int mm, int yy) {
		System.out.println(mm);
		System.out.println(yy);
	}

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.aa(1, 2);
	}
}
