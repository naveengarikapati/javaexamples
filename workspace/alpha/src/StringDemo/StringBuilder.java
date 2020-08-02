package StringDemo;

import java.util.*;

public class StringBuilder {
public static void main(String args[]) {
	StringBuilder builder=new StringBuilder();
	builder.append("hyderabad").append("delhi").append("vizag");
	String str=builder.toString();
	System.out.println(str);
	
}
}
