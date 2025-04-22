package jp.co.aforce.text2;

public class Person {

	private String name;
	private int age;

	public Person() {
		this.name = "名無しさん";
		this.age = 18;
	}

	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public String getInfo() {
		return this.name + ":" + this.age + "歳";
	}

}
