package javase.obj.basic;

/**
 * 
*@Title:Person2
*@Description:对象的封装性
*@author:Administrator
*@date:2017年8月15日 上午12:02:10
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
		Person2 p1=new Person2("wangwu",25);//通过构造方法初始化属性最佳
//		p.setAge(20);
//		p.setName("zhangsan");
		p.print();
		p1.print();

	}

}
