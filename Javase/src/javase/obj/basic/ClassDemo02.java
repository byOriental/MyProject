package javase.obj.basic;

/**
 * 
*@Title:Person1
*@Description:�������ô���
*@author:Administrator
*@date:2017��8��14�� ����11:54:43
 */
class Person1{
	String name;
	int age;
	
	public void print(){
		System.out.println("name:"+name+"\nage:"+age);
	}
}
public class ClassDemo02 {

	public static void main(String[] args) {
		Person1 p1=new Person1();
		Person1 p2=new Person1();
		
		p1.name="����";
		p1.age=23;
		p2.name="����";
		p2.age=32;
		p1=p2;  //p1������ʵ�ʾ���p2
		p1.print();
		p2.print();

	}

}
