import java.sql.*;


public class jdbc {



    public static void main(String[] args) throws Exception {

        String url = "";
        String uname = "root";
        String pass = "";

        Class.forName("com.sql.jdbc.Driver");
        Connection con =  DriverManager.getConnection(url,uname,pass);
    }
}

    
