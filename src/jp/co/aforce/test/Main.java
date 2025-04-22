package jp.co.aforce.test;

//import jp.co.aforce.test.human.American;
//import jp.co.aforce.test.human.Japanese;

public class Main {

	public static void main(String[] args) {
		Japanese jp = new Japanese("山田太郎","1990/01/01");
		American us = new American("John Smith","1999/12/31");

		jp.greet();
		try {
			System.out.println("年齢:" + jp.getAge());
		} catch (Exception e) {
			e.printStackTrace();
		}
		us.greet();
		try {
			System.out.println("Age:" + us.getAge());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
