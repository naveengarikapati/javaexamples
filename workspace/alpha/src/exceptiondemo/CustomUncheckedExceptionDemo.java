package exceptiondemo;

public class CustomUncheckedExceptionDemo {
	CustomUncheckedExceptionDemo demo = new CustomUncheckedExceptionDemo();
	Product product = null;
	demo.display(product);
	System.out.println("bye bye");



public void display(Product product) {
	if (product == null) {
		
			InvalidArgUncheckedException exception = new InvalidArgUncheckedException("invalid argument");
			throw exception;
		
	}
	String id = product.getId();
	String name = product.getName();
	System.out.println("product =" + id + " " + name);

}

}


