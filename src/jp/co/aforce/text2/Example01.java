package jp.co.aforce.text2;

public class Example01 {

	public static void main(String[] args) {

		MyThread t1 = new MyThread("thread01");
		MyThread t2 = new MyThread("thread02");

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		}catch(InterruptedException e) {

		}

		System.out.println("メインスレッドを終了します");

	}

}
