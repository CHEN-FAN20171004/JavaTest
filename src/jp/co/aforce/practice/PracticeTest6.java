package jp.co.aforce.practice;


public class PracticeTest6 {

	public static void main(String[] args) {
		//練習問題1
		int r = new java.util.Random().nextInt();
		int fortune = r;
	    switch(fortune) {
	    case 1:
	    	System.out.println("吉です");
	    	break;
	    case 2:
	    	System.out.println("中吉です");
	    	break;
	    case 3:
	    	System.out.println("大吉です");
	    	break;
	    default:
	    	System.out.println("凶です");
	    break;
	    }

		//練習問題2
	    int sum = 0;
		for(int x = 1;x<=100;x++) {
			if(x%7==0) {
				System.out.println(x+"");
				sum+=x;

			}

		}

		System.out.println("7の倍数の総合計は"+sum);


		//練習問題3
		for(int i=1; i<=9; i++) {
            System.out.println();

            for(int j=1; j<=9; j++) {
                System.out.printf(" %3d", (i * j));
            }
        }

	}

}
