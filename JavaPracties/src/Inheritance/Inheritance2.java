package Inheritance;
class Base {
	static int a=9;
	 public static void show() {
	System.out.println("Base::show() called");
	}
}

class Derived extends Base {
	 public static void show()
	 {
		
	System.out.println("Derived::show() called");
	}
}

class Inheritance2 {
	public static void main(String[] args) {
		Base b = new Derived();;
		b.show();
		
		System.out.println(b.a);
	}
}
