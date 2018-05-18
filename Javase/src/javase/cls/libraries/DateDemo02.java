package javase.cls.libraries;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo02 {

	public static void main(String[] args) {
		String dateStr = "2009-09-13 10:13:22.358";// 定义日期字符串
		String patten1 = "yyyy年MM月dd日HH时mm分ss秒SSS毫秒";
		String patten2 = "yyyy-MM-dd HH:mm:ss.SSS";
		SimpleDateFormat s1 = new SimpleDateFormat(patten1);
		SimpleDateFormat s2 = new SimpleDateFormat(patten2);
		Date d = null;
		try {
			d = s2.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(s1.format(d));

	}

}
