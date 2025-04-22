package jp.co.aforce.text;

public class SuperCar extends Car {

	@Override
	void speedUp(int value) {
		this.speed+=value;

		if (this.speed>=300) {
			this.speed=300;
		}
	}
	@Override
	void speedDown(int value) {
		value*=1.1;
		super.speedDown(value);
	}

}
