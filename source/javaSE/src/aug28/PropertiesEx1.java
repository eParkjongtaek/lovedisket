package aug28;

import java.util.Properties;
import java.util.Enumeration;//Iterator
import static java.lang.System.out;

class PropertiesEx1{
	public static void main(String[] args) {
		Properties prop = new Properties();
	
		prop.put("UserName","Michael"); //�Ӽ� �����ϱ�
		prop.setProperty("lovely","SunAe");
		prop.setProperty("dbDRV","oracle.jdbc.driver.OracleDriver");

		String user = prop.getProperty("UserName"); //�Ӽ� ��������
		String love = prop.getProperty("lovely");
		String db_drv = prop.getProperty("dbDRV");
		out.println(user);
		out.println(love);
		out.println(db_drv);

		out.println("------------ keys ------------");
		Enumeration keys = prop.propertyNames(); //Ű���鸸 ����
		while(keys.hasMoreElements())
			out.println(keys.nextElement());

		prop.list(System.out);
	}
}

















