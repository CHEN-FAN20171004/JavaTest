package jp.co.aforce.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Human {

	private String name;
	private String birthday;

	public void greet() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthday(String birthday) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
		this.birthday = birthday;
	}

	public String getName() {
		return this.name;
	}

	public int getAge()throws Exception {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
		Date birth = dateFormat.parse(birthday);
		Calendar now = Calendar.getInstance();
		Calendar born = Calendar.getInstance();
		now.setTime(new Date());
		born.setTime(birth);

		if (born.after(now)){
			throw new IllegalArgumentException("正しい誕生日を入力してください。");
		}

		int age = now.get(Calendar.YEAR) - born.get(Calendar.YEAR);
		if (now.get(Calendar.DAY_OF_YEAR) < born.get(Calendar.DAY_OF_YEAR)) {
			age -= 1;
		}
		return age;
	}

	public Human(String name) {
		this.name = name;
	}

	public Human() {
		this.name = "";
	}

}

