package javase.cls.collection;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo01 {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(); // treesetΪ�����ţ�hashsetΪ������
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		System.out.println("set����:" + set);
	}

}
