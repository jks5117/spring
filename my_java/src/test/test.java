package test;

public class test {
	
	
	int multiple(int a, int b, int c, int d, int e){
		int result = a*b*c*d*e;
		
		return result;
	}

	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int f = 5;
		
		test ts = new test();
		
		int g = ts.multiple(a, b, c, d, f);
		System.out.println(g);

	}

}
