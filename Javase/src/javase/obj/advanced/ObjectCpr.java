package javase.obj.advanced;

/**
 * 
*@Title:PeopleOne
*@Description:Object接收，对象比较。
*@author:Administrator
*@date:2017年9月13日 上午11:03:26
 */
class PeopleOne{
	private String name;
	private int age;
	public PeopleOne(String name, int age) {
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
	
	public boolean compr(Object obj){
		if(this==obj){
			return true;
		}
		if(!(obj instanceof PeopleOne)){//属于同类对象以后……
			return false;
		}
		PeopleOne person=(PeopleOne)obj;//开始对其属性进行比较
		if(person.getName().equals(this.name)&&
				person.getAge()==this.age){
			return true;
		}else{
			return false;
		}
	}
}
public class ObjectCpr {

	public static void main(String[] args) {
		PeopleOne p1=new PeopleOne("张三", 19);
		PeopleOne p2=new PeopleOne("李四",30);
		
		if(p1.compr(p2)){
			System.out.println("张三和李四是同一个人！");
		}else {
			System.out.println("张三和李四不是同一个人！");
		}
		// TODO Auto-generated method stub

	}

}
