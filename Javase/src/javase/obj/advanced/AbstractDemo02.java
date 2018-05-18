package javase.obj.advanced;

/**
 * 
*@Title:C
*@Description:Abstract������ �ļ̳�
*@author:Administrator
*@date:2017��8��28�� ����2:54:09
 */
abstract class C{
	private String name;
	private int age;
	
	public C(String name, int age) {
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
	public abstract void print();
	
}
class D extends C{
	private String school;
	
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public D(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	public void print(){ //ʵ�ֳ��󷽷�
		System.out.println("name:"+super.getName()+"\nage:"+super.getAge()
				+"\nschool"+this.getSchool());
	}
}
public class AbstractDemo02 {

	public static void main(String[] args) {
		D d=new D("HUI", 23, "�����ѧ");
		d.print();

	}

}
