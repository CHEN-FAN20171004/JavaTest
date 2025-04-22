package jp.co.aforce.study;

import java.util.ArrayList;

public class Main {
	private static final double TAX = 0.1;

	enum Season{
		SPRING,SUMMER,AUTUMN,WINTER
	};

	public static void main(String args[]) {
//		Dog dog = new Dog();
//		dog.name = "ぽち";
//		dog.age = 3;
//		dog.showProfile();
//		dog.setName("ぽち");
//		dog.setAge(3);
//		dog.showProfile();

		Dog dog = new Dog();
		dog.setName("しろ");
		dog.setAge(3);
		dog.showProfile();

		Cat cat = new Cat();
		cat.setName("くろ");
		cat.setAge(4);
		cat.showProfile();

		ArrayList<Animal>animals=new ArrayList<>();
		animals.add(new Animal());
		animals.add(new Dog());
		animals.add(new Cat());

//		for(Animal animal:animals) {
//			animal.speak();
//		}
		//Mailクラスを実行
		Mail mail = new Mail();
		//件名あり
		System.out.println();
		mail.sendMail(null, null, null);
		//件名なし
		System.out.println();
		mail.sendMail(null, null);

		//練習3

		int amount = (int)(1500*(1+TAX));
		System.out.println(amount+"円");



		for (Season season:Season.values()) {
			System.out.println(season.toString());
		}


	}



}

























