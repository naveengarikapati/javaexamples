package item;

public class Item {
 String id;
 String name;
 double price;
 Item(String id, String name, double price) {
	 this.name=name;
	 this.id=id;
	 this.price=price;
	 System.out.println("inside 3 args constructor");
 }
 Item(String id, String name) {
	 this.name=name;
	 this.id=id;
	 System.out.println("inside 2 args constructor");
 }
 
 Item(){
  this(" "," ",200);
  System.out.println("inside zero constructor");
 }
 String getId() {
	 return id;
	}
 void setId(String id) {
	 this.id=id;
 }
 String getName() {
	 return name;
 }
 void setName(String name) {
	this.name=name;
 }
 double getPrice() {
	 return price;
 }
 void setPrice(double price) {
	 this.price=price;
 }
 
}
