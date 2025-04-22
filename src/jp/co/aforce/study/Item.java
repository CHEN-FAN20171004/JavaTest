package jp.co.aforce.study;

public class Item {

	private String itemName;
	private int price;
	Item(String itemName,int price){
		this.itemName=itemName;
		this.price=price;
	}
	void display() {
		System.out.println(this.itemName+":"+this.price+"円");
	}

}
