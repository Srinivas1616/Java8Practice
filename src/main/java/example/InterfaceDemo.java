package example;

interface Printable {
	void Pshow();
}

interface Showable {
	void show();
}

interface A7 extends Printable, Showable {
	public void newshow();
}

public class InterfaceDemo implements A7 {

	@Override
	public void newshow() {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Pshow() {
		// TODO Auto-generated method stub

	}

}