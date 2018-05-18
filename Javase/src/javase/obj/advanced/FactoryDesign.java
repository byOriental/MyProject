package javase.obj.advanced;

/**
 * 
*@Title:FactoryDesign
*@Description:������ƣ��ص����գ�
*@author:Administrator
*@date:2017��8��29�� ����12:06:43
 */
interface Fruit{
	public abstract void eat();
}
class Apple implements Fruit{
	public void eat(){
		System.out.println("��ƻ����������������������������������������������������������");
	}
}
class Orange implements Fruit{
	public void eat(){
		System.out.println("���㽶++++++++++++++++++++++++++++");
	}
}
class Factory{
	public static Fruit getInstance(String classname){ //�����ھ�̬�����ĸ����������������
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
		System.out.println("---------------�ָ���-------------");
		Fruit f2=Factory.getInstance("orange");
		f2.eat();

	}

}
