package Projects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class TransactionExample {
    private static final String URL = "jdbc:mysql://localhost:3306/database"; 
    private static final String USER = "root"; 
    private static final String PASSWORD = "password"; 
    public static void transferMoney(int fromAccount, int toAccount, double amount) {
        String debitQuery = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
        String creditQuery = "UPDATE accounts SET balance = balance + ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            conn.setAutoCommit(false);
            try (PreparedStatement debitStmt = conn.prepareStatement(debitQuery);
                 PreparedStatement creditStmt = conn.prepareStatement(creditQuery)) {
                debitStmt.setDouble(1, amount);
                debitStmt.setInt(2, fromAccount);
                debitStmt.executeUpdate();
                creditStmt.setDouble(1, amount);
                creditStmt.setInt(2, toAccount);
                creditStmt.executeUpdate();
                conn.commit(); // Commit transaction if both succeed
                System.out.println("Transaction successful!");
            } catch (SQLException e) {
                conn.rollback(); // Rollback if an error occurs
                System.out.println("Transaction failed! Rolling back.");
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        transferMoney(1, 2, 200.00); 
    }
}
