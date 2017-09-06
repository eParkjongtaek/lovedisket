package aug28;

import java.util.Calendar;
import java.util.Date;
import java.sql.Timestamp;

import static java.lang.System.out;

public class CalendarEx1 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("���� ");
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		System.out.println(new Date());
		System.out.println(System.currentTimeMillis());
		System.out.println(new Timestamp(System.currentTimeMillis()));
		
		int week_yy = now.get(now.WEEK_OF_YEAR);
		int yy = now.getMaximum(now.YEAR);
		int mm = now.get(now.MONTH)+1; // 1���� 0�� ����Ѵ�.
		int dd = now.get(now.DAY_OF_MONTH);
		
		sb.append(week_yy);
		sb.append(" ��°�� ");
		sb.append(yy);
		sb.append(" �� ");
		sb.append(mm);
		sb.append(" �� ");
		sb.append(dd);
		sb.append("��");
		
		out.println(sb.toString());

	}

}
