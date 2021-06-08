
public class Another {

	public int sum1 (int a, int b) {
		int c = a + b;
		return c;
	}
	
	public void sum2 (int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Another an = new Another();
		
		an.sum1(1, 2);
		
		//an.sum2(1, 2);

	}

}
