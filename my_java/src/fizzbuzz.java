
public class fizzbuzz {

	public static void main(String[] args) {

		System.out.println("while문 fizzbuzz");
		//while문 fizzbuzz
		int i = 1;
		while (i <= 100) {
			if (i % 35 == 0) {
				System.out.println("fizzbuzz ");
			} else if (i % 5 == 0) {
				System.out.println("fizz ");
			} else if (i % 7 == 0) {
				System.out.println("buzz ");
			} else {
				System.out.println(i);
			}
			i++;

		}
		System.out.println("");
		System.out.println("for문 fizzbuzz");
		//for문 fizzbuzz
		for(int j=1;j<101;j++) {
			if(j%35==0) {
				System.out.println("fizzbuzz");
			}else if(j%7==0) {
				System.out.println("buzz");
			}else if(j%5==0) {
				System.out.println("fizz");
			}else {
				System.out.println(j);
			}
		}
	}

}