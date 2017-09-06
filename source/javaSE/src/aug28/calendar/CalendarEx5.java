package aug28.calendar;

import java.util.*;

class  CalendarEx5
{
	public static void main(String[] args) 
	{
		Calendar date = Calendar.getInstance();

		date.set(2015, 11, 31);	// 2015�� 12�� 31��
		System.out.println(toString(date));
		date.roll(Calendar.MONTH, 1);
		//date.add(Calendar.MONTH, 1);
		System.out.println(toString(date));
		
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"�� "+ (date.get(Calendar.MONTH)+1) + "�� " + date.get(Calendar.DATE) + "��";
	}
}




