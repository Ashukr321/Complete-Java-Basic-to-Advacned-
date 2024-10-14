public class Demo {
	public static void main(String[] args) {
		Student s = new Student();
		try
		{

		s.setAge(2);
		}catch (Exception e){
			e.printStackTrace();
		}
		System.out.println(s.toString());
	}


}
