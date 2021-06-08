class Car {
	private String modelName;
	private int modelYear;
	private String color;
	private int maxSpeed;
	private int currentSpeed;

	Car(String modelName, int modelYear, String color, int maxSpeed) {
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	Car(int currentSpeed){
		this.currentSpeed = currentSpeed;
	}

	public String getModel() {
		return this.modelYear + "년식 " + this.modelName + " " + this.color;
	}
	public int getModel1() {
		return this.currentSpeed;
	}
}

public class Method04 {

	public static void main(String[] args) {
		// Car myCar = new Car(); // 기본 생성자의 호출
		Car myCar = new Car("아반떼", 2016, "흰색", 200); // 생성자의 호출
		Car myCar1 = new Car(100);
		System.out.println(myCar.getModel()); // 생성자에 의해 초기화되었는지를 확인함.
		System.out.println(myCar1.getModel1()); // 생성자에 의해 초기화되었는지를 확인함.

	}

}