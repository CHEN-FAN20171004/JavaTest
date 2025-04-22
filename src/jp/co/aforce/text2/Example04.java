package jp.co.aforce.text2;

public class Example04 {

	public static void main(String[] args) {
		Stock stock = new Stock(10);
		Shop shop1 = new Shop(stock, "shop1");
		Shop shop2 = new Shop(stock, "shop2");

		shop1.start();
		shop2.start();

	}

}

//class Stock {
//
//	private int count = 0;
//
//	public Stock(int stock) {
//		this.count = stock;
//	}
//
//	public synchronized boolean take(int num) {
//		if (num <= this.count) {//在庫数のチェック
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			this.count -= num;//在庫の取り出し
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//	public int getCount() {
//		return this.count;
//	}
//}
//
//class Shop extends Thread {
//
//	private Stock stock = null;
//	private String name = null;
//
//	public Shop(Stock stock, String name) {
//		this.stock = stock;
//		this.name = name;
//	}
//
//	public void run() {
//		while (true) {
//			if (!this.stock.take(1)) {
//				break;
//			}
//			System.out.printf("%s：商品を1個取り出しました。%n", this.name);
//		}
//		System.out.printf("%s：残りの在庫は%d個です。%n", this.name, this.stock.getCount());
//	}
//
//}
