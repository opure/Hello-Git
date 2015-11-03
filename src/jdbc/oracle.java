/*package jdbc;
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
		DriverManager.registerDriver(new OracleDriver());//���ַ�ʽ
		//��ȡ���ӵķ�ʽ
	   // conn=DriverManager.getConnection("jdbc:oracle:thin:@172.20.108.23:1521:xe","system","admin");
		Properties prop=new Properties();
		//prop.put("user", "admin");//�˲����ȼ���һ�²���
		prop.setProperty("user", "system");
		prop.setProperty("password", "admin");//�������ļ��м���
		prop.load(new FileInputStream("src/jdbcTest/jdbc.properties"));
		conn=DriverManager.getConnection("jdbc:oracle:thin:@172.20.108.23:1521:xe",prop);
		
		stat=conn.createStatement();
		String sql="select id,last_name from s_emp";
		stat.executeQuery(sql);
        rs=stat.executeQuery(sql);
     	while (rs.next()){
     		System.out.println(rs.getString(2));//ȡ��ǰ������Ϊid�е����
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
*/