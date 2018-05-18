package use.rgist.ck;

import java.util.HashMap;
import java.util.Map;

public class Register {
	private String name;
	private String age;
	private String email;

	private Map<String, String> error = null;

	public Register() {
		this.name = "";
		this.age = "";
		this.email = "";
		this.error = new HashMap<String, String>();
	}

	public boolean isValidate() {
		boolean flag = true;
		if (!this.name.matches("\\w(6,15)")) {
			flag = false;
			name = "";
			error.put("errname", "用户名是6-16位的字母或者数字！");
		}
		if (!this.age.matches("\\d+")) {
			flag = false;
			age = "";
			error.put("errage", "年龄只能为数字！");
		}
		if (!this.email.matches("\\w+@\\w+\\.\\w+\\.?\\w*")) {
			flag = false;
			email = "";
			error.put("erremail", "邮箱格式不正确！");
		}

		return flag;
	}

	public String getErrorMsg(String key) {
		String value = this.error.get(key);
		return value == null ? "" : value;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
