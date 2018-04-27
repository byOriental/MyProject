package springTestIOC;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.by.shop.model.Category;
import com.by.shop.service.CategoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")
public class CategoryServiceImplTest {

	@Resource
	private CategoryService categoryService;

	@Test
	public void testQueryJoinAccount() {
		for (Category c : categoryService.queryJoinAccount("", 1, 3)) {
			System.out.println(c + "," + c.getAccount()); // 打印Category对象
			// System.out.println(c.getAccount().getName());//
			// 打印Category对象所级联的account对象
		}
	}
}
