package javase.obj.advaced.Pet;
/**
 * 
*@Title:PetShopMain
*@Description:��������ۺϣ��ص㣩
*@author:Administrator
*@date:2017��9��9�� ����2:55:39
 */
public class PetShopMain {

	public static void main(String[] args) {
		PetShop ps = new PetShop(5);
		ps.add(new Cat("��è", "��ɫ", 3));
		ps.add(new Cat("��è","��ɫ",5));
		ps.add(new Cat("��è","��ɫ",1));
		ps.add(new Dog("�ƹ�", "��ɫ", 5));
		ps.add(new Dog("С��", "��ɫ", 3));
		ps.add(new Dog("С��", "��ɫ", 5));
		print(ps.search("��"));
		
	}
	public static void print(Pet p[]){
		for(int i=0;i<p.length ;i++){
			if(p[i]!=null){
				System.out.println(p[i].getName()+","+p[i].getColor()+","+p[i].getAge());
			}
		}
	}

}
