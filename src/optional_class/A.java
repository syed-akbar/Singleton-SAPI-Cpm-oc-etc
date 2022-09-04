package optional_class;

import java.util.Optional;

public class A {
	
	int x =2 ;
	public static void main(String[] args) {
		A a1=new A();
		Optional<A> data = Optional.ofNullable(a1);
		System.out.println(data.isPresent());
	}
}
