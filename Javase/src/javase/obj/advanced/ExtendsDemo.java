package javase.obj.advanced;


/**
 * 
*@Title:ExtendsDemo
*@Description:��ļ̳С�super�Լ�this�ؼ���
*@author:Administrator
*@date:2017��8��28�� ����1:57:21
 */

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
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
	public void getInfo(){
		System.out.println("name:"+this.getName()+"\n"+"age:"+this.getAge());
	}
	
}
class Student extends Person{
	private String school;
	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	public void getInfo(){  //������д
		super.getInfo();
		System.out.println("school:"+this.getSchool());
	}

}
public class ExtendsDemo {

	public static void main(String[] args) {
		Student student=new Student("lose", 38, "MIT");
		student.getInfo();
			
		// TODO Auto-generated method stub

	}

}
