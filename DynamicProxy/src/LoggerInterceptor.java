import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggerInterceptor implements InvocationHandler {// 注意实现这个Handler接口
	private Object target;// 目标对象的引用，这里设计成Object类型，更具通用性

	public LoggerInterceptor(Object target) {
		this.target = target;
	}

	/**
	 * 当我们调用代理类对象的方法时，这个“调用”会转送到invoke方法中，代理类对象作为proxy参数传入，
	 * 参数method标识了我们具体调用的是代理类的哪个方法，args为这个方法的参数。
	 * 这样一来，我们对代理类中的所有方法的调用都会变为对invoke的调用，这样我们可以在invoke方法中添加统一
	 * 的处理逻辑(也可以根据method参数对不同的代理类方法做不同的处理)。因此我们只需在中介类的invoke方法
	 * 实现中输出“before”，然后调用委托类的invoke方法，再输出“after”。
	 * 
	 * 中介类持有一个委托类对象引用，在invoke方法中调用了委托类对象的相应方法（即代理类方法）
	 * 通过聚合方式持有委托类对象引用，把外部对invoke的调用最终都转为对委托类对象的调用。
	 * 实际上，中介类与委托类构成了静态代理关系，在这个关系中，中介类是代理类，委托类就是委托类;
	 * 代理类与中介类也构成一个静态代理关系，在这个关系中，中介类是委托类，代理类是代理类。
	 * 也就是说，动态代理关系由两组静态代理关系组成，这就是动态代理的原理。
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] arg)
			throws Throwable {
		System.out.println("Entered " + target.getClass().getName() + "-"
				+ method.getName() + ",with arguments{" + arg[0] + "}");
		System.out.println("Before");
		Object result = method.invoke(target, arg);// 调用目标对象的方法(实际为AppServiceImpl)
		System.out.println("After");
		return result;
	}
}