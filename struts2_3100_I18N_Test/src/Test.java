import java.util.Locale;
import java.util.ResourceBundle;

public class Test {
	public static void main(String[] args) {
		ResourceBundle res = ResourceBundle.getBundle("app", Locale.US);// ��app��Ҫ����Դ�ļ�ǰ׺һ��
		System.out.println(res.getString("pd.library"));
	}
}
