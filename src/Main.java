import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_db","root","password");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from sample_data");

            while (rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}