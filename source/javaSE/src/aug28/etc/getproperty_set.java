package aug28.etc;

import java.util.Properties;

public class getproperty_set {

	public static void main(String[] args) {
		
		Properties prop = new Properties();

		// prop에 키와 값(key, value)을 저장한다.
		prop.setProperty("1","30");
		prop.setProperty("2","kr");
		prop.setProperty("3","10");
		prop.setProperty("4","90");		
		
		int r_proerty = (int)(Math.random() * 4) + 1;
		
		//int ar[] = new int[(int)(Math.random() * 4) + 1];
		
		System.out.println(r_proerty);
		
		StringBuffer sb = new StringBuffer();
		sb.append(r_proerty);
		String str = sb.toString();
		
		System.out.println(prop.getProperty(str));
		
	}

}
