package item;

public class Itemmain {
public static void main(String []args) {
   Item item1=new Item("naveen","nchinnu",21);
   Item item2=new Item("yash","agarwal",21);
   Item list[]=new Item[2];
   list[0]=item1;
   list[1]=item2;
   for(Item item:list) {
	   System.out.println(item.getId()+" "+item.getName()+" "+item.getPrice());
   }
}
}
