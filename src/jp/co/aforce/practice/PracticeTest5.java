package jp.co.aforce.practice;

import java.util.ArrayList;

public class PracticeTest5 {

	public static void main(String[] args) {
		//練習問題2
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");

		//練習問題3
		String myAnimal = "犬";
		if(animals.contains("犬")) {
			System.out.println(myAnimal+"はリストに含まれています");
		}else {
			System.out.println(myAnimal+"はリストに含まれていません");
		}

		//練習問題4
		int birthday = 3;
	    switch(birthday) {
	    case 1:
	    	System.out.println("元日、成人の日");
	    	break;
	    case 2:
	    	System.out.println("建国記念の日、天皇誕生日");
	    	break;
	    case 3:
	    	System.out.println("春分の日");
	    	break;
	    case 4:
	    	System.out.println("昭和の日");
	    	break;
	    case 5:
	    	System.out.println("憲法記念日、みどりの日、こどもの日");
	    	break;
	    case 6:
	    	System.out.println("なし");
	    	break;
	    case 7:
	    	System.out.println("海の日、スポーツの日");
	    	break;
	    case 8:
	    	System.out.println("山の日");
	    	break;
	    case 9:
	    	System.out.println("敬老の日、秋分の日");
	    	break;
	    case 10:
	    	System.out.println("なし");
	    	break;
	    case 11:
	    	System.out.println("文化の日、勤労感謝の日");
	    	break;
	    default:
	    	System.out.println("なし");
	    break;
	    }


	}

}
