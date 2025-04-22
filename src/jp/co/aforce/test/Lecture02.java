package jp.co.aforce.test;

import java.util.Scanner;

public class Lecture02 {

	private static double bmi(double a, double b) {
		return(b/(a*a));
	}

	public static void main(String[] args) {
		double a,b;
		Scanner sc = new Scanner (System.in);
		while (true) {
			System.out.println("身長(m)を入力ください");
			a = sc.nextDouble();
			if (a>0) {
				break;
			}else {
				System.out.println("正しい身長を入力ください");
			}
		}
		while (true) {
			System.out.println("体重(kg)を入力ください");
			b = sc.nextDouble();
			if (b>0) {
				break;
			}else {
				System.out.println("正しい体重を入力ください");
			}
		}
		double result = bmi(a,b);

		if (result<18.5) {
			System.out.println("あなたは「やせ」です。");
		}else if (result<25){
			System.out.println("あなたは「標準」です。");
		}else if (result<30){
			System.out.println("あなたは「肥満」です。");
		}else {
			System.out.println("あなたは「高度肥満」です。");
		}
	}

}


