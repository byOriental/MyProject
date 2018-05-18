package javase.obj.basic;

/**
 * 
*@Title:Student
*@Description:static关键字
*@author:Administrator
*@date:2017年8月16日 下午3:17:25
 */
class Student{
	private String name;
	private int age;
	private static String country="北京"; 
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		Student.country = country;
	}
	//输出
	public void prinInfo(){
		System.out.println("姓名："+this.name+"\n年龄："+this.age+"\n城市："+this.country);
	}
	
	
}
public class ObjStatic {
	public static void main(String args[]){
		Student std1 = new Student("張三", 23);
		Student std2 = new Student("李四", 28);
		Student.setCountry("上海");//static属性由类调用
		std1.prinInfo();
		
	}

}
