package CollectionDemo;

import java.util.*;

import equalhash.Trainee;

public class SetExample {

	public static void main(String[] args) {
		Comparator<Trainee>comparator=new TraineeComparator();
		Set<Trainee> set = new TreeSet<>();
		Trainee trainee1 = new Trainee(10, "prakash");
		set.add(trainee1);// adding element at the end
		Trainee trainee2 = new Trainee(11, "pradeep");
		set.add(trainee2);
		Trainee trainee3 = new Trainee(4, "anuj");
		set.add(trainee3);
		Trainee trainee4 = new Trainee(13, "ankit");
		set.add(trainee4);
		Trainee trainee5 = new Trainee(15, "pradeep");
		set.add(trainee5);

		int size = set.size();
		System.out.println("before remove size=" + size);
		set.remove(trainee4);
		System.out.println("after remove size=" + size);
		for (Object obj : set) {
			Trainee trainee = (Trainee) obj;
			System.out.println(trainee.getId() + " " + trainee.getName());

		}
		System.out.println("******using iterator*******");
		   Iterator<Trainee> iterator=set.iterator();
		   //hasNext() will return true if next element is available
		   while(iterator.hasNext()) {		 
				Trainee trainee = iterator.next();// fetch next element
				System.out.println("element=" + trainee.getId() + " " + trainee.getName());
			  
		   }

	}

}
