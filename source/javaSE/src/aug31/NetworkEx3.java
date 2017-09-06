package aug31;

import java.net.*;
import java.io.*;

public class NetworkEx3 {

	public static void main(String[] args) {
		
		URL url = null;
		String address = "http://docs.oracle.com/javase/7/docs/api/overview-summary.html";
		String line = "";
		
		try 
		{
			url = new URL(address);
			URLConnection conn = url.openConnection();
			
			System.out.println("conn.toString() : " + conn);
			System.out.println("getAllowUserInteraction() : " + conn.getAllowUserInteraction());
			System.out.println("getConnectTimeout() : " + conn.getConnectTimeout());
			System.out.println("getContent() : " + conn.getContent());
			System.out.println("getContentEncoding() : " + conn.getContentEncoding());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
