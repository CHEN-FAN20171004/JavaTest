package jp.co.aforce.text2;

public class Shop {

	private Stock stock = null;
	private String name = null;

	public Shop(Stock stock,String name) {
		this.stock=stock;
		this.name=name;
	}
	public void run() {
		while(true) {
			if(!this.stock.take(1)) {
				break;
			}
			System.out.printf("%s：商品を1個取り出しました。%n",this.name);
		}
		System.out.printf("%s：残りの在庫は%d個です。%n",this.name,this.stock.getCount());
	}
	public void start() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
