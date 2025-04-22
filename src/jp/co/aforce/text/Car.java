package jp.co.aforce.text;

public class Car {
	//スピードを保存するフィールド
	protected int speed;//カプセル化
	private String owner;
	private Engine engine;
	private String name = "本体";

	//内部クラス　エンジン
	class Engine{
		private String name = "エンジン";

		void check() {
			System.out.println(this.name);//this→Engineエンジン
			System.out.println(Car.this.name);//this→Car本体
		}

	    void start() {
		 System.out.println("エンジンスタート");
	 }
	}
	Car(){
		this.engine=new Engine();
	}
	void check () {
		this.engine.check();
	}

	void start() {
		this.engine.start();
		System.out.println("発車できます");
	}

//	//コンストラクターの定義
//	Car(){
//		this.speed=0;
//	}
	//コンストラクターの定義（指定あり）
	Car(int speed){
		this.speed=speed;
	}

	void setOwner(String owner) {
		this.owner=owner;
	}

	//カプセル化されたフィールドを取得ためget
	int getSpeed() {
		return this.speed;
	}
	//安全装置を付けた
	//スピードを上げるメソッド
	void speedUp(int value) {
		if(value<0) {
			return;
		}
		this.speed += value;
		if(this.speed>=180) {
			this.speed=180;
		}
	}

	//スピードを下げるメソッド
	void speedDown(int value) {
		if(value<0) {
			return;
		}
		this.speed -= value;
		if(this.speed<=-15) {
			this.speed=-15;
		}
	}
	String getCarType() {
		return "自動車";
	}

	//オーバーロード
	void lock(Key key) {
		System.out.println("鍵でロックしました");
	}
	void lock(Key key2,String value) {
		System.out.println("2つ目の鍵");
	}
	void lock(RemoteController controller) {
		System.out.println("リモコンでロックしました");
	}
    //final指定
	final void initialize() {
		this.speed=0;
	}


}


//クラス名はパスカル形式
//メソッド名はキャメル形式
//一文字目は大文字
//キャメル形式:myName
//パスカル形式:MyName
//void型は値を返さないので、returnは使わない










































