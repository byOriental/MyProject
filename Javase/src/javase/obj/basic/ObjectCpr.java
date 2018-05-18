package javase.obj.basic;

/**
 * 
*@Title:ClassComp
*@Description:对象比较_this关键字(重点掌握)
*@author:Administrator
*@date:2017年8月16日 下午2:26:16
 */
class PersonCP{
	private String name;
	private int age;
	public PersonCP(String name, int age) {
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
	
	//对象比较
	public boolean compare(PersonCP per){
		PersonCP per1=this;//把当前对象赋给per1  
		PersonCP per2=per;
		if(per1==per2){//1.判断对象地址是否相等(new出来的两个对象地址永远会相等)
			return true;
		}
		if(per1.name.equals(per2)&&per1.age==per2.age){  //字符比较equals 值比较==
			return true;
		}else{
			return false;
		}
	}
}
public class ObjectCpr {

	public static void main(String[] args) {
		PersonCP p1=new PersonCP("张三", 20);
		PersonCP p2=new PersonCP("张三", 20);
		if(p1.compare(p2)){
			System.out.println("相个对象相等");
		}else {
			System.out.println("两个对象不相等");
		}
	}

}
