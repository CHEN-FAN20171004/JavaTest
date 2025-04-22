package jp.co.aforce.text;

import java.util.ArrayList;

import jp.co.aforce.study.Mail;

public class Main {

	public static void main(String args[]) {
//		Car car;
//		car = new Car();
//		Car car = new Car();
//
//		car.speedUp(40);
//		car.speedDown(10);
//		System.out.println("速度＝"+car.getSpeed());

		Truck truck = new Truck();
		truck.addPayload(10);
		truck.speedUp(60);

//		Car car = new Truck();
//		System.out.println(car.getCarType());

//		Car car1 = new Car();
//		System.out.println(car1.getCarType());
//		Car car2 = new Car();
//		System.out.println(car2.getCarType());
//		Car car3 = new Car();
//		System.out.println(car3.getCarType());

		ArrayList<Car>cars=new ArrayList<Car>();
		cars.add(new Car());
		cars.add(new Truck());
		cars.add(new LongDriveTruck());

		//拡張文：コレクションの繰り返し時によく使われる
		for(Car car:cars) {
			System.out.println(car.getCarType());
		}

		Car car = new Car();//一つ目のコンストラクターでインスタンスを呼ぶ
		Car myCar = new Car(60);//二つ目のコンストラクターでインスタンスを呼ぶ

		Car car1=new Car();
		Key key=new Key();
		car1.lock(key);

		Car car2=new Car();
		RemoteController controller =new RemoteController();
		car2.lock(controller);
//
//		Car car = new Truck();
//		Truck truck1 = car;
//		Truck truck2 = (Truck)car;

		//静的フィールド
		Person person1 = new Person();
		Person person2 = new Person();

		person1.setName("中垣");  //通常のフィールド
		person2.setName("林");

		Person.setCount(2);  //静的フィールド

		Mail mail = new Mail();




	}

}






































