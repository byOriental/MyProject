import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggerInterceptor implements InvocationHandler {// ע��ʵ�����Handler�ӿ�
	private Object target;// Ŀ���������ã�������Ƴ�Object���ͣ�����ͨ����

	public LoggerInterceptor(Object target) {
		this.target = target;
	}

	/**
	 * �����ǵ��ô��������ķ���ʱ����������á���ת�͵�invoke�����У������������Ϊproxy�������룬
	 * ����method��ʶ�����Ǿ�����õ��Ǵ�������ĸ�������argsΪ��������Ĳ�����
	 * ����һ�������ǶԴ������е����з����ĵ��ö����Ϊ��invoke�ĵ��ã��������ǿ�����invoke���������ͳһ
	 * �Ĵ����߼�(Ҳ���Ը���method�����Բ�ͬ�Ĵ����෽������ͬ�Ĵ���)���������ֻ�����н����invoke����
	 * ʵ���������before����Ȼ�����ί�����invoke�������������after����
	 * 
	 * �н������һ��ί����������ã���invoke�����е�����ί����������Ӧ�������������෽����
	 * ͨ���ۺϷ�ʽ����ί����������ã����ⲿ��invoke�ĵ������ն�תΪ��ί�������ĵ��á�
	 * ʵ���ϣ��н�����ί���๹���˾�̬�����ϵ���������ϵ�У��н����Ǵ����࣬ί�������ί����;
	 * ���������н���Ҳ����һ����̬�����ϵ���������ϵ�У��н�����ί���࣬�������Ǵ����ࡣ
	 * Ҳ����˵����̬�����ϵ�����龲̬�����ϵ��ɣ�����Ƕ�̬�����ԭ��
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] arg)
			throws Throwable {
		System.out.println("Entered " + target.getClass().getName() + "-"
				+ method.getName() + ",with arguments{" + arg[0] + "}");
		System.out.println("Before");
		Object result = method.invoke(target, arg);// ����Ŀ�����ķ���(ʵ��ΪAppServiceImpl)
		System.out.println("After");
		return result;
	}
}