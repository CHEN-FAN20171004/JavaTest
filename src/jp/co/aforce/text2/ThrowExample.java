package jp.co.aforce.text2;

public class ThrowExample {

	public static void main(String[] args) {

		try {
			throw new ArrayIndexOutOfBoundsException();
//			System.out.println("ここは実行されません。");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("例外が通知されました。");
		}

	}

}
