public class _3_method_overriding{
	// rules of method overriding in Java
    /*
    1. name should be same
    2. return type also same
    3. recommend to use the @Override Annotation
    4. parameters also same
    5. static and private methods can't be overridden
    6. we can't call  from static methods to  static  class method like super keywords
    */

	 static  class  Vehicle {
		public void drive() {
			System.out.println("the vehicle is moving! ");
		}
	}


	public static class Car extends Vehicle {
		@Override
		public void drive() {
			System.out.println("car is moving ");
		}
		public void callVehicleDrive(){
			super.drive();
		}
	}

	public static void main(String[] args) {
		System.out.println("methods overriding in Java ");
		// create the object of the Car class
		Car c1 = new Car();
		c1.drive();
		c1.callVehicleDrive();
	}
}