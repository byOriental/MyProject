package javase.generics;

/**
 * 
*@Title:Point
*@Description:���������Լ����캯������
*@author:Administrator
*@date:2017��9��12�� ����4:10:13
 */

class Point<T>{
	private T x;
	private T y;
	public Point(T x,T y){
		this.x=x;
		this.y=y;
	}
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	
}
public class GenericsDemo01{
	public static void main(String[] args){
//		Point<Integer> p = new Point<Integer>();//ָ������
		Point<String> p1 =new Point<String>("������","������");
//		p.setX(80);//�Զ�װ��
//		p.setY(81);
//		int a=p.getX();//�Զ�����
//		int b=p.getY();
		String str1=p1.getX();
		String str2=p1.getY();
		System.out.println("����Ϊ��"+str1+"��"+str2);
	}
}
