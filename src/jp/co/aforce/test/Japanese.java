package jp.co.aforce.test;

public class Japanese extends Human{

	public void greet() {
		System.out.println("こんにちは！\n私は" + super.getName() +"です。");
	}

	public Japanese(String name, String birthday) {
		super(name);
		super.setBirthday(birthday);
	}
}
