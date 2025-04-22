package surasura.chapter11;

class MyClassA {
	private int fieldA=0;
	private void methodA() {
		System.out.println("do methodA");
	}

	void callSample() {
		System.out.println(this.fieldA);
		this.methodA();
	}

}
