package jp.co.aforce.test;

public class MobilePhone {

	public String phoneNumber;
	public String mailAddress;


	public void makePhoneCall() {
		System.out.println(phoneNumber + "から電話を掛けます。");
	}

	public void sendMail() {
		System.out.println(mailAddress + "からメールを送信します。");
	}

	public MobilePhone() {
		phoneNumber = "090-0000-0000";
		mailAddress = "test@a-force.co.jp";
	}
}