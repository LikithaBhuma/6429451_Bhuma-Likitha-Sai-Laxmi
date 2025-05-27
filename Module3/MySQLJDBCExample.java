package Projects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLJDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database"; // Replace with actual DB name
        String user = "root"; // Replace with your username
        String password = "password"; // Replace with your password

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
