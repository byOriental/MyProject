package javase.obj.basic;

/**
 * 
*@Title:Person1
*@Description:对象引用传递
*@author:Administrator
*@date:2017年8月14日 下午11:54:43
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
		
		p1.name="张三";
		p1.age=23;
		p2.name="李四";
		p2.age=32;
		p1=p2;  //p1操作的实际就是p2
		p1.print();
		p2.print();

	}

}
