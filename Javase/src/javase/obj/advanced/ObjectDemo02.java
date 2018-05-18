package javase.obj.advanced;

/**
 * 
 * @Title:ObjectDemo02
 * @Description:obj接收字符串数组
 * @author:Administrator
 * @date:2017年9月9日 下午3:44:19
 */
public class ObjectDemo02 {

	public static void main(String[] args) {
		String str[] = { "张三", "李四", "王五", "刘六" };
		Object obj = str;
		print(obj);
	}

	public static void print(Object obj) {
		if (obj instanceof String[]) {// 先判断是否为字符串数组
			String str1[] = (String[]) obj;// 向下转型
			System.out.println("名单列表:");
			for (int i = 0; i < str1.length; i++) {
				System.out.print(str1[i] + "\t");
			}
		}
	}
}
