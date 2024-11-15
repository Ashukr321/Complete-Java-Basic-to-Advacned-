package constructor;

class Animal{

	final  String name ;
	int age;

	Animal(String name){
	this.name =name;
	}
	// overload constructor
	Animal(String name,int age){
		this.name =name;
		this.age=age;
	}

	// default constructor
	public  void  eat()
	{
		System.out.println(this.name+"  is eating!" +"\n age:"+this.age);
	}
}

public class constructorEx {
	public static void main(String[] args) {
//	create the object of the Animal
		Animal obj  = new Animal("tommy");
		Animal obj2  = new Animal("tommy",6);


		// call the function
		obj.eat();
		obj2.eat();

	}
}
