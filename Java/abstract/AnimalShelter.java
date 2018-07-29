import java.util.*;
abstract class Animal{
	private int order;
	protected String name;
	public Animal(String n){
		name = n;
	}
	public void setOrder(int o){
		order = o;
	}
	public int getOrder(){
		return order;
	}
	public boolean isOlder(Animal a){
		return order < a.getOrder();
		
	}
	public String getName(){
		return name;
	}

}

class Dog extends Animal{
	public Dog(String n){
		super(n);
	}
	public String getName(){
		return name;
	}
}

class Cat extends Animal{
	public Cat(String n){
		super(n);
	}
	public String getName(){
		return name;
	}
}


class AnimalShelter
{
	private int order;
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();

	AnimalShelter(){
		dogs = new LinkedList<Dog>();
		cats = new LinkedList<Cat>();
		order = 0;
	}
	public void enqueue(Animal a)
	{
		a.setOrder(order);
		order++;
		if(a instanceof Dog)
			dogs.addLast((Dog)a);
		if(a instanceof Cat)
			cats.addLast((Cat)a);
	}
	public Animal dequeAny(){
		Animal d = dogs.peek();
		Animal c = cats.peek();
		if(d == null)
			return dequeCats();
		if(c==null)
			return dequeDogs();
		if(d.isOlder(c))
			return dequeDogs();
		else
			return dequeCats();
	}
	public Dog dequeDogs(){
		return dogs.poll();
	}
	public Cat dequeCats(){
		return cats.poll();
	}
	public static void main(String[] args) {
		AnimalShelter sh = new AnimalShelter();
		Dog d1  = new Dog("tommy");
		Dog d2 = new Dog("Pummy");
		Cat c1 =  new Cat("catty");

		sh.enqueue(d1); 
		sh.enqueue(c1); 
		sh.enqueue(d2);
		System.out.println(sh.dequeAny().getName() + "  "+ sh.dequeAny().name + "  "+
		sh.dequeDogs().name);

	}
}