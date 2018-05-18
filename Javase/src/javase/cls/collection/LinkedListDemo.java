package javase.cls.collection;

import java.util.LinkedList;

/**
 * 
 * @Title:LinkedListDemo
 * @Description:�����Ƚ��ȳ���������List
 * @author:Administrator
 * @date:2017��9��14�� ����10:38:15
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
		System.out.println("��ͷ��" + lk.peek());
		System.out.println("��ͷ��" + lk.element());
		System.out.println("������ͷ��" + lk.poll());// ������ͷ
		System.out.println("lk���ݣ�" + lk);

		// �Ƚ��ȳ��������
		for (int i = 0; i < lk.size() + 1; i++) {
			System.out.println("�Ƚ��ȳ���" + lk.poll() + "��");
		}
	}
}
