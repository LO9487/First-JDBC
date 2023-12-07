import java.sql.*;
import java.util.Scanner;


public class MyJDBC {

    public static void main(String[] args) {
 try {
     Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Lojiakeng87");

     Statement statement = connection.createStatement();

//     ResultSet resultSet = statement.executeQuery("select * from user");
//
//     while (resultSet.next()) {
//         System.out.println(resultSet.getString("username"));
//     }

     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter new username:");
     String newUsername = scanner.nextLine();

     System.out.println("Enter new password:");
     String newPassword = scanner.nextLine();

     // Insert new data into the 'user' table
     String insertQuery = "INSERT INTO user (username, password) VALUES (?, ?)";
     PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
     preparedStatement.setString(1, newUsername);
     preparedStatement.setString(2, newPassword);
     int rowsAffected = preparedStatement.executeUpdate();

     if (rowsAffected > 0) {
         System.out.println("Data inserted successfully.");
     } else {`
         System.out.println("Failed to insert data.");
     }



 } catch (Exception e){
     e.printStackTrace();
 }
    }

}
