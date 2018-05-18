package javase.enumeration;

public class PrinEnum {
	public static void main(String args[]) {
		// Ö±½ÓÊä³ö
		System.out.println(Color.BLUE);
		for (Color c : Color.values()) {
			System.out.println(c);
		}
	}
}
