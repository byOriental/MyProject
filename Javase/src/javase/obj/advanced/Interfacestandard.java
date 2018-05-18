package javase.obj.advanced;
/**
 * 
*@Title:PolDemo05
*@Description:接口指定标准——电脑、打印机和u盘（重点）
*@author:Administrator
*@date:2017年8月28日 下午11:40:54
 */
interface USB{
	public abstract void start();
	public abstract void stop();
}
class Computer{
	public static void plugin(USB usb){//此处的类的静态方法相当于主方法定义的静态方法，父类参数接收所有的子类
		usb.start();//调用的方法为子类覆盖父类的方法
		usb.stop();
	}
}
class Flash implements USB{
	public void start(){
		System.out.println("U盘开始工作+++++++++");
	}
	public void stop(){
		System.out.println("U盘停止工作+++++++++");
	}
}
class Print implements USB{
	public void start(){
		System.out.println("打印机开始工作+++++++++");
	}
	public void stop(){
		System.out.println("打印机停止工作+++++++++");
	}
}
public class Interfacestandard {
	public static void main(String args[]){
		Computer.plugin(new Flash());
		System.out.println("---------------分割线-------------");
		Computer.plugin(new Print());
	}

}
