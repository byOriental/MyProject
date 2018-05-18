package javase.obj.advanced;

/**
 * 
*@Title:PeopleOne
*@Description:Object���գ�����Ƚϡ�
*@author:Administrator
*@date:2017��9��13�� ����11:03:26
 */
class PeopleOne{
	private String name;
	private int age;
	public PeopleOne(String name, int age) {
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
	
	public boolean compr(Object obj){
		if(this==obj){
			return true;
		}
		if(!(obj instanceof PeopleOne)){//����ͬ������Ժ󡭡�
			return false;
		}
		PeopleOne person=(PeopleOne)obj;//��ʼ�������Խ��бȽ�
		if(person.getName().equals(this.name)&&
				person.getAge()==this.age){
			return true;
		}else{
			return false;
		}
	}
}
public class ObjectCpr {

	public static void main(String[] args) {
		PeopleOne p1=new PeopleOne("����", 19);
		PeopleOne p2=new PeopleOne("����",30);
		
		if(p1.compr(p2)){
			System.out.println("������������ͬһ���ˣ�");
		}else {
			System.out.println("���������Ĳ���ͬһ���ˣ�");
		}
		// TODO Auto-generated method stub

	}

}
