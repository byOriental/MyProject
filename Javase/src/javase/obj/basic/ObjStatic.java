package javase.obj.basic;

/**
 * 
*@Title:Student
*@Description:static�ؼ���
*@author:Administrator
*@date:2017��8��16�� ����3:17:25
 */
class Student{
	private String name;
	private int age;
	private static String country="����"; 
	
	
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
	//���
	public void prinInfo(){
		System.out.println("������"+this.name+"\n���䣺"+this.age+"\n���У�"+this.country);
	}
	
	
}
public class ObjStatic {
	public static void main(String args[]){
		Student std1 = new Student("����", 23);
		Student std2 = new Student("����", 28);
		Student.setCountry("�Ϻ�");//static�����������
		std1.prinInfo();
		
	}

}
