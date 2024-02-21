import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args){

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "aryanv";
//        String sql = "Select * from student";
//        String sql = "insert into student values (5,'Saagnik',85)";
//        String sql = "update student set sname = 'Saag' where sid = 4";
//        String sql = "delete from student where sid = 4";
        int sid = 4;
        String sname = "Saagnik";
        int marks = 85;
        String sql = "insert into student values (?,?,?)";

        try {
            Connection con = DriverManager.getConnection(url, uname, pass);
            System.out.println("Connection Established");
//            Statement st = con.createStatement();

//            READ
//            ResultSet rs = st.executeQuery(sql);
//            rs.next(); //moves the pointer from the head to the 1st value AND it checks if the next row exists and returns the boolean value
//            String name = rs.getString("sname");
//            System.out.println(name);
//            while(rs.next()){
//                System.out.print(rs.getString(1) + " - ");
//                System.out.print(rs.getString(2) + " - ");
//                System.out.println(rs.getString(3));
//            }

//            CREATE
//            Boolean rs = st.execute(sql);
//            System.out.println(rs);

//            UPDATE AND DELETE
//            st.execute(sql);

//            PREPARED STATEMENT
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1,sid);
            st.setString(2,sname);
            st.setInt(3,marks);
            st.execute();

            con.close();
            System.out.println("Connection Closed");
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
