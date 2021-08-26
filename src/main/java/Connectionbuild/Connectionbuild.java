
package Connectionbuild;
import java.sql.*;

public class Connectionbuild {



    public static void main(String[] args) {

        try
        {
            Connection connection= DriverManager.getConnection("jdbc:postgresql://localhost:5438/Informstion", "postgres", "2737");
            Statement statement= connection.createStatement();


            String sql = "INSERT INTO public.student (\"stu_name\",dep_name )\n" + "VALUES( 'HadiaMehar', 'CS' )";
            statement.executeQuery(sql);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Informstion.student");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("stu_id"));
                System.out.println(resultSet.getString("stu_name"));

            }


            resultSet.close();
            statement.close();
            connection.close();
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }

    }





}



