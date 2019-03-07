package mx.com.interware.cti.chunk;

public class Greeter{

	public Greeter() {
	}
	
	public String sayHello(String name){
		String result = null;
		if(Math.random() > 0.2){
			result = "Hello there " + name + "!";
		}
		else{
			throw new RuntimeException("What in the hill happened?");
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Hello there children of men!");
	}
}

