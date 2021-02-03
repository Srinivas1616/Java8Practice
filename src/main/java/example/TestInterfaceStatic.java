package example;

interface Drawable {
	void draw();

	static int cube(int x) {
		return x * x * x;
	}
}

class Rectangle implements Drawable {
	
	static void show() {
		System.out.println("class static method");
	}
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

public class TestInterfaceStatic {
	public static void main(String args[]) {
		Rectangle d = new Rectangle();
		d.draw();
		Rectangle.show();
		//System.out.println(d.show());
	}
}