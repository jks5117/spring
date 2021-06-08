
public class banktest {

	public static void main(String[] args) {
		bank1 test = new bank1();
		bank2 test1 = new bank2();
		test.setMoney(99);//0에서 9사이의 숫자만 들어갈 수 있도록 설정
		test1.money1 = 100000;
		System.out.println(test.getMoney());
		System.out.println(test1.money1);
	}

}
