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

		lst.addAll(cl);// ���һ�����ϵ���һ��������ȥ
		System.out.println(lst);// һ�������

		for (int i = 0; i < lst.size(); i++) { // ѭ��������������飬get������ȡindex���
			System.out.println(lst.get(i));
		}

	}

}