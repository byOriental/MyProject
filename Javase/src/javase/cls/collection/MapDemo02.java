package javase.cls.collection;

/**
 * Map集合中的值一般使用接口map.entry进行输出
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("百度", "www.baidu.com");
		map.put("谷歌", "www.google.com");
		map.put("淘宝", "www.taobao.com");

		Set<Map.Entry<String, String>> set = map.entrySet();// 返回一个set集合，里面值为map.entry对象
		Iterator<Map.Entry<String, String>> it = set.iterator();

		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();// 取出每一个map.entry接口对象
			System.out.println(me.getKey() + "-->" + me.getValue());
		}
	}
}
