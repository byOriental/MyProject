package javase.obj.advanced;

/**
 * 
 * @Title:ObjectDemo02
 * @Description:obj�����ַ�������
 * @author:Administrator
 * @date:2017��9��9�� ����3:44:19
 */
public class ObjectDemo02 {

	public static void main(String[] args) {
		String str[] = { "����", "����", "����", "����" };
		Object obj = str;
		print(obj);
	}

	public static void print(Object obj) {
		if (obj instanceof String[]) {// ���ж��Ƿ�Ϊ�ַ�������
			String str1[] = (String[]) obj;// ����ת��
			System.out.println("�����б�:");
			for (int i = 0; i < str1.length; i++) {
				System.out.print(str1[i] + "\t");
			}
		}
	}
}
