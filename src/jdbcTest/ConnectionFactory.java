package jdbcTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {
	private static String url;
	private static String driver;
	private static String user;
	private static String password;
	private static Properties prop;
	
	static{//静�?初始化块
		try {
			prop=new Properties();
			prop.load(new FileInputStream("src/jdbcTest/jdbc.properties"));
			url=prop.getProperty("url");//获取配置文件中指定键的�?
			driver=prop.getProperty("driver");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public static Connection getConnection(){
		Connection conn=null;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,prop);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String[] args) {
		System.out.println(ConnectionFactory.getConnection());
	}
}
