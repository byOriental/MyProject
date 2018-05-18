package javase.obj.advanced;
/**
 * 
*@Title:PolDemo04
*@Description:������ģ�塪�����˺�ѧ�����ص㣩
*@author:Administrator
*@date:2017��8��28�� ����11:10:28
 */
abstract class People{
	private String name;
	private int age;
	public People(String name, int age) {
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
//	public void say(){
//		this.getContent();
//	}
	public abstract void getContent();
}
class StudentMD extends People{
	private float score;
	public StudentMD(String name, int age, float score) {
		super(name, age);
		this.score = score;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public void getContent(){
		System.out.println("name:"+super.getName()+"\nage:"+super.getAge()
				+"\nscore:"+this.getScore());
	}
}
class Work extends People{
	private double salary;

	public Work(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void getContent(){
		System.out.println("name:"+super.getName()+"\nage:"+super.getAge()
				+"\nscore:"+this.getSalary());
	}
}

public class AbstractTemplate {

	public static void main(String[] args) {
		print(new StudentMD("ZS",22,98.5f));
		System.out.println("---------------�ָ���-------------");
		print(new Work("LS", 38, 8887.9f));
	}
	public static void print(People people){   //��������������
		people.getContent();
	}

}
