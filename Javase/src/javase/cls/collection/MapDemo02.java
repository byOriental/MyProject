package javase.cls.collection;

/**
 * Map�����е�ֵһ��ʹ�ýӿ�map.entry�������
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("�ٶ�", "www.baidu.com");
		map.put("�ȸ�", "www.google.com");
		map.put("�Ա�", "www.taobao.com");

		Set<Map.Entry<String, String>> set = map.entrySet();// ����һ��set���ϣ�����ֵΪmap.entry����
		Iterator<Map.Entry<String, String>> it = set.iterator();

		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();// ȡ��ÿһ��map.entry�ӿڶ���
			System.out.println(me.getKey() + "-->" + me.getValue());
		}
	}
}
