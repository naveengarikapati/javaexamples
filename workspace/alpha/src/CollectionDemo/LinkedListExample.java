package CollectionDemo;

import java.util.*;

import equalhash.Trainee;

public class LinkedListExample {

public static void main(String[] args) {

	LinkedList list = new LinkedList();// Object arr[];
	list.add(new Trainee(10, "prakash"));// adding element at the end
	list.add(new Trainee(11, "pradeep"));
	list.add(new Trainee(4, "anuj"));
	list.add(new Trainee(13, "ankit"));
	list.add(new Trainee(15, "pradeep"));

	Object element2 = list.get(2);// fetching element at index 2
	Trainee element2String = (Trainee) element2;
	int size = list.size();

	System.out.println("size before removing element=" + size);

	list.remove(1);// removing element at index 1

	size = list.size();// size of list

	// list.clear();// clearing list

	System.out.println("size after removing element=" + size);

	boolean iscontain = list.contains("anuj");
	System.out.println("contains=" + iscontain);

	for (int i = 0; i < list.size(); i++) {
		Object obj = list.get(i);
		Trainee trainee = (Trainee) obj;
		System.out.println("element=" + trainee.getId() + " " + trainee.getName());

	}
}

}
