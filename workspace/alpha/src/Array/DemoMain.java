package Array;

import java.util.*;

public class DemoMain {
public static void main(String args[]) {
	List<Demo> list=new ArrayList();
	Demo demo1=new Demo("chotu",21,1400);
	list.add(demo1);
	Demo demo2=new Demo("chinnu",18,1800);
	list.add(demo2);
	Demo demo3=new Demo("chinni",20,2400);
	list.add(demo3);
	Demo demo4=new Demo("chanti",19,1900);
	list.add(demo4);
	demo1.setCredit(300);
	demo2.setDebit(250);
	demo3.setCredit(150);
	demo4.setDebit(100);
	for(Demo demo:list) {
		System.out.println(demo.getName()+" "+demo.getBalance()+" "+demo.getAge());
	}
	
}
}
