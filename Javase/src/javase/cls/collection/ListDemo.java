package javase.cls.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		Collection<String> cl = new ArrayList<String>();
		lst.add("zhongguo");
		lst.add("zhongqing");
		System.out.println(lst);
		cl.add("beijing");
		cl.add("gugong");
		System.out.println(cl);

		lst.addAll(cl);// 添加一个集合到另一个集合中去
		System.out.println(lst);// 一次性输出

		for (int i = 0; i < lst.size(); i++) { // 循环输出、类似数组，get方法获取index编号
			System.out.println(lst.get(i));
		}

	}

}