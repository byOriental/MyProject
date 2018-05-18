package javase.cls.collection;

import java.util.LinkedList;

/**
 * 
 * @Title:LinkedListDemo
 * @Description:链表（先进先出），父类List
 * @author:Administrator
 * @date:2017年9月14日 上午10:38:15
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> lk = new LinkedList<String>();
		lk.add("A");
		lk.add("B");
		lk.add("C");
		System.out.println(lk);
		lk.addFirst("X");
		lk.addLast("Y");
		System.out.println(lk);
		System.out.println("表头：" + lk.peek());
		System.out.println("表头：" + lk.element());
		System.out.println("弹出表头：" + lk.poll());// 弹出表头
		System.out.println("lk内容：" + lk);

		// 先进先出输出内容
		for (int i = 0; i < lk.size() + 1; i++) {
			System.out.println("先进先出：" + lk.poll() + "、");
		}
	}
}
