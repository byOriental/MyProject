package javase.cls.libraries;

/**
 * 日期类以及日期的格式化（常用）
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
		System.out.println("日期格式一：" + df1.format(new Date()));
		System.out.println("日期格式二：" + df2.format(new Date()));

	}

}
