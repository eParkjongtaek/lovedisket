package aug30;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerFileEx {

	public static void main(String[] args) {
		
		Scanner scan = null;
		try 
		{
			scan = new Scanner(new File("C:\\data\\scan.txt"));
			while(scan.hasNext())
			{
				System.out.printf("½ºÄµ : %s %n", scan.next());
			}
			scan.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		finally
		{
			if(scan != null) scan.close();
		}

	}

}
