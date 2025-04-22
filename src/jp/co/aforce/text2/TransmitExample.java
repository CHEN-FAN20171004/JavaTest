package jp.co.aforce.text2;

public class TransmitExample {
	public static void main(String[] args) {
		TransmitExample example = new TransmitExample();
		example.method1();
	}

	public void method1() {
		method2();
	}

	public void method2() {
		try {
			method3();
			System.out.println("ここは実行されません。");
		} catch (RuntimeException e) {
			System.out.println("例外が通知されました。");
		}
	}

	public void method3() {
		throw new RuntimeException();
	}

}
