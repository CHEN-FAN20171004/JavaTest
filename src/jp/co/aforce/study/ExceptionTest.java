package jp.co.aforce.study;

public class ExceptionTest {

	public static void main(String[] args) {

		int[]numbers= {0,1,2};

		try {
		for(int i=0;i<4;i++) {
			System.out.println("numbers["+i+"]="+numbers[i]);
		}

		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("配列の範囲を超えています。");
		}

	}

}
