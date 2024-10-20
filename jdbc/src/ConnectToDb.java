import java.sql.*;

public class ConnectToDb {
	public void connect() {
		Connection connection = null;
		try {
			// Load the MySQL JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username="root";
			String password="ashu123";
			String stm ="select * from Emp";

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", username, password);
			System.out.println("Database connection established !");
			System.out.println(connection);
			Statement statement = connection.createStatement();
		    ResultSet rs = 	statement.executeQuery(stm);
			while(rs.next()){
				int id = rs.getInt("Id");
				String empName = rs.getString("userName");
				int empSallary = rs.getInt("Salary");
				System.out.println(id+ " ." +empName + " " + empSallary);
			}
			insertData(connection,4,"rahul",3000);
		} catch (ClassNotFoundException e) {
			System.err.println("MySQL JDBC Driver not found.");
		} catch (SQLException e) {
			System.err.println("Connection failed. Check output console.");
		}
	}

	// create the function that insert data
	public  void  insertData(Connection connection,int Id, String userName,  double Salary){
		String insertSql = "INSERT INTO Emp(Id,userName,Salary) VALUES(?,?,?)";
		try(PreparedStatement pstmt = connection.prepareStatement(insertSql)){
			pstmt.setInt(1,Id);
			pstmt.setString(2,userName);
			pstmt.setDouble(3,Salary);
			pstmt.executeUpdate();
			System.out.println("Inserted data :"+ Id+" :"+userName+" :"+Salary);
		}catch (SQLException e) {
			System.err.println("Error inserting data: " + e.getMessage());
		}
	}


}