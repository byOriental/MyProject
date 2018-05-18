import java.util.Locale;
import java.util.ResourceBundle;

public class Test {
	public static void main(String[] args) {
		ResourceBundle res = ResourceBundle.getBundle("app", Locale.US);// “app”要和资源文件前缀一致
		System.out.println(res.getString("pd.library"));
	}
}
