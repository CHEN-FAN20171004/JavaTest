package jp.co.aforce.text2;

public class Stock {

	private Object lock = new Object();
	private int count =0;

	public Stock(int stock) {
		this.count=stock;
	}
//倉庫から中身を取り出す
//	public boolean take(int num) {
//		if(num<=this.count) {//在庫数のチェック
//			try {
//				Thread.sleep(10);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//			this.count -= num;//在庫の取り出し
//			return true;
//		}else {
//			return false;
//		}
//	}
//	public int getCount() {
//		return this.count;
//	}

	public boolean take(int num) {
		synchronized(lock) {

		if(num<=this.count) {
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			this.count -= num;
			return true;
		}else {
			return false;
		}
	  }
	}
	public int getCount() {
		return this.count;
	}

}
