package jp.co.aforce.text2;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

//		TransmitExample transmit = new TransmitExample();
//		transmit.method1();
//
//		InspectionExample inspection = new InspectionExample();
//		transmit.method1();

//		Person p1 = new Person();
//		System.out.println(p1.getInfo());
//
//		Person p2 = new Person("渡邉麻衣",27);
//		System.out.println(p2.getInfo());

//		Class<Person> personClass = Person.class;
//		Person person = personClass.newInstance();
//		System.out.println(person.getInfo());

		//Constructorクラス
//		Class<Person> personClass = Person.class;
//		Constructor<Person> personConstructor = personClass.getDeclaredConstructor(String.class,int.class);
//		Object[] initArgs = {"イチロー",44};
//		Person person = personConstructor.newInstance(initArgs);
//		System.out.println(person.getInfo());

		//フィールドの操作
		Animal animal = new Animal("キリン");
		System.out.println(animal.getName());

		Class<Animal> animalClass = Animal.class;
		Field nameField = animalClass.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(animal, "ゾウ");
		System.out.println(animal.getName());

	}

}


//F5ステップイン：その行の中処理に行く
//F6ステップオーバー：その一行を実行
//F8処理再開：次のブレークポイント、または最後まで処理を行う
