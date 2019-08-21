package July25.advanProg;

import java.util.Scanner;

public class July11 {

	public static void main(String[] args) {
		Cat cat = new Cat("---");
		cat.move();
		Lion lion = new Lion();
		lion.move();
		
		Cat li = new Cheetah();
		li.move();
		
		//Lion cat5 = (Lion) new Cat("---");
		
		
		

		//line below is called UPCASTING
		Cat cat1 = getCat();
		//cat1 can have only the methods/data coming from
		//the Cat type (the type of the cat1 variable)
		//But the method that is invoked comes from the type
		//of the reference stored inside the cat1 variable.
		cat1.move();
		cat1.run();
		//above two lines are examples of polymorphism
		
/*		Cat cata = new Cat("--");
		Lion catb = new Lion();
		Cheetah catc = new Cheetah();
		
		catsMoving(cata);
		catsMoving(catb);
		catsMoving(catc);
		catsMoving(new AsianTiger()); */
		
	}
	public static Cat getCat() {
		Scanner in = new Scanner(System.in);
		String typeOfCat = in.next();
		in.close();
		if(typeOfCat.equals("Lion"))
			return new Lion();
		else if(typeOfCat.equals("Cheetah"))
			return new Cheetah();
		
		return new Cat("---");
	}
	public static void catsWorking(Cat c) {
		if(c instanceof Lion) {
			((Lion)c).eatDeer();
			((Lion)c).move();
		}
		else c.move();
	}
	public static void catsMoving(Cat c) {
		c.move();
	}
}
class Cat {
	private String sound;
	
	Cat(String s){
		sound=s;
	}
	//Cat(){
		
	//}
	void run() {System.out.println(this.sound);}
	void move(){
		System.out.println("Cat is moving");
	}
	//method overlading
	void move(int speed) {
		System.out.println("Cat is moving at "+speed+" miles per hour");
	}

}

class Lion extends Cat {
	Lion(){
		super("Roar");
	}
	//method overriding
	void move() {
		System.out.println("Lion is moving");
	}
	void eatDeer() {
		System.out.println("I am eating a deer");
	}
}
class Cheetah extends Cat{
	private String pattern;
	Cheetah(){
		super("Squeek");
	}
}
class AsianTiger extends Cat{
	private String pattern;
	AsianTiger(){
		super("Meow");
	}
}