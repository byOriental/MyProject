package javase.cls.libraries;

/**
 * �������Լ����ڵĸ�ʽ�������ã�
 * 
 */
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD,
				new Locale("zh", "CN"));
		DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD,
				DateFormat.MONTH_FIELD, new Locale("zh", "CN"));
		System.out.println("���ڸ�ʽһ��" + df1.format(new Date()));
		System.out.println("���ڸ�ʽ����" + df2.format(new Date()));

	}

}
