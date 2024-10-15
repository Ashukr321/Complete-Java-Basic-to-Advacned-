public class Demo {
	public static void main(String[] args) {
		Student s = new Student();
		try
		{

		s.setAge(32);
		s.setName("Ashutosh");
		s.setId(123456789);
		}catch (Exception e){
		e.printStackTrace();
		}
		System.out.println(s.toString());
	}


}
