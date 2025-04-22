package jp.co.aforce.test;

public class Lecture03 {

	public static void main(String[] args) {

		double loan = 250000;
		double yearRate = 0.14;
		double monthRate = yearRate/12;
		double repay = 30000;
		int count = 0;

//		double interest = loan * rate / 12;

		while (loan>0) {
			count++;
			if (loan<=repay) {
				repay = loan * (1 + monthRate);
				loan = 0;
				System.out.println(count + "ヶ月目：返済額=" + repay + "円, 返済完了");
			}else {
				loan = loan * (1 + monthRate) - repay;
				System.out.println(count + "ヶ月目：返済額=" + repay + "円, 残り" + loan + "円");
			}

		}

	}

}
