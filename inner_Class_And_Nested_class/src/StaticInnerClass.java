public class StaticInnerClass {
	static  String name = "Ashutosh";
	int b = 12;
	static  class InnerClass{
		public  void display(){
			System.out.println(name);
//			System.out.println(b);
		}
	}
	public static void main(String[] args) {
		InnerClass obj = new InnerClass();
		obj.display();
	}
}

// static class InnerClass always access the static data members of outer class
