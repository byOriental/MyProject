package javase.obj.basic;

/**
 * 
*@Title:ClassComp
*@Description:����Ƚ�_this�ؼ���(�ص�����)
*@author:Administrator
*@date:2017��8��16�� ����2:26:16
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
	
	//����Ƚ�
	public boolean compare(PersonCP per){
		PersonCP per1=this;//�ѵ�ǰ���󸳸�per1  
		PersonCP per2=per;
		if(per1==per2){//1.�ж϶����ַ�Ƿ����(new���������������ַ��Զ�����)
			return true;
		}
		if(per1.name.equals(per2)&&per1.age==per2.age){  //�ַ��Ƚ�equals ֵ�Ƚ�==
			return true;
		}else{
			return false;
		}
	}
}
public class ObjectCpr {

	public static void main(String[] args) {
		PersonCP p1=new PersonCP("����", 20);
		PersonCP p2=new PersonCP("����", 20);
		if(p1.compare(p2)){
			System.out.println("����������");
		}else {
			System.out.println("�����������");
		}
	}

}
