package pkg2;
import pkg1.*;
import java.util.ServiceLoader;

public class HelloConsumer {
	
	public static void main(String[] args) {
		Iterable<hello> services = ServiceLoader.load(hello.class);
		hello ih=services.iterator().next();
		ih.sayHello();
		
		hello h1 = new HelloImpl1();
		h1.sayHello();
		System.out.println(h1.getClass().getName());




	}



}
