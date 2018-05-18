package javase.obj.advanced;

/**
 * 
*@Title:ObjectDemo01
*@Description:接口多态应用
*@author:Administrator
*@date:2017年9月9日 下午3:24:48
 */
interface ObjItf{
	public void print();
}
class ObjItfCl implements ObjItf{
	public void print(){
		System.out.println();
	}
}
public class ObjectDemo01 {

	public static void main(String[] args) {
		ObjItf obj1=new ObjItfCl();//向上转型
		Object obj=obj1;//向上转型
		ObjItf obj2=(ObjItf)obj;//向下转型
		obj2.print();
	}

}
