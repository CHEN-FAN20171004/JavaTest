package jp.co.aforce.test;

import java.util.Scanner;
public class Lecture01 {


	private static double avg(double a,double b) {
		return (a+b)/2;
	}

	private static double total(double a,double b) {
		return (a+b);
	}

	public static void main(String[] args) {
		System.out.println("一つ目の値を入力ください");
		Scanner sc = new Scanner (System.in);
		double a = sc.nextDouble();
		System.out.println("二つ目の値を入力ください");
		double b = sc.nextDouble();
		System.out.println("合計："+total(a,b));
		System.out.println("平均："+avg(a,b));
	}

}
