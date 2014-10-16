package jdbcTest;
import java.sql.*;

import javax.print.attribute.standard.PresentationDirection;

public class JDBCSteps {
	public static void main(String[] args) {
		
	}
	public void findEmpById(int id){
		
		Connection conn=null;
		ResultSet rs=null;
		PreparedStatement pastat=null;
		try {
			conn=ConnectionFactory.getConnection();
		    String sql1="insert into s_emp(id,last_name) values(987,'asdasf')";
			pastat=conn.prepareStatement(sql1);
			pastat.setInt(1,20);
			pastat.setString(2,"zhanan");
			rs=pastat.executeQuery();
			while (rs.next()){
				System.out.println(rs.getString(id));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	
	
}
