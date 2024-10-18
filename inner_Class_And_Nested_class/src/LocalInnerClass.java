public class LocalInnerClass {
	public  void display(){

		class InnerClass{
			public  void InnerDisplay(){
				System.out.println("InnerClass");
			}
		}
		//create the object of the inner class
		InnerClass obj = new InnerClass();
		obj.InnerDisplay();
	}

	public static void main(String[] args) {
		//create the object of the LocalInnerClass
		LocalInnerClass obj = new LocalInnerClass();
		obj.display();
	}
}
