package javase.obj.basic;

class Child{
	private String name;
	

	public Child(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class ObjArry {

	public static void main(String[] args) {
		Child child[]=new Child[4];//开辟对象数组空间
		for(int i=0;i<child.length;i++){//往空间对方数据
			child[0]=new Child("张三");
			child[1]=new Child("李四");
			child[2]=new Child("王五");
			child[3]=new Child("赵六");
		}
		for(int i=0;i<child.length;i++){
			System.out.println(child[i].getName());
		}
		
	}

}
