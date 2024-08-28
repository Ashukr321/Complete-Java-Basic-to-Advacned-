public class _2_how_to_Call_one_const_from_another_const {

	 //calling the  constructor from 1 const. to another const.
	_2_how_to_Call_one_const_from_another_const(){
		System.out.println("calling constructor 1 ");
	}
	_2_how_to_Call_one_const_from_another_const(String  data){
		// here i want to call const.
		// this is also a const. i want to call another const. for that we have to use this methods
		this();// this refers to current class
		// if we want to call the parent class const. then at that time we have to use the super() methods
		System.out.println("this is : "+data);
	}

	public static void main(String[] args) {
		String name = "Ashutosh kumar";
		_2_how_to_Call_one_const_from_another_const obj = new _2_how_to_Call_one_const_from_another_const(name);
	}
}
