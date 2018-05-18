package com.bjsxt.converter;

import java.awt.Point;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

/**
 * 
 * @Title:MyPointConverter
 * @Description:定义自己转换器
 * @author:Administrator
 * @date:2017年12月28日 下午1:39:25
 */
public class MyPointConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		// values为前台传过来的参数，toClass为转换的目标参数
		Point p = new Point();
		String[] strs = (String[]) values;
		String[] xy = strs[0].split(",");
		p.x = Integer.parseInt(xy[0]);
		p.y = Integer.parseInt(xy[1]);
		return p;

	}

	@Override
	public String convertToString(Map context, Object o) {
		// TODO Auto-generated method stub
		return o.toString();
	}

}
