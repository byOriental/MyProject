package javase.obj.basic;

/**
 * 
*@Title:Person2
*@Description:����ķ�װ��
*@author:Administrator
*@date:2017��8��15�� ����12:02:10
 */
class Person2{
	
	private String name;
	private int age;
	public Person2() {	}
	public Person2(String name,int age){
		this.setName(name);
		this.setAge(age);
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
	public void print(){
		System.out.println("name:"+name+"\nage:"+age);
	}
}
public class ClassDemo03 {

	public static void main(String[] args) {
		Person2 p=new Person2();
		Person2 p1=new Person2("wangwu",25);//ͨ�����췽����ʼ���������
//		p.setAge(20);
//		p.setName("zhangsan");
		p.print();
		p1.print();

	}

}
