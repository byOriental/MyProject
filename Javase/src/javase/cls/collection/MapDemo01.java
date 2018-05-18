package javase.cls.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("∞Ÿ∂»", "www.baidu.com");
		map.put("π»∏Ë", "www.google.com");
		map.put("Ã‘±¶", "www.taobao.com");

		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + "-->" + map.get(key));
		}

	}
}
