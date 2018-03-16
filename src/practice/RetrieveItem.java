package practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

class RetrieveItem 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
						System.out.println("connected");
		Statement statement=connection.createStatement();
						System.out.println("statement");
		ResultSet rs=statement.executeQuery("select * from item");
						System.out.println("rs created");
		while(rs.next())
		{
			System.out.println(rs.getInt("itemid")+" "+rs.getString(2)+" "+rs.getDouble(3));
		}
		rs.close();
		statement.close();
		connection.close();
	}
}
/**

E:\jdbc>javac RetrieveItem.java

E:\jdbc>java RetrieveItem
connected
statement
rs created
12345 yu 7000.0
1234 mi 5400.0
1235 nokia 5500.0
123 sam 5600.0

E:\jdbc>


*/
