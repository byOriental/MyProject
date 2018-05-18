package javase.obj.basic;

/**
 * 
*@Title:Person
*@Description:简单对象创建
*@author:Administrator
*@date:2017年8月14日 下午11:45:36
 */
class Person{
	int age;
	String name;
	public void print(int age,String name){
		System.out.println("age:"+age+"\n"+"name:"+name);
	}
}
public class ClassDemo01 {
	public static void main(String args[]){
		Person p=new Person();
		p.print(23,"张三");
		
	}

}
