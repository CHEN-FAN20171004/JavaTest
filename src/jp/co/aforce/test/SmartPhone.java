package jp.co.aforce.test;

public class SmartPhone extends MobilePhone {

	public int volume;
	public int trackNo;
	public double[][] track;

	public void playMusic() {
		System.out.println(trackNo + "曲目を再生します。");
	}

	public void pauseMusic() {
		System.out.println("音楽を止めます。");
	}

	public void volumeNow() {
		System.out.println("volume は" + volume + "です。");
	}

	public void volumeUp(int n) {
		for (int i=0; i<n; i++) {
			if (volume + 1 <= 10) {
				volume += 1;
			}
		}
		System.out.println("volume を" + n + "上げます。");
		volumeNow();
	}

	public void volumeDown(int n) {
		for (int i=0; i<n; i++) {
			if (volume - 1 >= 0) {
				volume -= 1;
			}
		}
		System.out.println("volume を" + n + "下げます。");
		volumeNow();
	}

	public void nextMusic() {
		if ((trackNo +1)<track.length) {
			trackNo += 1;
		}
		playMusic();
	}

	public void preMusic() {
		if ((trackNo -1)>0) {
			trackNo -= 1;
		}
		playMusic();
	}

	public SmartPhone() {
		super();
		mailAddress = "sample@a-force.co.jp";
		phoneNumber = "090-1111-1111";
		trackNo = 1;
		volume = 5;
		track = new double[10][100];
	}

}
