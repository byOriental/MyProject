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
		Child child[]=new Child[4];//���ٶ�������ռ�
		for(int i=0;i<child.length;i++){//���ռ�Է�����
			child[0]=new Child("����");
			child[1]=new Child("����");
			child[2]=new Child("����");
			child[3]=new Child("����");
		}
		for(int i=0;i<child.length;i++){
			System.out.println(child[i].getName());
		}
		
	}

}
