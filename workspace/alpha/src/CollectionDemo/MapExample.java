package CollectionDemo;

import java.util.*;

import equalhash.Trainee;

public class MapExample {

	public static void main(String[] args) {
		Trainee trainee1 = new Trainee(10, "prakash");
		Trainee trainee2 = new Trainee(11, "pradeep");
		Trainee trainee3 = new Trainee(4, "anuj");
		Trainee trainee4 = new Trainee(13, "ankit");
		Trainee trainee5 = new Trainee(15, "pradeep");
		
		Comparator<Integer>comparator=new IdComparator();
		Map<Integer,Trainee> map = new TreeMap<>(comparator);
		map.put(10, trainee1);
		map.put(11, trainee2);
		map.put(4, trainee3);
		map.put(13, trainee4);
		map.put(15, trainee5);
		
		int size=map.size();
		
		System.out.println("size="+size);

		Trainee trainee = map.get(11);// fetching value associated with key 11
		System.out.println(trainee.getId() + " " + trainee.getName());

		map.remove(4);// removing element by key=4
		System.out.println("***forach on keys, printing values***");
		
		Set<Integer> keys = map.keySet();
		for (Integer k : keys) {
			Trainee fetched = map.get(k);
			System.out.println(fetched.getId() + " " +fetched.getName());

		}
		System.out.println("***forach on values, printing values***");
		Collection<Trainee>values=map.values();
    for(Trainee value: values) {
    System.out.println("value="+value.getId()+" "+value.getName());	
    }

	}

}
