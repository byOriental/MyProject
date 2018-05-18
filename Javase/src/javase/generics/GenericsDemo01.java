package javase.generics;

/**
 * 
*@Title:Point
*@Description:基本泛型以及构造函数泛型
*@author:Administrator
*@date:2017年9月12日 下午4:10:13
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
//		Point<Integer> p = new Point<Integer>();//指定泛型
		Point<String> p1 =new Point<String>("横坐标","纵坐标");
//		p.setX(80);//自动装箱
//		p.setY(81);
//		int a=p.getX();//自动拆箱
//		int b=p.getY();
		String str1=p1.getX();
		String str2=p1.getY();
		System.out.println("坐标为："+str1+"、"+str2);
	}
}
