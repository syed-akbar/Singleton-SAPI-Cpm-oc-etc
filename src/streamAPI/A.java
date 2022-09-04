package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
	
	public static void main(String[] args) {
		
		 List<String> data = Arrays.asList("syed","akbar","zee","syed");
		 List<String> newdata = data.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		 System.out.println(newdata);
		 
	}

}
