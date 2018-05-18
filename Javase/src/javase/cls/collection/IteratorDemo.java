package javase.cls.collection;

/**
 * Iterator�Ǽ��Ͻ�������ı�׼��ʽ������get(i)
 */
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteratorDemo {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");

		Iterator<String> it = set.iterator();// collection�з���iterator()
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
