import java.sql.*;

public class Ex2 {
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306";
			String username = "root";
			String password = "ashu123";
			String createDb = "CREATE DATABASE db";
			Connection connection = DriverManager.getConnection(url,username,password);


			Statement stm = connection.createStatement();

//			boolean bl= stm.execute(createDb);
//			System.out.println(bl);

			System.out.println("Connecting to Database");
			System.out.println(connection);
		} catch (Exception e) {
			System.out.println("Connection failed"+e.getMessage());
		}
	}
}
