package wrapperclass;

public class IntegerWrapperExample {
	public static void main(String args[]) {				
		
		int i1=10;
		Integer i2=new Integer(10); 
		int primitivei2=i2.intValue();
		byte b=i2.byteValue();
		String str=i2.toString();
		double doubleValue=i2.doubleValue();
		float floatValue=i2.floatValue();
		long longValue=i2.longValue();
		
		System.out.println("integer="+i2);
		System.out.println("string="+str);
		System.out.println("double="+doubleValue);	
		
	}
}
