package jp.co.aforce.text2;

class Television implements Powerable,VolumeChangable{

	//電源の状態
	private boolean isPowered=false;
	private int volume=0;

	//電源ON
//	@Override
	public boolean powerOn() {
		if(!isPlugged()) {  //！・・・ではない時に
			return false;
		}
		this.isPowered=true;
		return true;
	}

	//電源OFF
//	@Override
	public void powerOff() {
		this.isPowered=false;
	}

	//コンセントが刺さっているかのチェック
	private boolean isPlugged() {
		return true;
	}

	public void volumeUp() {
		if(this.volume<100) {
			this.volume++;
		}
	}

	public void volumeDown() {
		if(this.volume>0) {
			this.volume--;
		}
	}

}
