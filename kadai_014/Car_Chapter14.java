package kadai_014;

// クラス
public class Car_Chapter14 {
	// フィールド（内部データ）
	private int gear = 1; // １速から５速のギアを表す
	private int speed = 10; // ギアチェンジ後の速度を示す
	
	// コンストラクタ（初期化処理）
//	public Car_Chapter14( int gear, int speed ) {
//		this.gear = gear;
//		this.speed = speed;
//		
//		System.out.println("ギア" + this.gear );
//		System.out.println("スピード" + this.speed );
//		
//	}
	
	// 【メソッド】ギアチェンジで速度が変わり、変わった速度を表示
	public void gearChange( int afterGear ) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました" );
		
		
		switch(afterGear) {
			case 1 -> speed = 10;
			case 2 -> speed = 20;
			case 3 -> speed = 30;
			case 4 -> speed = 40;
			case 5 -> speed = 50;
			default -> speed = 10;
			
		}
	}
	public void run () {
		System.out.println("速度は時速" + this.speed + "kmです" );
	}
}