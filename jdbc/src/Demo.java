public class Demo {
	public static void main(String[] args) {
		ConnectToDb db = new ConnectToDb();
		try {
		db.connect();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
