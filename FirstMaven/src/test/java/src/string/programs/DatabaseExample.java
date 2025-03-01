//package string.programs;
//
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class DatabaseExample {
//	public static void main(String[] args) {
//		// Database credentials
//		String jdbcUrl = "jdbc:mysql://localhost:3306/yourDatabaseName";
//		String username = "yourUsername";
//		String password = "yourPassword";
//
//		Connection connection = null;
//		Statement statement = null;
//		ResultSet resultSet = null;
//
//		try {
//			// Establish a connection to the database
//			connection = DriverManager.getConnection(jdbcUrl, username, password);
//			statement = connection.createStatement();
//
//			// Execute a query
//			String query = "SELECT * FROM yourTableName";
//			resultSet = statement.executeQuery(query);
//
//			// Process the results
//			while (resultSet.next()) {
//				String columnData = resultSet.getString("yourColumnName");
//				System.out.println("Data from the column: " + columnData);
//			}
//
//			// Example Selenium WebDriver usage
//			System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//			WebDriver driver = new ChromeDriver();
//			driver.get("http://example.com");
//
//			// Perform Selenium operations
//
//			driver.quit();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			// Close the database connections
//			try {
//				if (resultSet != null) resultSet.close();
//				if (statement != null) statement.close();
//				if (connection != null) connection.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
//
//
