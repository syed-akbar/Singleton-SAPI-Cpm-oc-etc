package single_ton;

public class B {
	
	public static void main(String[] args) {
		A a1 = A.getoneinstance();
		System.out.println(a1);
		A a2 = A.getoneinstance();
		System.out.println(a2);
	}

}
