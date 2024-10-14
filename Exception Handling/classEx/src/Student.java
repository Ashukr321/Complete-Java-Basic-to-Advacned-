public class Student {
	int age;
	public void setAge(int age) throws InvalidAgeException {
		if(age<18){
			throw  new InvalidAgeException("under age so can't do ug pg");
		}
		else{
			this.age = age;
		}
	}
	public  String toString(){
		String s;
		s = String.format("age: %d", this.age);
		return  s;
	}


}
