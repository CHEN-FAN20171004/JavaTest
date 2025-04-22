package jp.co.aforce.text2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TryExample01 {

	public static void main(String[] args) {

		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");

		try {
			Date date = format.parse("19XX/08/21");//不正な日付を引数にparseに失敗し例外が発生⇒catchに処理が移行
			System.out.println(date);//ここは実行されない
		} catch (ParseException e) {
			System.out.println("この文字列は、日付に変換できません。");
		}

	}

}
