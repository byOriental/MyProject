package javase.obj.advanced;

/**
 * 
*@Title:PolDemo01
*@Description:多态——子类指向父类、父类指向子类
*@author:Administrator
*@date:2017年8月28日 下午3:23:58
 */
class M{
	private String name;
	private int age;
	public M(String name, int age) {
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
	public void print1(){
		System.out.println("this is class M");
	}
	public void print2(){
		System.out.println("name:"+this.getName()+"\nage:"+this.getAge());
	}
}
class N extends M{
	public static final String FLAG="USA";
	private String school;
	public N(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public void print1(){
		System.out.println("this is class N");
	}
	public void print3(){
		System.out.println("country:"+this.FLAG+"\nschool:"+this.getSchool());
	}
}
public class PolDemo01 {
	public static void main(String[] args) {
		N n=new N("zs",27,"MIT");
		n.print1();  
		M m=n;  //向上转型
		m.print1();  //只能调用被覆盖的方法
		m.print2();  
//		m.print3();  不能调用子类方法
		
		M m1=new N("ls",37,"beijing");//向上转型
		N n2=(N) m1;  //向下转型
		n2.print1();
		n2.print2();
		n2.print3();

	}

}
