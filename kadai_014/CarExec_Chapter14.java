package kadai_014;

public class CarExec_Chapter14 {

	public static void main(String[] args) {
		
		// ギアに応じた速度
		Car_Chapter14 car = new Car_Chapter14();
		
		
		// ギアを１から３に切り替え
		car.gearChange(3);
		car.run();

	}

}
