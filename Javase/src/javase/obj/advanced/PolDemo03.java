package javase.obj.advanced;
/**
 * 
*@Title:PolDemo03
*@Description:ͨ������ʵ�����ӿڡ�������
*@author:Administrator
*@date:2017��8��28�� ����10:53:06
 */
abstract class F{
	public abstract void print();
}
interface K{
	abstract void print();
}
class H extends F{
	public void print(){
		System.out.println("+++++�̳г�����++++++");
	}
}
class J implements K{
	public void print(){
		System.out.println("+++++++ʵ�ֽӿ�++++++");
	}
}
public class PolDemo03 {
	public static void main(String args[]){
		F f=new H();
		f.print();
		K k=new J();
		k.print();
	}

}
