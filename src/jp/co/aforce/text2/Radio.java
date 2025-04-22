package jp.co.aforce.text2;

class Radio {

	   //電源の状態
		private boolean isPowered=false;

		//電源ON
		public boolean powerOn() {
			if(!isBatteryEnabled()) {  //！・・・ではない時に
				return false;
			}
			this.isPowered=true;
			return true;
		}

		//電源OFF
		public void powerOff() {
			this.isPowered=false;
		}

		//チェック
		private boolean isBatteryEnabled() {
			return true;
		}


}
