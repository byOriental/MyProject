public class AppServiceImpl implements AppService {
	public boolean createApp(String name) {
		System.out.println("App[" + name + "] has been created.");
		return true;
	}
}
