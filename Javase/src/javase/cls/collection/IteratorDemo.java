package javase.cls.collection;

/**
 * Iterator是集合进行输出的标准方式，不用get(i)
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

		Iterator<String> it = set.iterator();// collection有方法iterator()
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
