package javase.enumeration;

public class PrinEnum {
	public static void main(String args[]) {
		// ֱ�����
		System.out.println(Color.BLUE);
		for (Color c : Color.values()) {
			System.out.println(c);
		}
	}
}
