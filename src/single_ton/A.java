package single_ton;

public class A {
	
	static A a1=null;
	
	private A() {
		
	}
	
	public static A getoneinstance() {
		
		if (a1==null) {
			a1=new A();
			return a1;
		}
		return a1;
		
	}

}
