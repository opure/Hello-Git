package jdbc;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import oracle.jdbc.OracleDriver;
public class oracle {
public static void main(String args[]) throws FileNotFoundException, IOException{
	Connection conn=null;
	Statement stat=null;
	ResultSet rs=null;
	try{
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		DriverManager.registerDriver(new OracleDriver());//两种方式
		//获取连接的方式
	   // conn=DriverManager.getConnection("jdbc:oracle:thin:@172.20.108.23:1521:xe","system","admin");
		Properties prop=new Properties();
		//prop.put("user", "admin");//此操作等价于一下操纵
		/*prop.setProperty("user", "system");
		prop.setProperty("password", "admin");*///从配置文件中加载
		prop.load(new FileInputStream("src/jdbcTest/jdbc.properties"));
		conn=DriverManager.getConnection("jdbc:oracle:thin:@172.20.108.23:1521:xe",prop);
		
		stat=conn.createStatement();
		String sql="select id,last_name from s_emp";
		stat.executeQuery(sql);
        rs=stat.executeQuery(sql);
     	while (rs.next()){
     		System.out.println(rs.getString(2));//取当前行中名为id列的数据
     		System.out.println(rs.getString("id"));
    		}
     	if(rs!=null){
     	 rs.close();}
     	if(stat!=null){
		 stat.close();}
     	if(conn!=null){
		 conn.close();}
    			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	

}

}
