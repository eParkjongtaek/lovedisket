package aug28;

import java.util.Properties;
import java.util.Enumeration; // Iterator
import static java.lang.System.out;

public class PrepertiesEx1 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		prop.put("UserName", "Jongtaek");
		prop.setProperty("lovery", "SunAe");
		prop.setProperty("dbDRV", "orcle.jdbc.driver.OracleDriver");
		
		String user = prop.getProperty("UserName"); // 속성 가져오기
		String love = prop.getProperty("lovely");
		String db_drv = prop.getProperty("dbDRV");
		
		out.println(user);
		out.println(love);
		out.println(db_drv);
		
		out.println("-------------------------- keys ------------------");
		Enumeration keys = prop.propertyNames(); // 키값들만 얻어내기
		while(keys.hasMoreElements())
		{
			out.println(keys.nextElement());
		}
		
		prop.list(System.out);
		
		
	}

}
