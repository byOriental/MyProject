package javase.obj.advanced;

/**
 * 
*@Title:FactoryDesign
*@Description:工厂设计（重点掌握）
*@author:Administrator
*@date:2017年8月29日 上午12:06:43
 */
interface Fruit{
	public abstract void eat();
}
class Apple implements Fruit{
	public void eat(){
		System.out.println("吃苹果————————————————————————————");
	}
}
class Orange implements Fruit{
	public void eat(){
		System.out.println("吃香蕉++++++++++++++++++++++++++++");
	}
}
class Factory{
	public static Fruit getInstance(String classname){ //类似于静态方法的父类对象接收子类对象
		Fruit fruit=null;
		if("apple".equals(classname)){
			fruit=new Apple();
		}
		if("orange".equals(classname)){
			fruit=new Orange();
		}
		return fruit;
	}
}
public class FactoryDesign {

	public static void main(String[] args) {
		Fruit f1=Factory.getInstance("apple");  
		f1.eat();
		System.out.println("---------------分割线-------------");
		Fruit f2=Factory.getInstance("orange");
		f2.eat();

	}

}
